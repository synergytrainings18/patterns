package iterator;

import iterator.model.Notification;

/**
 * Created by astghik.mamunc on 6/19/2018.
 */
public class NotificationCollection implements Iterable<NotificationIterator> {

    static final int capacity = 6;

    int nextIndex = 0;

    Notification[] notificationList;

    public NotificationCollection() {
        notificationList = new Notification[capacity];
    }

    public void addItem(String str) {
        Notification notification = new Notification(str);
        if (nextIndex >= capacity)
            System.err.println("Collection is fully filled");
        else {
            notificationList[nextIndex] = notification;
            nextIndex ++;
        }
    }

    @Override
    public NotificationIterator createIterator() {
        return new NotificationIterator(notificationList);
    }
}
