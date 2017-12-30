package com.tkira.moon.dao;

import com.tkira.moon.entity.SysUser;

public interface SysUserMapper {

	SysUser queryByUsername(String username);
}
