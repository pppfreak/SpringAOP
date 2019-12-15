package com.aop.demo.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Control_Pointcut_Aop {

	@Pointcut("execution(** com.aop.demo.*.add*(..))")
	public void forDaoPackage() {}
	
	@Pointcut("execution(** com.aop.demo.*.get*(..))")
	public void getter() {}
	
	@Pointcut("execution(** com.aop.demo.*.set*(..))")
	public void setter() {}
	
	@Pointcut("execution(** com.aop.demo.*.perform*(..))")
	public void pointCutBefore() {}
	
	
}
