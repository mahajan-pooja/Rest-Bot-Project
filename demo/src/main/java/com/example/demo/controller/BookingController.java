package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.bean.Booking;


public class BookingController {
	@RequestMapping(value = "/bookings", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<Booking> bookings() {
		return null;
	}
	
	@RequestMapping(value = "/bookings/{id}", method = RequestMethod.GET)
	public ResponseEntity<Booking> getBookings(@PathVariable("id") Long bookingId) {
		return null;
	}
	
	@RequestMapping(value = "/bookings", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<Booking> createBookings(@RequestBody Booking booking) {
		return null;
	}
	
	@RequestMapping(value = "/bookings/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Booking> deleteBookings(@PathVariable("id") Long bookingId) {
		return null;
	}
}
