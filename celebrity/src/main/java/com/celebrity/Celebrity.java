package com.celebrity;

import java.util.List;
import java.util.stream.Collectors;

public class Celebrity {

	/**
	 * Find celebrity method.
	 * 
	 * Iterates over provided list of people (Person objects) to find people who
	 * don't know anyone in the group. Those persons are considered celebrities.
	 */

	public void findCelebrity(List<Person> people) {
		List<Person> celebrities = people.stream()
				.filter(personA -> (null == personA.getKnownPeople() || 0 == personA.getKnownPeople().size()))
				.collect(Collectors.toList());

		if (celebrities.size() == 1) {
			System.out.println("Celebrity is: " + celebrities.get(0).getId());
		} else if (celebrities.size() > 1) {
			System.out.println("Celebrities are:");
			celebrities.stream().map(celebrity -> celebrity.getId()).forEach(System.out::println);
		} else {
			System.out.println("No celebrity in the list");
		}
	}
}
