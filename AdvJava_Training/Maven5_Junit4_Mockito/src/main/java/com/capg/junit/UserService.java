package com.capg.junit;

public class UserService {
   
	private UserDao userDao;
	
	public UserService(UserDao userDao) {
		this.userDao=userDao;
	}
	
	public String getUsername(int id) {
		return userDao.findUsernameById(id);
	}
}
