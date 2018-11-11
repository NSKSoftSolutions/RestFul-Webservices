package com.infosys.nsk.jersey.service;

import java.util.ArrayList;
import java.util.List;

import com.infosys.nsk.jersey.model.User;

public class UserService {

	public List<User> getAllUserdetails() {
		User user = new User("Sajjad", "Navab", "Male");
		User user1 = new User("Sadakat", "Navab", "Male");
		User user2 = new User("Sharuk", "afkhan", "Male");

		List<User> userdetails = new ArrayList<User>();
		userdetails.add(user);
		userdetails.add(user1);
		userdetails.add(user2);

		return userdetails;
	}

}
