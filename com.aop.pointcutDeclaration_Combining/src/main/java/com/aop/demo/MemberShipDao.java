package com.aop.demo;

import org.springframework.stereotype.Component;

@Component
public class MemberShipDao {

	public void addAccount() {
		System.out.println(getClass()+"Member ship dao");
	}
	
	public void test() {
		System.out.println(getClass()+"Check test method");
	}
	
}
