package com.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import com.pojo.Character1;
import com.pojo.Movie;
import com.pojo.MovieRatingComparator;

public class MovieImplement implements MovieInfo{
	
	Scanner sc=new Scanner(System.in);
	ArrayList<Movie> movieList=new ArrayList<Movie>();
	@Override
	public void addMovie() {
		
		System.out.println("Enter no of movies you want to add:");
		int size=sc.nextInt();
		
		for(int i=0;i<size;i++) {
			
			Movie m=new Movie();
			System.out.println("Enter movie id:");
			m.setMovieId(sc.nextInt());
			System.out.println("Enter movie name:");
			m.setMovieName(sc.next());
			System.out.println("Enter movie Rating:");
			m.setMovieRating(sc.next());
			
			Character1 c=new Character1();
			System.out.println("Enter character id:");
			c.setCharacterId(sc.nextInt());
			System.out.println("Enter character name:");
			c.setCharacterName(sc.next());
			System.out.println("Enter Profile:");
			c.setProfile(sc.next());
			
			System.out.println("-----------------------------------");
			m.setCharacter(c);
			
			movieList.add(i, m);
			
		}
		
		
	}

	@Override
	public void updateMovie() {
		System.out.println("Enter movie name you want to update:");
		String name=sc.next();
		boolean flag=false;
		ListIterator<Movie> itr=movieList.listIterator();
		while(itr.hasNext()) {
			Movie m=itr.next();
			if(name.equalsIgnoreCase(m.getMovieName())) {
				flag=true;
				System.out.println("-----------------------------------");
				System.out.println("1.Update Movie ID\n2.Update Movie Name \n3.Update Movie Rating");
				System.out.println("-----------------------------------");
				System.out.println("Enter your choice:");
				switch(sc.nextInt()) {
					case 1:
					{
						System.out.println("Enter new ID:");
						int id=sc.nextInt();
						m.setMovieId(id);
						break;
					}
					case 2:
					{
						System.out.println("Enter new Name:");
						
						m.setMovieName(sc.next());
						break;
					}
					case 3:
					{
						System.out.println("Enter New Rating:");
						m.setMovieRating(sc.next());
						break;
					}
					default:
						System.out.println("Invalid Input!");
				}
			}
		}
		System.out.println("-----------------------------------");
		if(flag) {
			System.out.println("Movie Updated Successfully!");
		}else {
			System.out.println("Movie Not Found!");
		}
		System.out.println("-----------------------------------");
		
	}

	@Override
	public void deleteMovie() {
		System.out.println("Enter id of movie:");
		int id=sc.nextInt();
		boolean flag=false;
		
		ListIterator<Movie> itr=movieList.listIterator();
		while(itr.hasNext()) {
			Movie m=itr.next();
			if(id==m.getMovieId()) {
				itr.remove();
				flag=true;
			}
		}
		System.out.println("-----------------------------------");
		if(flag) {
			System.out.println("Movie deleted successfully!");
		}else {
			System.out.println("Id not found!");
		}
		System.out.println("-----------------------------------");
		
	}

	@Override
	public void searchMovie() {
		System.out.println("Enter movie name you want to search");
		String name=sc.next();
		boolean flag=false;
		ListIterator<Movie> itr=movieList.listIterator();
		System.out.println("-----------------------------------");
		
		while(itr.hasNext()) {
			Movie m=itr.next();
			if(name.equalsIgnoreCase(m.getMovieName())) {
//				System.out.println(m.getMovieId()+" "+m.getMovieName()+" "+m.getMovieRating());
				System.out.println(m);
				
				flag=true;
			}
		}
		if(!flag) {
			System.out.println("Movie not found!");
		}
		System.out.println("-----------------------------------");
		
	}

	@Override
	public List<Movie> showMovies() {
		
		return movieList;
	}

	@Override
	public List<Movie> sortMovieRatings() {
		Collections.sort(movieList, new MovieRatingComparator());
		
		return movieList;
	}

	@Override
	public void bookMovie() {
		System.out.println("-----------------------------------");
		if(movieList.isEmpty()) {
			System.out.println("Movies not Found!");
		}else {
			System.out.println("Available Movies:");
			System.out.println("-----------------------------------");
			for(Movie m:movieList) {
				System.out.println(m.getMovieName());
			}
			
			System.out.println("Enter movie name you want to book:");
			String mName=sc.next();
			boolean flag=false;
			ListIterator<Movie> itr=movieList.listIterator();
			while(itr.hasNext()) {
				Movie m=itr.next();
				if(mName.equalsIgnoreCase(m.getMovieName())) {
					flag=true;
					System.out.println("1.RECLINER:	650");
					System.out.println("2.PREMIUM:	400");
					System.out.println("3.EXECUTIVE: 200");
					
					System.out.println("Enter your choice:");
					int choice=sc.nextInt();
					System.out.println("Enter no of tickets:");
					int no=sc.nextInt();
					switch(choice) {
						
						case 1:
						{
							System.out.println("Movie Name:"+m.getMovieName());
							System.out.println("Seat Type: RECLINER");
							System.out.println("No of Tickets:"+no);
							System.out.println("Amount to Pay:"+(no*650));
							break;
						}
						case 2:
						{
							System.out.println("Movie Name:"+m.getMovieName());
							System.out.println("Seat Type: PREMIUM");
							System.out.println("No of Tickets:"+no);
							System.out.println("Amount to Pay:"+(no*400));
							break;
						}
						case 3:
						{
							System.out.println("Movie Name:"+m.getMovieName());
							System.out.println("Seat Type: EXECUTIVE");
							System.out.println("No of Tickets:"+no);
							System.out.println("Amount to Pay:"+(no*200));
							break;
						}
						default:
							System.out.println("Invalid Input!");
					}
				}
			}
			
		}
		System.out.println("-----------------------------------");
		
	}

}
