package com.celebrity;

public class Person {
	private int id;
	
	public Boolean knowsPerson(Person person,boolean[][] acquaitances) {
		Boolean res = null;
		res = acquaitances[this.id][person.id];
		return res;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public Person(int id) {
		super();
		this.id = id;
	}
	
}
