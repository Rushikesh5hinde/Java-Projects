package com.pojo;

public class Movie {
	private int movieId;
	private String movieName;
	private String movieRating;
	private Character1 character;
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Movie(int movieId, String movieName, String movieRating, Character1 character) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.movieRating = movieRating;
		this.character = character;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieRating() {
		return movieRating;
	}
	public void setMovieRating(String movieRating) {
		this.movieRating = movieRating;
	}
	public Character1 getCharacter() {
		return character;
	}
	public void setCharacter(Character1 character) {
		this.character = character;
	}
	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", movieRating=" + movieRating
				+ ", character=" + character + "]";
	}
	
	
}
