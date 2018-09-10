package Facade;

public class Facade {
    private ApplicationNotificationService applicationNotificationService;
    private MailNotificationService mailNotificationService;
    private SMSNotificationService smsNotificationService;
    private UserService userService;

    public Facade() {
        this.applicationNotificationService = new ApplicationNotificationService();
        this.mailNotificationService = new MailNotificationService();
        this.smsNotificationService = new SMSNotificationService();
        this.userService = new UserService();
    }

    public void notify(String message){
        for(User.NotifiactionType notifiactionType : userService.getUser().getNotifiactionTypes()){
            switch (notifiactionType){
                case SMS:
                    smsNotificationService.notify(message);
                    break;
                case MAIL:
                    mailNotificationService.notify(message);
                    break;
                case APPLIACATION:
                    applicationNotificationService.notify(message);
                    break;
            }
        }
    }
}
