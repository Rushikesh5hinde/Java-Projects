package com.test;

import java.util.Scanner;

import com.dao.MovieImplement;
import com.pojo.Movie;

public class MovieController {
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		MovieImplement obj=new MovieImplement();
		
		System.out.println("*************** WELCOME ***************");
		
		while(true) {
			System.out.println("1.Add Movies\n2.Update Movie\n3.Delete Movie\n4.Search Movie\n5.Show All Movies\n6.Show Movie Ratings\n7.Book Movie\n8.Exit");
			System.out.println("-----------------------------------");
			System.out.println("Enter your choice:");
			switch(sc.nextInt()) {
			case 1:
			{
				obj.addMovie();
				break;
			}
			case 2:
			{
				obj.updateMovie();
				break;
			}
			case 3:
			{
				obj.deleteMovie();
				break;
			}
			case 4:
			{
				obj.searchMovie();
				break;
			}
			
			case 5:
			{
				System.out.println("-----------------------------------");
				if(obj.showMovies().isEmpty())
				{
					System.out.println("List is Empty!");
				}else {
					for(Movie m1:obj.showMovies()) {
						System.out.println(m1);
					}
				}
				System.out.println("-----------------------------------");
				
				break;
			}
			case 6:
			{
				System.out.println("-----------------------------------");
				if(obj.sortMovieRatings().isEmpty())
				{
					System.out.println("List is Empty!");
				}else {
					for(Movie m1:obj.showMovies()) {
						System.out.println("Movie Name:"+m1.getMovieName()+", "+"Rating: "+m1.getMovieRating());
					}
				}
				System.out.println("-----------------------------------");
				
				break;
			}
			case 7:
			{
				
				obj.bookMovie();
				
				break;
			}
			case 8:
			{
				System.out.println("*************** THANK YOU ***************");
				System.exit(0);
				break;
			}
			default:
				System.err.println("Invalid Input!");
			}
		}
	}
}
