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
	
	public void findCelebrity(List<Person> people, boolean[][] acquaitances) {                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       
		people.stream().forEach(personA ->{
			int counter= 0;
			for(Person personB : people) {
				if(!personA.knowsPerson(personB, acquaitances)) {
					counter ++;
					if(counter==people.size()) {
						System.out.println("Celebrity is: "+personA.getId());
					}
				}else {
					continue;
				}
			}
		});
	}
}
