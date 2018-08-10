package factory;

import factory.api.NotificationResolver;
import factory.client.ActivityNotificationResolver;
import factory.client.MetacategoryNames;
import factory.client.ProjectNotificationResolver;

/**
 * Created by astghik.mamunc on 8/10/2018.
 */
public class NotificationFactory {

	public static NotificationResolver createNotificationResolver(MetacategoryNames category){
		switch (category){
			case ACTIVITY:
				return new ActivityNotificationResolver();
			case PROJECT:
				return new ProjectNotificationResolver();
			default:
				throw new IllegalArgumentException(String.format("Unsupported category %s ", category));
		}
	}
}
