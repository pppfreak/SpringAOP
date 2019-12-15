package com.aop.demo;

import org.springframework.stereotype.Component;

@Component
public class Account {

	String name;
	String accountType;
	
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccounttype() {
		return accountType;
	}
	public void setAccounttype(String accounttype) {
		this.accountType = accounttype;
	}
	
		@Override
	public String toString() {
		return "Account [name=" + name + ", accounttype=" + accountType + "]";
	}
}
