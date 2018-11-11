package com.infosys.nsk.jersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/world")
public class MyMessengerResource {

	@GET
	@Produces(MediaType.APPLICATION_ATOM_XML)
	public String viewProfile() {

		return "Welcome to RestFul Webservice World";

	}

}
