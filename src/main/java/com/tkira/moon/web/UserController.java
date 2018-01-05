package com.tkira.moon.web;

import static com.tkira.moon.entity.model.CustomResult.trueResult;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tkira.moon.entity.User;
import com.tkira.moon.entity.model.CustomResult;
import com.tkira.moon.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;

	@RequestMapping("/add")
	public CustomResult addUser(@RequestBody User user) {
		userService.addUser(user);
		return trueResult();
	}
}
