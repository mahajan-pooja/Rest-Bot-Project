package com.example.demo.dao;

import com.example.demo.bean.Theatre;

public interface TheatreDao {
	public Theatre getTheaters();

	public int deleteTheatres(Long theatreId);

	public int updateTheatres(Theatre theatre);

	public int createTheaters(Theatre theatre);
}
