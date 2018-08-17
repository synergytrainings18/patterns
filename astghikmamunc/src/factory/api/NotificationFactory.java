package factory.api;

/**
 * Created by astghik.mamunc on 8/10/2018.
 */
public interface NotificationFactory {
	Notification resolveNotificaion(Entity entity, User from, String nextState);
}
