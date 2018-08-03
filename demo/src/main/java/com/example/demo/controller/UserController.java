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
	@RequestMapping(value = "/users/theaters", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<List<Theater>> getAllTheaters() {
		HttpHeaders headers = new HttpHeaders();
		List<Theater> theaters = theaterService.getTheaters();

		if (theaters == null) {
			return new ResponseEntity<List<Theater>>(HttpStatus.NOT_FOUND);
		}
		headers.add("Number Of Records Found", String.valueOf(theaters.size()));
		return new ResponseEntity<List<Theater>>(theaters, headers, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/users/{userId}/theaters/{theaterId}", method = RequestMethod.GET)
	public ResponseEntity<User> getTheater(
			@PathVariable("userId") Long userId, 
			@PathVariable("theaterId") Long theaterId) {
		return null;
	}

	// Need an admin user ID check - only admin can create theatre
	@RequestMapping(value = "/users/{userId}/theaters", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<Theater> createtheater(@PathVariable("userId") Long userId, @RequestBody Theater theater) {
		return null;
	}

	// Need an admin user ID check - only admin can delete theatre
	@RequestMapping(value = "/users/{userid}/theaters/{theaterId}", method = RequestMethod.DELETE)
	public ResponseEntity<Theater> deletetheater(@PathVariable("userId") Long userId, 
			@PathVariable("theatreId") Long theatreId) {
		return null;
	}

	// Need an admin user ID check - only admin can update theatre
	@RequestMapping(value = "/users/{userId}/theaters/{theatreId}", method = RequestMethod.PUT)
	public ResponseEntity<Theater> updatetheater(@PathVariable("userId") Long userId, 
			@PathVariable("theatreId") Long theatreId,
			@RequestBody Theater theater) {
		return null;
	}


	/**
	 * MovieController
	 * Functionality for Users and theaterAdmin
	 */
	//not passing theater id so that it will show all movies in all theaters
	@RequestMapping(value = "/users/{userId}/movies", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<Movie> getAllMovies(@PathVariable("userId") Long userId) {
		return null;
	}
	
	//passing theater id so that it will show theater specific movies only
	@RequestMapping(value = "/users/{userId}/theaters/{theaterId}/movies", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<Movie> getMoviesInTheater(@PathVariable("userId") Long userId, 
													@PathVariable("theaterId") Long theaterId) {
		return null;
	}

	//passing theater id so that it will show theater specific movies with id only
	@RequestMapping(value = "/users/{userId}/theaters/{theaterId}/movies/{movieId}", method = RequestMethod.GET)
	public ResponseEntity<Movie> getMovieInTheater(@PathVariable("userId") Long userId, 
									@PathVariable("theaterId") Long theaterId, 
									@PathVariable("movieId") Long movieId) {
		return null;
	}

	// Need an admin user ID check - only admin can create movie
	@RequestMapping(value = "/users/{userId}/theaters/movies", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<Movie> createMovie(@PathVariable("userId") Long userId, @RequestBody Movie movie) {
		return null;
	}
	// Need an admin user ID check - only admin can delete movie
	@RequestMapping(value = "/users/{userId}/movies/{movieId}", method = RequestMethod.DELETE)
	public ResponseEntity<Movie> deleteMovie(@PathVariable("userId") Long userId, @PathVariable("movieId") Long movieId) {
		return null;
	}
	// Need an admin user ID check - only admin can update movie
	@RequestMapping(value = "/users/{userId}/movies/{movieId}", method = RequestMethod.PUT)
	public ResponseEntity<Movie> updateMovie(@PathVariable("userId") Long userId, @PathVariable("movieId") Long movieId, @RequestBody Movie movie) {
		return null;
	}

	/**
	 * ShowTime Controller
	 */
	//user id is not needed as both admin and customer can see the list
	@RequestMapping(value = "/users/showtimes", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<ShowTime> showTimings() {
		return null;	
	}
	//user id is not needed as both admin and customer can see the list
	@RequestMapping(value = "/users/showtimes/{showtimeId}", method = RequestMethod.GET)
	public ResponseEntity<ShowTime> getShowTiming(@PathVariable("showtimeId") Long showtimeId) {
		return null;
	}
	
	// Admin ID check - only admin can create showtimes
	@RequestMapping(value = "/users/{userId}/showtimes", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ShowTime> createShowTiming(@PathVariable("userId") Long userId, @RequestBody ShowTime showtime) {
		return null;
	}
	// Admin ID check - only admin can delete showtimes
	@RequestMapping(value = "/users/{userId}/showtimes/{showtimeId}", method = RequestMethod.DELETE)
	public ResponseEntity<ShowTime> deleteShowTiming(@PathVariable("userId") Long userId,
			@PathVariable("showtimeId") Long showtimeId) {
		return null;
	}

	// Admin ID check - only admin can update showtimes
	@RequestMapping(value = "/users/{userId}/showtimes/{showtimeId}", method = RequestMethod.PUT)
	public ResponseEntity<ShowTime> updateShowTiming(@PathVariable("userId") Long userId,
			@PathVariable("showtimeId") Long showtimeId,
			@RequestBody ShowTime showtime) {
		return null;
	}

	/**
	 * BookingController
	 */
	//Admin ID check - only admin can see all bookings
	@RequestMapping(value = "/users/{userId}/bookings", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<Booking> bookings() {
		return null;
	}
	//admin and customer both can see booking
	@RequestMapping(value = "/users/{userId}/bookings/{bookingId}", method = RequestMethod.GET)
	public ResponseEntity<Booking> getBookingForId(@PathVariable("bookingId") Long bookingId) {
		return null;
	}
	//admin and customer both can delete booking
	@RequestMapping(value = "/users/{userId}/bookings/{bookingId}", method = RequestMethod.DELETE)
	public ResponseEntity<Booking> deleteBookings(@PathVariable("userId") Long userId,
			@PathVariable("bookingId") Long bookingId) {
		return null;
	}
	//admin and customer both can make booking
	@RequestMapping(value = "/users/bookings", method = RequestMethod.POST)
	public ResponseEntity<Booking> makeBooking( 
			@RequestBody Booking booking) {		
		return null;
	}
}
