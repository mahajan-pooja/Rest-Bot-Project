package com.example.demo.service;

import org.springframework.stereotype.Service;
import com.example.demo.bean.Theater;
import com.example.demo.dao.TheaterDao; // imported here..?

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


@Service("theaterService")
public class TheaterServiceImpl implements TheaterService {
	
	@Autowired
	private TheaterDao dao; // Dont know why this is giving me an error when i imported it correctly above

	@Override
	public List<Theater> getTheaters() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteTheaters(Long theatreId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateTheaters(Theater theatre) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int createTheaters(Theater theatre) {
		// TODO Auto-generated method stub
		return 0;
	}

}
