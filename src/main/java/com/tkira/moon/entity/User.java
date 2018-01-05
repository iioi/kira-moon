package com.tkira.moon.entity;

import java.util.Date;

import com.tkira.moon.util.ReflectionHelper;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class User {

	private Integer id;
	private String userNo;
	private String username;
	private String password;
	private String email;
	private String telephone;
	private String photoUrl;
	private String introduction;
	private Integer status;
	private Date createTime;
	private Date updateTime;

	public User(User user) {
		ReflectionHelper.beanFieldsCopy(this, user);
	}
	
}
