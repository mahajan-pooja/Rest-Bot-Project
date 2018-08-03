package com.example.demo.service;

import java.util.List;

import com.example.demo.bean.User;

public interface UserService {
	public List<User> users();

	public User getUsers(Long userId);

	public int deleteUsers(Long userId);

	public int updateUsers(User user);

	public int createUsers(User user);
}
