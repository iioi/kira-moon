package com.tkira.moon.entity;

import lombok.Data;

@Data
public class SysUser {

	private Integer id;
	
	private String username;
	
	private String password;
	
	private String email;
	
	private String telephone;
}
