package com.aop.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoMainApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

		System.out.println(".....Account DAO.....");
		
		AccountDao account = context.getBean(AccountDao.class);
		account.addAccount();
		//account.performApiAnylitic();
		System.out.println();
//		System.out.println(".....Member DAO.....");
//		System.out.println();
//		MemberShipDao member = context.getBean("memberShipDao", MemberShipDao.class);
//		member.addAccount();
//		member.test();
		System.out.println();
		System.out.println(".....Account.....");
		
		Account acc = context.getBean(Account.class);
		acc.setName("Rajib");
		acc.setAccounttype("Fixed deposite");
		account.addAccountForCreate(acc);
		
		
		context.close();
	}
}
