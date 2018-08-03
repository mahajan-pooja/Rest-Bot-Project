package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.bean.Theatre;

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
}
