package patterns.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Lernik Mirzoyan.
 */
public class TestIterator {
	public static void main(String[] args) {
		List<Person> fourthPosterity1 = new ArrayList<>();
		fourthPosterity1.add(new Person("fourth posterity, Person 1"));

		List<Person> thirdPosterity1 = new ArrayList<>();
		thirdPosterity1.add(new Person("third posterity, Person 1"));
		thirdPosterity1.add(new Person("third posterity, Person 2"));
//		thirdPosterity1.add(new Person("third posterity, Person 2", fourthPosterity1));

		List<Person> thirdPosterity2 = new ArrayList<>();
		thirdPosterity2.add(new Person("third posterity, Person 3"));
		thirdPosterity2.add(new Person("third posterity, Person 4"));

		List<Person> thirdPosterity3 = new ArrayList<>();
		thirdPosterity3.add(new Person("third posterity, Person 5"));
		thirdPosterity3.add(new Person("third posterity, Person 6"));

		List<Person> thirdPosterity4 = new ArrayList<>();
		thirdPosterity4.add(new Person("third posterity, Person 7"));

		List<Person> thirdPosterity5 = new ArrayList<>();
		thirdPosterity5.add(new Person("third posterity, Person 8"));

		List<Person> thirdPosterity6 = new ArrayList<>();
		thirdPosterity6.add(new Person("third posterity, Person 9"));


		List<Person> secondPosterity1 = new ArrayList<>();
		secondPosterity1.add(new Person("second posterity, Person 1", thirdPosterity1));
		secondPosterity1.add(new Person("second posterity, Person 2", thirdPosterity2));
		secondPosterity1.add(new Person("second posterity, Person 3", thirdPosterity3));

		List<Person> secondPosterity2 = new ArrayList<>();
		secondPosterity2.add(new Person("second posterity, Person 4", thirdPosterity4));
		secondPosterity2.add(new Person("second posterity, Person 5", thirdPosterity5));
		secondPosterity2.add(new Person("second posterity, Person 6", thirdPosterity6));


		List<Person> firstPosterity = new ArrayList<>();
		firstPosterity.add(new Person("first posterity, Person 1", secondPosterity1));
		firstPosterity.add(new Person("first posterity, Person 2", secondPosterity2));
		Person person = new Person("Vardges", firstPosterity);
		int a = 0;
		for (List<Person> children : person) {
			System.out.println(++a + " posterity: ");
			for ( Person p : children){
				System.out.println(p.name);
			}
		}
		a = 0;
		System.out.println();
		for (List<Person> children : person) {
			System.out.println(++a + " posterity: ");
			for ( Person p : children){
				System.out.println(p.name);
			}
		}

	}
}
