package com.tkira.moon.entity.auth;

import java.util.List;

import lombok.Data;

@Data
public class SysRole {

	private Integer id;
	
	private String name;
	
	private String chName;
	
	private String introduction;
	
	List<SysPermission> permissions;
}
