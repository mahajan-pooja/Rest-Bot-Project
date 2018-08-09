package com.example.demo.service;

import java.util.List;
import com.example.demo.bean.Theater;

public interface TheaterService {
	public List<Theater> getTheaters();

	public int deleteTheaters(Long theatreId);

	public int updateTheaters(Theater theatre);

	// public int createTheaters(Theater theatre);

}
