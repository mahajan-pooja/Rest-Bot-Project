package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.bean.ShowTime;

public class ShowTimeController {
	@RequestMapping(value = "/showtimes", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<ShowTime> showTimings() {
		return null;
		
	}
	
	@RequestMapping(value = "/showtimes/{id}", method = RequestMethod.GET)
	public ResponseEntity<ShowTime> getShowTimings(@PathVariable("id") Long showId) {
		return null;
	}
	
	@RequestMapping(value = "/showtimes", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<ShowTime> createShowTimings(@RequestBody ShowTime showtime) {
		return null;
	}
	
	@RequestMapping(value = "/showtimes/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<ShowTime> deleteShowTimings(@PathVariable("id") Long showId) {
		return null;
	}
	
	@RequestMapping(value = "/showtimes/{id}", method = RequestMethod.PUT)
	public ResponseEntity<ShowTime> updateShowTimings(@PathVariable("id") Long showId,
			@RequestBody ShowTime showtime) {
		return null;
	}
}
