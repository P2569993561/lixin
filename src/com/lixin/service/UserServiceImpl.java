package com.lixin.service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lixin.mapper.UserMapper;
import com.lixin.pojo.User;
import com.lixin.pojo.UserExample;
import com.lixin.pojo.UserExample.Criteria;
import com.lixin.utlis.FastJsonUtil;
import com.lixin.utlis.MD5Utils;
/**
 * 
 * @author PHF
 *
 */
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;
	
	/**
	 * 查询电话号码是否被用过
	 */
	public User checklophone(String phone) {
		User user=userMapper.checklophone(phone);
		return user;
	}

	/**
	 * 保存用户，密码需要加密
	 */
	public String save(User user) {
		UUID uuid  =  UUID.randomUUID(); 
		String id= UUID.randomUUID().toString();
		
		user.setPassword(MD5Utils.md5(user.getPassword()));
		user.setUpdated(new Date());
		user.setCreated(new Date());
		user.setId(id);
		user.setUsername(user.getPhone());
		int a=userMapper.insert(user);
		
		return FastJsonUtil.toJSONString(user);
	}

	/**
	 * 登录通过登录名和密码做校验
	 * 先给密码加密，再查询
	 */
	public String login(User user){
		UserExample example=new UserExample();
		Criteria create=example.createCriteria();
		create.andUsernameEqualTo(user.getUsername());
		create.andPasswordEqualTo(MD5Utils.md5(user.getPassword()));
		List<User> listuser=userMapper.selectByExample(example);
		System.out.println(listuser.size()+"list长度");
		if (listuser.size()>0) {
			user=listuser.get(0);
			String louser=FastJsonUtil.toJSONString(user);
			return louser;
			
		}
		return null ;
	}

	/**
	 * 更新用户信息
	 */
	public int update(User user) {
		return userMapper.updateByPrimaryKey(user);
	}
	
	/**
	 * 根据用户id查找用户
	 */
	public User findById(String id) {
		return userMapper.selectByPrimaryKey(id);
	}
}
