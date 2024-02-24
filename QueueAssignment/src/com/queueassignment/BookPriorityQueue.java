package com.queueassignment;

import java.util.PriorityQueue;

public class BookPriorityQueue {
	public static void main(String[] args) {
		PriorityQueue<Book>bpq=new PriorityQueue<Book>(new BookPriceComparator());
		
		bpq.add(new Book(1, "Secret", 900));
		bpq.add(new Book(2, "Life", 750));
		bpq.add(new Book(3, "Power of Mind", 1000));
		bpq.add(new Book(4, "Hamlet", 820));
	
		for(Book b:bpq) {
			System.out.println(b);
		}
	}
}
