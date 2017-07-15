package com.jereh.service;

import javax.servlet.http.HttpSession;

import com.jereh.entity.User;

public interface UserService {
	
	String login(HttpSession session,User user);

}
