package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.bean.Movie;

public class MovieController {
	@RequestMapping(value = "/movies", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<Movie> movies() {
		return null;
		
	}
	
	@RequestMapping(value = "/movies/{id}", method = RequestMethod.GET)
	public ResponseEntity<Movie> getMovies(@PathVariable("id") Long movieId) {
		return null;
	}
	
	@RequestMapping(value = "/movies", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<Movie> createMovies(@RequestBody Movie movie) {
		return null;
	}
	
	@RequestMapping(value = "/movies/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Movie> deleteMovies(@PathVariable("id") Long movieId) {
		return null;
	}
	
	@RequestMapping(value = "/movies/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Movie> updateMovies(@PathVariable("id") Long movieId,
			@RequestBody Movie movie) {
		return null;
	}
}
