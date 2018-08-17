package factory.client;

import factory.api.User;
import factory.Util;
import factory.api.Entity;
import factory.api.Notification;
import factory.api.NotificationFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by astghik.mamunc on 8/10/2018.
 */
public class ActivityNotificationFactory implements NotificationFactory {
	@Override
	public Notification resolveNotificaion(Entity entity, User from, String nextState) {

		String systemName = entity.getMetacategotyName();

		List<User> receivers = Util.entityUsersRelation.get(systemName);

		Map<String, String> notificationParams = new HashMap<>();
		notificationParams.put("projectname", entity.getMetacategotyName());
		notificationParams.put("username", from.getFirstName());
		notificationParams.put("nextState", nextState);

		Notification notification = new Notification(receivers, new ArrayList<>(), entity.getId(), notificationParams);
		return notification;
	}
}
