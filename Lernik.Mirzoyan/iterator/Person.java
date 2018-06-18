package patterns.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Lernik Mirzoyan.
 */
public class Person implements Iterable<List<Person>> {
	String name;
	List<Person> children = new ArrayList<>();
	@Override
	public Iterator<List<Person>> iterator() {
		return new Iterator<List<Person>>() {
			List<Person> current = children;
			@Override
			public boolean hasNext() {
				return current != null && current.size() > 0;
			}

			@Override
			public List<Person> next() {
				List<Person> newList = new ArrayList<>();
				for (Person person : current){
					newList.addAll(person.children);
				}
				List<Person> temp = current;
				current = newList;
				return temp;
			}

			@Override
			public void remove() {
				throw new UnsupportedOperationException();
			}
		};
	}

	@Override
	public String toString() {
		return name;
	}

	public Person(String name) {
		this.name = name;
	}

	public Person(String name, List<Person> children) {
		this.name = name;
		this.children = children;
	}
}
