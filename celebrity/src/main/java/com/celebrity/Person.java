package com.celebrity;

import java.util.List;

public class Person {
	private Integer id;
	private List<Person> knownPeople;

	public int getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<Person> getKnownPeople() {
		return knownPeople;
	}

	public void setKnownPeople(List<Person> knownPeople) {
		this.knownPeople = knownPeople;
	}

	public Person(Integer id, List<Person> knownPeople) {
		super();
		this.id = id;
		this.knownPeople = knownPeople;
	}

	public Person(Integer id) {
		this.id = id;
	}
}
