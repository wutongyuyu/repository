package com.tedu.sp01.service;

import com.tedu.sp01.pojo.User;

public interface UserService {
	/**
	 * getUser获取用户数据
	 * addScore：增加用户积分
	 */
	User getUser(Integer id);
	void addScore(Integer id, Integer score);
}
