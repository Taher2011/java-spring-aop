package com.springaop.demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	@AfterThrowing(pointcut = "execution(* com.springaop.demo.dao.AccountDAO.findAcounts(..))", throwing = "exception")
	public void afterThrowingFindAcountsAdvice(JoinPoint joinPoint, Throwable exception) {
		String method = joinPoint.getSignature().toShortString();
		System.out.println("\n=====>>> Executing @@AfterThrowing on method " + method);
		// log the exception
		System.out.println("\n=====>>> The exception is: " + exception);
	}

}
