package com.infosys.nsk.jersey;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.infosys.nsk.jersey.model.User;
import com.infosys.nsk.jersey.service.UserService;

@Path("/users")
public class MyMessengerResource {

	UserService user_service;

	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<User> viewProfile() {

		user_service = new UserService();
		return user_service.getAllUserdetails();

	}
	
	
	

}
