package factory.test;

import factory.*;
import factory.api.NotificationResolver;
import factory.client.ActivityNotificationResolver;
import factory.client.MetacategoryNames;
import factory.client.ProjectNotificationResolver;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by astghik.mamunc on 8/10/2018.
 */
public class TetstNotificationFactory {

	@Test
	public void testActivityNotificationFactory(){
		NotificationResolver notificationResolver = NotificationFactory.createNotificationResolver(MetacategoryNames.ACTIVITY);
		Assert.assertEquals("notificationResolver must be ActivityNotificationResolver", ActivityNotificationResolver.class, notificationResolver.getClass());
	}

	@Test
	public void testProjectNotificationFactory(){
		NotificationResolver notificationResolver = NotificationFactory.createNotificationResolver(MetacategoryNames.PROJECT);
		Assert.assertEquals("notificationResolver must be ProjectNotificationResolver", ProjectNotificationResolver.class, notificationResolver.getClass());
	}
}
