package com.pojo;

import java.util.Comparator;

public class MovieRatingComparator implements Comparator<Movie>{

	@Override
	public int compare(Movie m1, Movie m2) {
		
		return m1.getMovieRating().compareTo(m2.getMovieRating());
	}

}
