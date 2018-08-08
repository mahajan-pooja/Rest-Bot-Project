package com.example.demo.service;

import java.util.List;

import com.example.demo.bean.User;

public interface UserService {
	public List<User> getUsers();

	public User getUser(Long userId);

	public int deleteUsers(Long userId);

	public int updateUsers(User user);

	public int createUsers(User user);
}
