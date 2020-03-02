package com.ers.service;

import com.ers.daos.UserDao;
import com.ers.models.Users;

public class LoginService {
	public static boolean authenticate(String username, String HashedPassword) {
		if (username==null) {
			return false;
		}
		
		Users userInfo = UserDao.logIfExist(username, HashedPassword);
		String inputtedPassword = String.valueOf(HashedPassword);

		if ((userInfo != null) && (inputtedPassword.equals(userInfo.getPassword()))) {
			System.out.println("User Exist and Correct Password");
			return true;
		} 
		System.out.println(inputtedPassword);
		return false;
		
	}
}
