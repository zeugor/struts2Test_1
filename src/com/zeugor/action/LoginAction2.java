package com.zeugor.action;

import com.opensymphony.xwork2.Action;

public class LoginAction2 implements Action {
	@Override
	public String execute()
	{
		System.out.println("login action 2");
		return SUCCESS;
	}
}
