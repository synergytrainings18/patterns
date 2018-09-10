package Facade;

public class ApplicationNotificationService implements NotificationService {
    @Override
    public void notify(String message) {
        System.out.println("Application notified message " + message);
    }
}
