package com.infosys.nsk.jersey.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User {

	private String first_name;
	private String last_name;
	private String gender;
	// private Date dataofbirth;

	public User() {

	}

	public User(String first_name, String last_name, String gender) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.gender = gender;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
