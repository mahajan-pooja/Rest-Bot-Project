package com.example.demo.dao;

import java.util.List;

import com.example.demo.bean.ShowTime;


public interface ShowTimeDao {
	public List<ShowTime> showTimings();

	public ShowTime getShowTimings(Long showId);

	public int deleteShowTimings(Long showId);

	public int createShowTimings(ShowTime show);
	
	public int updateShowTimings(ShowTime show);

}
