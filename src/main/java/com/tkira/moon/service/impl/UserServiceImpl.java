package com.tkira.moon.service.impl;

import java.util.Date;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tkira.moon.dao.SysUserMapper;
import com.tkira.moon.entity.User;
import com.tkira.moon.entity.his.UserHis;
import com.tkira.moon.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private SysUserMapper sysUserMapper;

	@Override
	public String generateUserNo() {
		while (true) {
			StringBuffer sb = new StringBuffer();
			Random random = new Random();
			for (int i = 0; i < 9; i++) {
				sb.append(random.nextInt());
			}
			String no = sb.toString();
			if (!no.matches("\\d{4,}") && sysUserMapper.exitsUserNo(no) == 0) {
				return no;
			}
		}
	}

	@Override
	public void addUser(User user) {
		user.setCreateTime(new Date());
		user.setStatus(0);
		user.setUpdateTime(new Date());
		user.setUserNo(generateUserNo());
		sysUserMapper.insertUser(user);
		UserHis userHis = new UserHis(user);
		sysUserMapper.insertUserHis(userHis);
	}

}
