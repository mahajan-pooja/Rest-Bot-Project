package com.example.demo.bean;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
@Entity
public class Booking {
@Id
	private int bookingId;
	private int userId;
	private int movieId;
	private int ticketsbooked;
	private float amount;
	private Date date;
	private Date time;
	
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
