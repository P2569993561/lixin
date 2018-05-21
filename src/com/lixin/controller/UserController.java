package com.lixin.controller;

import javax.servlet.http.HttpSession;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lixin.pojo.User;
import com.lixin.service.UserService;


/**
 * �û�
 * @version1.0
 * @author PHF
 *
 */
@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	/**
	 * ����
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/update")
	@ResponseBody
	public String update(String id,String password)throws Exception{
		
		User user=userService.findById(id);
		int a=userService.update(user);
		System.out.println(a);
		return "������";
	}
	
	
	/**
	 * ��¼
	 * @param name
	 * @param password
	 * @return
	 */
	@RequestMapping("/login")
	@ResponseBody
	public String login(HttpSession session,String name,String password) {
		User user=new User();
		user.setPassword(password);
		user.setUsername(name);
		
		System.out.println(name+password);
		String louser="";
		louser=userService.login(user);
		if (user!=null) {
			session.setAttribute("User", user);
		}
		return louser;
	}
	
	/**
	 * ע��
	 * @param phone
	 * @param password
	 * @return
	 */
	@RequestMapping("/regist")
	@ResponseBody
	public String regist(String phone,String password) {
		
		System.out.println(phone+password+"---------------");
		// �����������
		User user=new User();
		user.setPhone(phone);
		user.setPassword(password);
		
		
		return userService.save(user);
	}
	
	/**
	 * ��ѯ�����Ƿ�ע���
	 * @param phone
	 * @return
	 */
	@RequestMapping("/checklophone")
	@ResponseBody
	public String checklophone(String phone){
	User user=userService.checklophone(phone);
	if (user==null) {
		return "{\"resultcode\": \"0\",\"reason\": \"����ע��!\"}";
	}
		return "{\"resultcode\": \"1\",\"reason\": \"�˻��ѱ�ע��!\"}";
	}
	
	
	
	//�˳�
	@RequestMapping("/logout")
	public String logout(HttpSession session)throws Exception{
		
		//session����
		session.invalidate();
		
		return null;
	}

}
