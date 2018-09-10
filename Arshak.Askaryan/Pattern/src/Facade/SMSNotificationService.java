package Facade;

public class SMSNotificationService implements NotificationService {
    @Override
    public void notify(String message) {
        System.out.println("SMS notified message " + message);
    }
}
