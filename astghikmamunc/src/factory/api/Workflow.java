package factory.api;

/**
 * Created by astghik.mamunc on 8/10/2018.
 */
public class Workflow {

	public NotificationFactory notificationFactory;

	public Workflow(NotificationFactory notificationFactory) {
		this.notificationFactory = notificationFactory;
	}

	public void doActionAndSendNotification(Integer actionId, Entity entity, User user){

		String nextState = doAction(actionId);

		if(nextState != null) {
			Notification notification = notificationFactory.resolveNotificaion(entity, user, nextState);
			sendNotification(notification);
		}

	}

	public String doAction(Integer actionId){
		// do Action
		String nextState = "Next STate";
		return nextState;
	}

	public void sendNotification(Notification notification){
		// send this notification
	}

}
