package com.example.demo.service;

import org.springframework.stereotype.Service;
import com.example.demo.bean.Theater;
import com.example.demo.dao.TheaterDao; 

import org.springframework.beans.factory.annotation.Autowired;


@Service("theaterService")
public class TheaterServiceImpl {
	
	@Autowired
	private TheaterDao theaterDao; 

	public Theater getTheater() {
		// TODO Auto-generated method stub
		return theaterDao.getTheater();
	}

	public int deleteTheaters(Long theatreId) {
		return theaterDao.deleteTheaters(theatreId);
	}

	public int updateTheaters(Theater theaterId) {
		return theaterDao.updateTheaters(theaterId);
	}

//	@Override
//	public int createTheaters(Theater theatre) {
//		return theaterDao.createTheaters(theatre);
//	}

}
