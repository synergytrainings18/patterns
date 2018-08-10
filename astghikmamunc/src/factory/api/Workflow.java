package factory.api;

import factory.User;

import java.util.Map;

/**
 * Created by astghik.mamunc on 8/10/2018.
 */
public class Workflow {

	public NotificationResolver notificationResolver;

	public Workflow(NotificationResolver notificationResolver) {
		this.notificationResolver = notificationResolver;
	}

	public void doActionAndSendNotification(Integer actionId, Entity entity, User user){
		doAction(actionId);

		Notification notification = notificationResolver.resolveNotificaion(entity, user);

		sendNotification(notification);
	}

	public void doAction(Integer actionId){
		// do Action
	}

	public void sendNotification(Notification notification){
		// send this notification
	}

}
