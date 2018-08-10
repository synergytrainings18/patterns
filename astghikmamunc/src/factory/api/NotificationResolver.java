package factory.api;

import factory.User;
import factory.api.Notification;

import java.util.Map;

/**
 * Created by astghik.mamunc on 8/10/2018.
 */
public interface NotificationResolver {
	Notification resolveNotificaion(Entity entity, User from);
}
