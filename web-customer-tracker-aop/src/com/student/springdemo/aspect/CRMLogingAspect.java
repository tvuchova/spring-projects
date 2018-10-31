package com.student.springdemo.aspect;

import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CRMLogingAspect {

	// set up loger
	private Logger myLogger = Logger.getLogger(getClass().getName());

	@Pointcut("execution(* com.student.springdemo.service.*.*(..))")
	private void forServicePackage() {
	}

	// setup pointcut declarations
	@Pointcut("execution(* com.student.springdemo.controller.*.*(..))")
	private void forControllerPackage() {
	}

	// add @Before advice
	@Pointcut("execution(* com.student.springdemo.dao.*.*(..))")
	private void forDaoPackage() {
	}

	@Pointcut("forServicePackage()||forControllerPackage()||forDaoPackage()")
	private void forAppFlow() {
	}

	//
	@Before("forAppFlow()")
	public void before(JoinPoint theJoinPoint) {
		String theMethod = theJoinPoint.getSignature().toShortString();
		myLogger.info("===>> in @Before:calling method :" + theMethod);
		Object[] args = theJoinPoint.getArgs();
		for (Object tempArg : args) {
			myLogger.info("===>> argument " + tempArg);
		}

	}

	// add @AfterReturning
	@AfterReturning(pointcut = "forAppFlow()", returning = "theResult")
	public void afterReturning(JoinPoint theJoinPoint, Object theResult) {
		String theMethod = theJoinPoint.getSignature().toShortString();
		myLogger.info("===>> in @AfterReturning:calling method :" + theMethod);
		myLogger.info("===>>  result: " + theResult);
	}

}
