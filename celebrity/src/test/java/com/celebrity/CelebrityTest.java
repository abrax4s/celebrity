package com.celebrity;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Test;

public class CelebrityTest {

	@After
	public void notifyTest() {
		System.out.println("----Test finished-----");
	}
	@Test
	public void testFindCelebrity() {
		System.out.println("Test with celebrity");
		List<Person> people = new ArrayList<>();
		people.add(new Person(1,Arrays.asList(new Person(1), new Person(2), new Person(3), new Person(4))));
		people.add(new Person(2,Arrays.asList(new Person(1), new Person(2), new Person(3), new Person(4))));
		people.add(new Person(3));
		people.add(new Person(4,Arrays.asList(new Person(1), new Person(2), new Person(3), new Person(4))));
		new Celebrity().findCelebrity(people);
	}
	
	@Test
	public void testFindNoCelebrity() {
		System.out.println("Test with no celebrities");
		List<Person> people = new ArrayList<>();
		people.add(new Person(1,Arrays.asList(new Person(1), new Person(2), new Person(3), new Person(4))));
		people.add(new Person(2,Arrays.asList(new Person(1), new Person(2), new Person(3), new Person(4))));
		people.add(new Person(3,Arrays.asList(new Person(1), new Person(2), new Person(3), new Person(4))));
		people.add(new Person(4,Arrays.asList(new Person(1), new Person(2), new Person(3), new Person(4))));
		new Celebrity().findCelebrity(people);
	}
	
	@Test
	public void testFindCelebrities() {
		System.out.println("Test with more than one celebrity");
		List<Person> people = new ArrayList<>();
		people.add(new Person(1,Arrays.asList(new Person(1), new Person(2), new Person(3), new Person(4))));
		people.add(new Person(2));
		people.add(new Person(3,Arrays.asList(new Person(1), new Person(2), new Person(3), new Person(4))));
		people.add(new Person(4));
		new Celebrity().findCelebrity(people);
	}

}
