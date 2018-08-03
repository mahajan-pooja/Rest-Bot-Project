package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.bean.Booking;
import com.example.demo.bean.Movie;
import com.example.demo.bean.ShowTime;
import com.example.demo.bean.Theatre;
import com.example.demo.bean.User;

public class TheatreController {
	@RequestMapping(value = "/theatres", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<Theatre> theatres() {
		return null;
	}
	
	@RequestMapping(value = "/theatres", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<Theatre> createTheatres(@RequestBody Theatre theatre) {
		return null;
	}
	
	@RequestMapping(value = "/theatres/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Theatre> deleteThratres(@PathVariable("id") Long theatreId) {
		return null;
	}
	
	@RequestMapping(value = "/theatres/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Theatre> updateTheatres(@PathVariable("id") Long theatreId,
			@RequestBody Theatre theatre) {
		return null;
	}
	
	/**
	 * UserController
	 * 
	 */
	@RequestMapping(value = "/theaters/{id}/users", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<User> users() {
		return null;
	}
	
	@RequestMapping(value = "/theaters/{id}/users/{id}", method = RequestMethod.GET)
	public ResponseEntity<User> getUsers(@PathVariable("id") Long userId) {
		return null;
	}
	
	@RequestMapping(value = "/theaters/{id}/users", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<User> createUsers(@RequestBody User user) {
		return null;
	}
	
	@RequestMapping(value = "/theaters/{id}/users/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<User> deleteUsers(@PathVariable("id") Long userId) {
		return null;
	}
	
	@RequestMapping(value = "/theaters/{id}/users/{id}", method = RequestMethod.PUT)
	public ResponseEntity<User> updateUsers(@PathVariable("id") Long userId,
			@RequestBody User user) {
		return null;
	}
	
	
	/**
	 * MovieController
	 */
	@RequestMapping(value = "/theaters/{id}/users/{id}/movies", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<Movie> movies() {
		return null;
	}
	
	@RequestMapping(value = "/theaters/{id}/users/{id}/movies/{id}", method = RequestMethod.GET)
	public ResponseEntity<Movie> getMovies(@PathVariable("id") Long movieId) {
		return null;
	}
	
	@RequestMapping(value = "/theaters/{id}/users/{id}/movies", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<Movie> createMovies(@RequestBody Movie movie) {
		return null;
	}
	
	@RequestMapping(value = "/theaters/{id}/users/{id}/movies/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Movie> deleteMovies(@PathVariable("id") Long movieId) {
		return null;
	}
	
	@RequestMapping(value = "/theaters/{id}/users/{id}/movies/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Movie> updateMovies(@PathVariable("id") Long movieId,
			@RequestBody Movie movie) {
		return null;
	}
	
	/**
	 * ShowTime Controller
	 */
	@RequestMapping(value = "/theaters/{id}/users/{id}/movies/{id}/showtimes", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<ShowTime> showTimings() {
		return null;	
	}
	
	@RequestMapping(value = "/theaters/{id}/users/{id}/movies/{id}/showtimes/{id}", method = RequestMethod.GET)
	public ResponseEntity<ShowTime> getShowTimings(@PathVariable("id") Long showId) {
		return null;
	}
	
	@RequestMapping(value = "/theaters/{id}/users/{id}/movies/{id}/showtimes", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ShowTime> createShowTimings(@RequestBody ShowTime showtime) {
		return null;
	}
	
	@RequestMapping(value = "/theaters/{id}/users/{id}/movies/{id}/showtimes/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<ShowTime> deleteShowTimings(@PathVariable("id") Long showId) {
		return null;
	}
	
	@RequestMapping(value = "/theaters/{id}/users/{id}/movies/{id}/showtimes/{id}", method = RequestMethod.PUT)
	public ResponseEntity<ShowTime> updateShowTimings(@PathVariable("id") Long showId,
			@RequestBody ShowTime showtime) {
		return null;
	}
	
	/**
	 * BookingController
	 */
	@RequestMapping(value = "/theaters/{id}/users/{id}/movies/{id}/showtimes/{id}/bookings", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<Booking> bookings() {
		return null;
	}
	
	@RequestMapping(value = "/theaters/{id}/users/{id}/movies/{id}/showtimes/{id}/bookings/{id}", method = RequestMethod.GET)
	public ResponseEntity<Booking> getBookings(@PathVariable("id") Long bookingId) {
		return null;
	}
	
	@RequestMapping(value = "/theaters/{id}/users/{id}/movies/{id}/showtimes/{id}/bookings", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<Booking> createBookings(@RequestBody Booking booking) {
		return null;
	}
	
	@RequestMapping(value = "/theaters/{id}/users/{id}/movies/{id}/showtimes/{id}/bookings/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Booking> deleteBookings(@PathVariable("id") Long bookingId) {
		return null;
	}
}
