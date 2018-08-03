package com.example.demo.service;

import java.util.List;

import com.example.demo.bean.ShowTime;

public interface ShowTimeService {
	public List<ShowTime> showTimings();

	public ShowTime getShowTimings(Long showId);

	public int deleteShowTimings(Long showId);

	public int createShowTimings(ShowTime show);
	
	public int updateShowTimings(ShowTime show);
}
