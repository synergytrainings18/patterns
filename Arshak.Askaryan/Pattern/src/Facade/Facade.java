package Facade;

public class Facade {
    private UserService userService;
    private AmazonSNSClient snsClient;
    @Autowired
    private NotificationDao notificationDao;

    @Value("${mail.smtp.host}")
    private String host;

    @Value("${mail.smtp.port}")
    private String port;

    @Value("${mail.smtp.email}")
    private String email;

    @Value("${mail.smtp.password}")
    private String password;


    public Facade() {
        this.userService = new UserService();
        BasicAWSCredentials credentials = new BasicAWSCredentials(accessKey, secretKey);
        snsClient = new AmazonSNSClient(credentials);
    }

    public void notify(String message){
        for(User.NotifiactionType notifiactionType : userService.getUser().getNotifiactionTypes()){
            switch (notifiactionType){
                case SMS:
                    sendSmsNotification(message);
                    break;
                case MAIL:
                    sendEmailNotification(message);
                    break;
                case APPLIACATION:
                    sendApplicationNotification(message);
                    break;
            }
        }
    }

    private void sendApplicationNotification(String message) {
        notificationDao.saveNotifiaction(new Notifiaction(message, userService.getUser().getId()));

    }

    private void sendSmsNotification(String message) {
        snsClient.publish(new PublishRequest()
                .withMessage(message)
                .withPhoneNumber(userService.getUser().getPhoneNumber()));
    }

    public void sendEmailNotification(String message){
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", port);
        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(email, password);
                    }
                });
        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(email));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(userService.getUser().getEmail()));
            message.setSubject("Subject");
            message.setText(message);
            Transport.send(message);
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }

}
