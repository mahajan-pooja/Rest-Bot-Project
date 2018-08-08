package com.example.demo.bean;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GenerationType;

@Entity
public class Movie {
@Id @GeneratedValue(strategy=GenerationType.Auto)
	private int movieId;
	private String movieName;
	private int theatreId;
	private String language;
	
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getMaovieName() {
		return movieName;
	}
	public void setMaovieName(String maovieName) {
		this.movieName = maovieName;
	}
	public int getTheatreId() {
		return theatreId;
	}
	public void setTheatreId(int theatreId) {
		this.theatreId = theatreId;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
}
