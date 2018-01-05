package com.tkira.moon.dao;

import org.apache.ibatis.annotations.Param;

import com.tkira.moon.entity.User;
import com.tkira.moon.entity.auth.SysUser;
import com.tkira.moon.entity.his.UserHis;

public interface SysUserMapper {

	SysUser queryByCondition(@Param("queryStr") String queryStr, @Param("type") Integer queryType);

	User querySimpleInfo(Integer id);
	
	int exitsUserNo(String userNo);
	
	int insertUser(User user);
	
	int insertUserHis(UserHis userHis);
}
