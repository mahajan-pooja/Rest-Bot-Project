package com.example.demo.dao;

import java.util.List;

import com.example.demo.bean.Booking;

public interface BookingDao {
	public List<Booking> bookings();

	public Booking getBookings(Long bookingId);

	public int deleteBookings(Long bookingId);

	public int createBookings(Booking booking);
}
