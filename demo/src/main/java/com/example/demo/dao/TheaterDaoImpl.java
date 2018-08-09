package com.example.demo.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.Theater;
import com.example.demo.dao.TheaterDao;

@Repository("TheaterDao")
public class TheaterDaoImpl {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public Theater getTheater(Long theaterId) {
		Theater result = null;
		try {
			result = jdbcTemplate.queryForObject("SELECT * FROM THEATER WHERE theaterId = ?", 
					new Object[] { theaterId },new BeanPropertyRowMapper<Theater>(Theater.class));
		} catch (DataAccessException e) {
			e.printStackTrace();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return result;
	}

	public int deleteTheater(Long theaterId) {
		int count = jdbcTemplate.update("DELETE FROM THEATER WHERE THEATERID = ?", new Object[] {theaterId});
		return count;		
	}

	public int updateTheater(Theater theater) {
		int count = jdbcTemplate.update(
				"UPDATE Theater set theaterName = ? , address = ? , num_seats = ? where theaterId = ?", new Object[] {
						theater.getName(), theater.getAddress(), theater.getSeatsAvailable(), theater.getTheaterId() });
		return count;
	}

	//	public int createTheater(Theater theater) {
	//		
	//	}
}
