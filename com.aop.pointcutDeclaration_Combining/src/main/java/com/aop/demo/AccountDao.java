package com.aop.demo;

import org.springframework.stereotype.Component;

@Component
public class AccountDao {

	public String addAccount() {
		System.out.println(getClass()+": doing in db");
		return null;
	}
	public void addAccountForCreate(Account acc) {
		System.out.println("Create Account");
	}
	public void performApiAnylitic() {
		System.out.println("Perform analytic");
	}
	
}
