package com.yxz.entity;

public class UserInfo {
	private int id;
	private String loginId;
	private String userName;
	private String password;
	private String extNote;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getExtNote() {
		return extNote;
	}
	public void setExtNote(String extNote) {
		this.extNote = extNote;
	}
}
