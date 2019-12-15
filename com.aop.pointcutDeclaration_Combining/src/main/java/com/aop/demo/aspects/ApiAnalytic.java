package com.aop.demo.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class ApiAnalytic {


	@Before("com.aop.demo.aspects.Control_Pointcut_Aop.forDaoPackage()")
	public void performApiAnalytics() {
		System.out.println("=======>>>Perform setter method for API analytics");
	}
}
