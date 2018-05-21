package com.lixin.service;

import com.lixin.pojo.User;

public interface UserService {

	public User checklophone(String phone) ;

	public int update(User user);
	public User findById(String id);

	public String login(User user);

	public String save(User user);
}
