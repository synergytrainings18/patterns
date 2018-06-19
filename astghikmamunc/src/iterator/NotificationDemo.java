package iterator;

import iterator.model.Notification;

/**
 * Created by astghik.mamunc on 6/19/2018.
 */
public class NotificationDemo {

    public static void main(String[] args) {

        NotificationCollection notificationCollection = new NotificationCollection();
        notificationCollection.addItem("Notify 1");
        notificationCollection.addItem("Notify 2");
        notificationCollection.addItem("Notify 3");
        notificationCollection.addItem("Notify 4");

        Iterator<Notification> iterator = notificationCollection.createIterator();

        while (iterator.hasNext()) {
            Notification notification = iterator.next();
            System.out.println(notification.getNotification());
        }
    }
}
