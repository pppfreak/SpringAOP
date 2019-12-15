package com.aop.demo.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class CloudLogAysc {

	@Before("com.aop.demo.aspects.Control_Pointcut_Aop.forDaoPackage()")
	public void cloudLog() {
		System.out.println("=====>cloud log");
	}
}
