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
	 * ��ѯ�绰�����Ƿ��ù�
	 */
	public User checklophone(String phone) {
		User user=userMapper.checklophone(phone);
		return user;
	}

	/**
	 * �����û���������Ҫ����
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
	 * ��¼ͨ����¼����������У��
	 * �ȸ�������ܣ��ٲ�ѯ
	 */
	public String login(User user){
		UserExample example=new UserExample();
		Criteria create=example.createCriteria();
		create.andUsernameEqualTo(user.getUsername());
		create.andPasswordEqualTo(MD5Utils.md5(user.getPassword()));
		List<User> listuser=userMapper.selectByExample(example);
		System.out.println(listuser.size()+"list����");
		if (listuser.size()>0) {
			user=listuser.get(0);
			String louser=FastJsonUtil.toJSONString(user);
			return louser;
			
		}
		return null ;
	}

	/**
	 * �����û���Ϣ
	 */
	public int update(User user) {
		return userMapper.updateByPrimaryKey(user);
	}
	
	/**
	 * �����û�id�����û�
	 */
	public User findById(String id) {
		return userMapper.selectByPrimaryKey(id);
	}
}
