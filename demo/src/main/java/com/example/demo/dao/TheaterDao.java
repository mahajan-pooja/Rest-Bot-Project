package com.example.demo.dao;

import com.example.demo.bean.Theater;

public interface TheaterDao {
	public Theater getTheaters();

	public int deleteTheaters(Long theatreId);

	public int updateTheaters(Theater theatre);

	// public int createTheaters(Theater theatre);
}
