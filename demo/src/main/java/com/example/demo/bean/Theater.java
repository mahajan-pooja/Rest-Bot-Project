package com.example.demo.bean;

import java.util.List;

public class Theater {
	int theaterId;
	String name;
	String address;
	List<Movie> movies;
	int seatsAvailable;
	public int getTheaterId() {
		return theaterId;
	}
	public void setTheaterId(int theatreId) {
		this.theaterId = theatreId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<Movie> getMovies() {
		return movies;
	}
	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}
	public int getSeatsAvailable() {
		return seatsAvailable;
	}
	public void setSeatsAvailable(int seatsAvailable) {
		this.seatsAvailable = seatsAvailable;
	}
}
