package com.tkira.moon.service;

import com.tkira.moon.entity.User;

public interface UserService {

	String generateUserNo();
	
	void addUser(User user);
}
