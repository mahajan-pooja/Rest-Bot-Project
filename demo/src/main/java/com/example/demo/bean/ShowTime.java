package com.example.demo.bean;

import java.util.Date;
import java.util.List;

public class ShowTime {
	int showId;
	int movieId;
	int theatreId;
	Date date;
	List<Date> time;
	public int getShowId() {
		return showId;
	}
	public void setShowId(int showId) {
		this.showId = showId;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public int getTheatreId() {
		return theatreId;
	}
	public void setTheatreId(int theatreId) {
		this.theatreId = theatreId;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public List<Date> getTime() {
		return time;
	}
	public void setTime(List<Date> time) {
		this.time = time;
	}
}
