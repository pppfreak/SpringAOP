package com.aop.demo.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.aop.demo.Account;

@Aspect
@Component
@Order(3)
public class MyDemoLoggingAccount {
	
	@Before("com.aop.demo.aspects.Control_Pointcut_Aop.forDaoPackage()")
	public void beforeAddAccountAdvise(JoinPoint theJoinPoint) {
		
		
		System.out.println("======>>>Before add account");
		
		MethodSignature methodSig = (MethodSignature) theJoinPoint.getSignature();
		
		System.out.println("Method: "+methodSig);
		
		Object[] arg = theJoinPoint.getArgs();
		
		for (Object temp : arg) {
			System.out.println(temp);
			
			if(temp instanceof Account) {
				Account acc = (Account) temp;
				System.out.println("Account name "+acc.getName());
				System.out.println("Account type "+acc.getAccounttype());
			}
		}
	}
	
	@Before("com.aop.demo.aspects.Control_Pointcut_Aop.setter()")
	public void beforeSetAccountType() {
		System.out.println("======>>Before set account type");
	}
	
	
}
