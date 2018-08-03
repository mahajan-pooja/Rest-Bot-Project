package com.example.demo.service;

import com.example.demo.bean.Theatre;

public interface TheatreService {
	public Theatre getTheaters();

	public int deleteTheatres(Long theatreId);

	public int updateTheatres(Theatre theatre);

	public int createTheaters(Theatre theatre);
}
