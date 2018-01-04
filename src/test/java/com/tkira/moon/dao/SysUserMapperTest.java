package com.tkira.moon.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.tkira.moon.entity.auth.SysUser;
import com.tkira.test.BaseTest;

public class SysUserMapperTest extends BaseTest {

	@Autowired
	private SysUserMapper sysUserMapper;

	@Test
	public void testQueryByCondition() {
		SysUser sysUser = sysUserMapper.queryByCondition("admin", 0);
		System.out.println(sysUser);
	}

}
