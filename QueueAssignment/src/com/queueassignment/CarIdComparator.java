package com.queueassignment;

import java.util.Comparator;

public class CarIdComparator implements Comparator<Car> {

	@Override
	public int compare(Car c1, Car c2) {
		
		return c2.getId()-c1.getId();
	}

}
