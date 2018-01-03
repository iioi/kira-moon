package com.tkira.moon.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.tkira.moon.entity.DiscussMsg;
import com.tkira.moon.entity.SysUser;
import com.tkira.test.BaseTest;

public class DiscussMsgMapperTest extends BaseTest {

	@Autowired
	private DiscussMsgMapper discussMsgMapper;

	@Test
	public void testInsert() {
		DiscussMsg discussMsg = new DiscussMsg();
		SysUser sysUser = new SysUser();
		sysUser.setId(1);
		discussMsg.setContent("test content");
		discussMsg.setShortMsg("test short msg");
		discussMsg.setSysUser(sysUser);
		discussMsgMapper.insert(discussMsg);
		System.out.println(discussMsg);
	}

	@Test
	public void testQuerySimpleById() {
		DiscussMsg discussMsg = discussMsgMapper.querySimpleById(1);
		System.out.println(discussMsg);
	}
}
