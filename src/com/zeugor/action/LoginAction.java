package com.zeugor.action;

public class LoginAction {

	private String userName;

	public String execute() {
		System.out.println("login action 1");

		if (userName == null || userName.isEmpty()) {
			return "error";
		} else {
			return "success";
		}
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}
