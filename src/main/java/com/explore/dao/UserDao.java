package com.explore.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.explore.model.User;

@Repository
public class UserDao {
	@Autowired
	private UserRepo userRepo;

	public void addUser(User user) {
		System.out.println("UserDao.addUser()");
		user.setId(1l);
		userRepo.save(user);
	}

}
