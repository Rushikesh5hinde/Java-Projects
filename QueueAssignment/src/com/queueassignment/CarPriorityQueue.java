package com.queueassignment;

import java.util.PriorityQueue;

public class CarPriorityQueue {
	public static void main(String[] args) {
		/*7.	WAP to create a Queue using generics and add user defined class 
		 * objects which does not implement comparable interface yet element are 
		 * added in sorted in natural order. Observe order when removing from queue*/
		
		PriorityQueue<Car> pq=new PriorityQueue<Car>(new CarIdComparator());
		pq.add(new Car(101, "TATA", 150.0));
		pq.add(new Car(104, "Volkswagon", 230.0));
		pq.add(new Car(102, "Ford", 170.0));
		pq.add(new Car(103, "Mahindra", 190.0));
		
		
//		System.out.println(pq);
		
		/*8.	WAP to create a Queue using generics and add user defined class objects 
		in reverse order usingcomparator. Observe order when removing from queue.*/
		
		System.out.println(pq);
	}
}
