package com.celebrity;

import java.util.List;

public class Celebrity {

	/**
	 * Find celebrity method.
	 * 
	 * Runs two iteration over people list to compare each position on the list to
	 * the rest of the collection, if all list has been compared and the current
	 * position knows no people on the list, returns that object, otherwise the
	 * second loop continues. If no celebrity is discovered, returns null.
	 * 
	 * @param people list of Person
	 * @return Person who will be known as celebrity.
	 */
	public Person findCelebrity(List<Person> people) {
		Person celebrity = null;
		for (int i = 0; i < people.size(); i++) {
			int j = 0;
			for (Person person : people) {
				if (!people.get(i).knowsPerson(person)) {
					j++;
					if (j == people.size()) {
						celebrity = people.get(i);
					}
				} else {
					continue;
				}
			}
		}
		return celebrity;
	}
}
