package com.zeugor.action;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction3 extends ActionSupport
{
	// private static final long serialVersionUID = 6677091252031583948L;
	private String userName;

	@Override
	public String execute()
	{
		System.out.println("login action 3 2");
		return "success";
	}

	public String getUserName()
	{
		return userName;
	}

	public void setUserName(String userName)
	{
		this.userName = userName;
	}

	@Override
	public void validate()
	{
		if (userName == null || userName.isEmpty())
		{
			addFieldError("userName", getText("username.required"));
		}
	}
}