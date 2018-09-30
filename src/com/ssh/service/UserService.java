package com.ssh.service;

import com.ssh.base.UserDao;
import com.ssh.domain.User;


public class UserService {
	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}


	public boolean save(User user) {
        System.out.println("ProductService.save()...");
        boolean flag = userDao.save(user);
        return flag;
    }
}
