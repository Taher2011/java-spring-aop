package com.springaop.demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	@After("execution(* com.springaop.demo.dao.AccountDAO.findAcounts(..))")
	public void afterFinallyFindAcountsAdvice(JoinPoint joinPoint) {
		String method = joinPoint.getSignature().toShortString();
		System.out.println("\n=====>>> Executing @After on method " + method);
	}

}
