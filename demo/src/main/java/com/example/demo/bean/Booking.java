package com.example.demo.bean;

import java.util.Date;

public class Booking {
	int bookingId;
	int userId;
	int movieId;
	int ticketsbooked;
	float amount;
	Date date;
	Date time;
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public int getTicketsbooked() {
		return ticketsbooked;
	}
	public void setTicketsbooked(int ticketsbooked) {
		this.ticketsbooked = ticketsbooked;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
}
