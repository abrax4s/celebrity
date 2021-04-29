package com.celebrity;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class CelebrityTest {

	@Test
	public void testFindCelebrity() {
		boolean[][] acquaitances = { { false, false, true, false }, { false, false, true, false },
				{ false, false, false, false }, { false, false, true, false } };
		List<Person> people = new ArrayList<>();
		people.add(new Person(0));
		people.add(new Person(1));
		people.add(new Person(2));
		people.add(new Person(3));
		new Celebrity().findCelebrity(people, acquaitances);
	}

}
