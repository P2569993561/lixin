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
 * 用户
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
	 * 更新
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
		return "无无无";
	}
	
	
	/**
	 * 登录
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
	 * 注册
	 * @param phone
	 * @param password
	 * @return
	 */
	@RequestMapping("/regist")
	@ResponseBody
	public String regist(String phone,String password) {
		
		System.out.println(phone+password+"---------------");
		// 接收请求参数
		User user=new User();
		user.setPhone(phone);
		user.setPassword(password);
		
		
		return userService.save(user);
	}
	
	/**
	 * 查询号码是否被注册过
	 * @param phone
	 * @return
	 */
	@RequestMapping("/checklophone")
	@ResponseBody
	public String checklophone(String phone){
	User user=userService.checklophone(phone);
	if (user==null) {
		return "{\"resultcode\": \"0\",\"reason\": \"可以注册!\"}";
	}
		return "{\"resultcode\": \"1\",\"reason\": \"账户已被注册!\"}";
	}
	
	
	
	//退出
	@RequestMapping("/logout")
	public String logout(HttpSession session)throws Exception{
		
		//session过期
		session.invalidate();
		
		return null;
	}

}
