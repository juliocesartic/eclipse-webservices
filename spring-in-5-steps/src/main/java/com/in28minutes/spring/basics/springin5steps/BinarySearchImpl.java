package com.in28minutes.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	
	
	@Autowired
	private SortAlgorithm sortAlgorithm;
	
	
	public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
		this.sortAlgorithm = sortAlgorithm;
	}
	
	/*public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}*/
	
	



	public int binarySearch(int [] numbers, int numberToSearchFor) {
		//implement the search logic
		
		//Bubble sort algorithm
		int [] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		// search the array.
		return 3;
	}




	

	//Sorting the array.
	
	// search the array
	
	// return the result
}
