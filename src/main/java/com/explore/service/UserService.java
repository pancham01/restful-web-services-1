package com.explore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.explore.dao.UserDao;
import com.explore.model.User;

import jakarta.transaction.Transactional;

@Service
public class UserService {
	@Autowired
	private UserDao userDao;
	
	@Transactional
	public void addUser(User user) {
		System.out.println("UserService.addUser()");
		userDao.addUser(user);
	}
}
