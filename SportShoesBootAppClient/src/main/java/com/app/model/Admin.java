package com.app.model;

public class Admin {
	
	private int userid;
	private String username;
	private String password;
	
	public Admin()
	{
		
	}
	

	public Admin(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}


	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
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


	@Override
	public String toString() {
		return "Admin [userid=" + userid + ", username=" + username + ", password=" + password + "]";
	}
	

}
