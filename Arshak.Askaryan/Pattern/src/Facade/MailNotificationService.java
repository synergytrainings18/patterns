package Facade;

public class MailNotificationService implements NotificationService {
    @Override
    public void notify(String message) {
        System.out.println("Mail notified message " + message);
    }
}
