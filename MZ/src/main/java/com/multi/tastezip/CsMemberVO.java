package com.multi.tastezip;

public class CsMemberVO {
	private String user_id;
	private String user_pw;
	private String username;
	
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_pw() {
		return user_pw;
	}
	public void setUser_pw(String user_pw) {
		this.user_pw = user_pw;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	@Override
	public String toString() {
		return "CsMemberVO [user_id=" + user_id + ", user_pw=" + user_pw + ", username=" + username + "]";
	}
	
	
}
