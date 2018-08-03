package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.service.TheaterService;
import com.example.demo.bean.Booking;
import com.example.demo.bean.Movie;
import com.example.demo.bean.ShowTime;
import com.example.demo.bean.Theater;
import com.example.demo.bean.User;

public class UserController {

	@Autowired
	private TheaterService theaterService;
	
	/**
	 * UserController
	 * 
	 */
	@RequestMapping(value = "/users", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<List<User>> users() {
		return null;
	}

	@RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
	public ResponseEntity<User> getUser(@PathVariable("id") Long userId) {
		return null;
	}

	@RequestMapping(value = "/users", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<User> createUser(@RequestBody User user) {
		return null;
	}

	@RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<User> deleteUser(@PathVariable("id") Long userId) {
		return null;
	}

	@RequestMapping(value = "/users/{id}", method = RequestMethod.PUT)
	public ResponseEntity<User> updateUser(@PathVariable("id") Long userId,
			@RequestBody User user) {
		return null;
	}

	/**
	 * TheaterController functionality
	 * 
	 */
	@RequestMapping(value = "/users/{id}/theatres", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<List<Theater>> theatres() {
		HttpHeaders headers = new HttpHeaders();
		List<Theater> theaters = theaterService.getTheaters();

		if (theaters == null) {
			return new ResponseEntity<List<Theater>>(HttpStatus.NOT_FOUND);
		}
		headers.add("Number Of Records Found", String.valueOf(theaters.size()));
		return new ResponseEntity<List<Theater>>(theaters, headers, HttpStatus.OK);
	}

	@RequestMapping(value = "/users/{id}/theatres", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<Theater> createTheatre(@RequestBody Theater theatre) {
		return null;
	}

	@RequestMapping(value = "/users/{id}/theatres/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Theater> deleteTheatre(@PathVariable("id") Long theatreId) {
		return null;
	}

	@RequestMapping(value = "/users/{id}/theatres/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Theater> updateTheatre(@PathVariable("id") Long theatreId,
			@RequestBody Theater theatre) {
		return null;
	}


	/**
	 * MovieController
	 * Functionality for Users and TheatreAdmin
	 */
	@RequestMapping(value = "/users/{id}/theatres/{id}/movies", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<Movie> movies() {
		return null;
	}

	@RequestMapping(value = "/users/{id}/theatres/{id}/movies/{id}", method = RequestMethod.GET)
	public ResponseEntity<Movie> getMovie(@PathVariable("id") Long movieId) {
		return null;
	}

	// Need an admin user ID check for these 3 methods below
	@RequestMapping(value = "/users/{id}/theatres/{id}/movies", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<Movie> createMovie(@RequestBody Movie movie) {
		return null;
	}

	@RequestMapping(value = "/users/{id}/theatres/{id}/movies/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Movie> deleteMovie(@PathVariable("id") Long movieId) {
		return null;
	}

	@RequestMapping(value = "/users/{id}/theatres/{id}/movies/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Movie> updateMovie(@PathVariable("id") Long movieId,
			@RequestBody Movie movie) {
		return null;
	}
	
	@RequestMapping(value = "/users/{id}/theatres/{id}/movies/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Movie> bookMovie(@PathVariable("id") Long movieId,
			@RequestBody Movie movie,
			@RequestBody ShowTime showtime) { // showtime gets passed here and we handle the booking in method?
		return null;
	}

	/**
	 * ShowTime Controller
	 */
	@RequestMapping(value = "/users/{id}/theaters/{id}/movies/{id}/showtimes", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<ShowTime> showTimings() {
		return null;	
	}

	@RequestMapping(value = "/users/{id}/theaters/{id}/movies/{id}/showtimes/{id}", method = RequestMethod.GET)
	public ResponseEntity<ShowTime> getShowTiming(@PathVariable("id") Long showId) {
		return null;
	}
	
	// Admin ID check below 3 
	@RequestMapping(value = "/users/{id}/theaters/{id}/movies/{id}/showtimes", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ShowTime> createShowTiming(@RequestBody ShowTime showtime) {
		return null;
	}

	@RequestMapping(value = "/users/{id}/theaters/{id}/movies/{id}/showtimes/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<ShowTime> deleteShowTiming(@PathVariable("id") Long showId) {
		return null;
	}

	@RequestMapping(value = "/users/{id}/theaters/{id}/movies/{id}/showtimes/{id}", method = RequestMethod.PUT)
	public ResponseEntity<ShowTime> updateShowTiming(@PathVariable("id") Long showId,
			@RequestBody ShowTime showtime) {
		return null;
	}

	/**
	 * BookingController
	 */
	@RequestMapping(value = "/users/{id}/theaters/{id}/movies/{id}/showtimes/{id}/bookings", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<Booking> bookings() {
		return null;
	}

	@RequestMapping(value = "/users/{id}/theaters/{id}/movies/{id}/showtimes/{id}/bookings/{id}", method = RequestMethod.GET)
	public ResponseEntity<Booking> getBookings(@PathVariable("id") Long bookingId) {
		return null;
	}

	@RequestMapping(value = "/users/{id}/theaters/{id}/movies/{id}/showtimes/{id}/bookings", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<Booking> createBookings(@RequestBody Booking booking) {
		return null;
	}

	@RequestMapping(value = "/users/{id}/theaters/{id}/movies/{id}/showtimes/{id}/bookings/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Booking> deleteBookings(@PathVariable("id") Long bookingId) {
		return null;
	}

	@RequestMapping(value = "/users/{userId}/theaters/{theaterId}/movies/{movieId}/bookings/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Booking> makeBooking(@PathVariable("userId") Long userid, 
			@PathVariable("theaterId") Long theaterId,
			@PathVariable("movieId") Long movieId, 
			@PathVariable("id") Long bookingId,
			@RequestBody ShowTime showtime) {
		return null;
	}
}
