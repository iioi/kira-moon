package com.tkira.moon.service.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.tkira.moon.dao.SysUserMapper;
import com.tkira.moon.entity.auth.SysUser;
import com.tkira.moon.util.RegexHepler;

public class CustomUserService implements UserDetailsService {

	@Autowired
	private SysUserMapper sysUserMapper;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		SysUser user = sysUserMapper.queryByCondition(username, getQueryType(username));
		if(user == null)
			throw new UsernameNotFoundException("用户名不存在");
		return user;
	}
	
	private int getQueryType(String queryStr) {
		if(RegexHepler.isUserNo(queryStr))
			return 1;
		else if(RegexHepler.isTelephone(queryStr))
			return 2;
		else if(RegexHepler.isEmail(queryStr))
			return 3;
		return 0;
	}

}
