package com.jereh.service.impl;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import com.jereh.dao.UserDao;
import com.jereh.entity.User;
import com.jereh.service.UserService;

@Service

public class UserServiceImpl implements UserService {

	@Resource
	private UserDao dao;
	
	@Override
	public String login(HttpSession session,User user) {
		// TODO Auto-generated method stub
		User realUser=dao.findUser(user);
		if(realUser!=null) {
			session.setAttribute("user", realUser);
			return "success";
		} else {
			return "fail";
		}
	}

}
