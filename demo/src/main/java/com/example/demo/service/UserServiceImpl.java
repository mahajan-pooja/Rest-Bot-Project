package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.User;
import com.example.demo.dao.UserDao;

@Service("userService")
public class UserServiceImpl {
	
	@Autowired
	private UserDao userDao;

	public List<User> getEmployees() {
		List<User> users = userDao.getUsers();
		return users;
	}

	public User getEmployee(Long userId) {
		User user = userDao.getUser(userId);
		return user;
	}

	public int deleteEmployee(Long userId) {
		return userDao.deleteUsers(userId);
	}

	public int updateEmployee(User user) {
		return userDao.updateUsers(user);
	}

	public int createEmployee(User user) {
		return userDao.createUsers(user);
	}
}
