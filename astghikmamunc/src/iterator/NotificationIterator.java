package iterator;

import iterator.model.Notification;

/**
 * Created by astghik.mamunc on 6/19/2018.
 */
public class NotificationIterator implements Iterator<Notification> {

    Notification[] notificationList;

    int position = 0;

    public NotificationIterator(Notification[] notificationList) {
        this.notificationList = notificationList;
    }

    @Override
    public boolean hasNext() {
       return position < notificationList.length && notificationList[position] != null;
    }

    @Override
    public Notification next() {
        Notification notification =  notificationList[position];
        position ++;
        return notification;
    }
}
