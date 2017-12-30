package com.tkira.moon.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.tkira.moon.entity.SysUser;
import com.tkira.test.BaseTest;

public class SysUserMapperTest extends BaseTest {

	@Autowired
	private SysUserMapper sysUserMapper;
	
	@Test
	public void testQueryByUsername() {
		SysUser sysUser = sysUserMapper.queryByUsername("admin");
		System.out.println(sysUser);
	}

	
}
