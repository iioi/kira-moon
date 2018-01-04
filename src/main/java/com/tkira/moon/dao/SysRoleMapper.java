package com.tkira.moon.dao;

import com.tkira.moon.entity.auth.SysRole;

public interface SysRoleMapper {

	SysRole queryByUserId(Integer userId);
}
