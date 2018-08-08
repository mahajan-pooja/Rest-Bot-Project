package com.example.demo.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.User;

@Repository("userDao")
public class UserDaoImpl {
	private JdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public List<User> getUsers() {
		List<User> users = null;

		try {
			users = jdbcTemplate.query("SELECT * FROM User",
					new BeanPropertyRowMapper<User>(User.class));
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		return users;
	}
	public User getUser(Long userId) {
		User user = null;
		try {
			user = jdbcTemplate.queryForObject("SELECT * FROM Employee WHERE employeeid = ?",
					new Object[] { userId }, new BeanPropertyRowMapper<User>(User.class));
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		return user;

	}

	public int deleteEmployee(Long userId) {
		int count = jdbcTemplate.update("DELETE from Employee WHERE employeeid = ?", new Object[] { userId });
		return count;
	}

	public int updateEmployee(User user) {
		int count = jdbcTemplate.update(
				"UPDATE Employee set userName = ? , phoneNumber = ? , emailId = ? where userId = ?", new Object[] {
						user.getUserName(), user.getPhoneNumber(), user.getEmailId(), user.getUserId() });
		return count;
	}

	public int createEmployee(User user) {
		int count = jdbcTemplate.update("INSERT INTO User(userName, phoneNumber, emailId)VALUES(?,?,?)",
				new Object[] { user.getUserName(), user.getPhoneNumber(), user.getEmailId() });
		return count;
	}
}
