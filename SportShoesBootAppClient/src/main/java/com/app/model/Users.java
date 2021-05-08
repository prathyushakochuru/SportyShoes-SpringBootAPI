package com.app.model;

public class Users {
	
	private int userid;
	private String firstname;
	private String lastname;
	private String username;
	private String password;
	private String emailid;
	private String contact;
	
	public Users()
	{
		
	}

	public Users(String firstname, String lastname, String username, String password, String emailid, String contact) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.username = username;
		this.password = password;
		this.emailid = emailid;
		this.contact = contact;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "Users [userid=" + userid + ", firstname=" + firstname + ", lastname=" + lastname + ", username="
				+ username + ", password=" + password + ", emailid=" + emailid + ", contact=" + contact + "]";
	}
	
	

}
