package factory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by astghik.mamunc on 8/10/2018.
 */
public class Util {

	public static Map<String, List<User>> entityUsersRelation;

	{
		List<User> users = new ArrayList<>();
		users.add(new User("User1", "user1@mail.ru"));
		users.add(new User("User2", "user2@mail.ru"));
		users.add(new User("User3", "user3@mail.ru"));
		entityUsersRelation.put("Activity", users);

		List<User> projectUsers = new ArrayList<>();
		projectUsers.add(new User("User4", "user4@mail.ru"));
		projectUsers.add(new User("User5", "user5@mail.ru"));
		projectUsers.add(new User("User6", "user6@mail.ru"));
		entityUsersRelation.put("Project", projectUsers);
	}
}
