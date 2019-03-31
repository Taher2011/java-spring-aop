package com.springaop.demo.aspect;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import com.springaop.demo.model.Account;

@Aspect
@Component
public class LoggingAspect {

	@AfterReturning(pointcut = "execution(* com.springaop.demo.dao.AccountDAO.findAcounts(..))", returning = "result")
	public void afterReturningFindAcountsAdvice(JoinPoint joinPoint, List<Account> result) {
		String method = joinPoint.getSignature().toShortString();
		System.out.println("\n=====>>> Executing @AfterReturning on method " + method);
		System.out.println("\n=====>>> result is  " + result);
		converAccountNameToUpperCase(result);
		System.out.println("\n=====>>> result is  " + result);
	}

	public void converAccountNameToUpperCase(List<Account> result) {
		for (Account account : result) {
			String accountName = account.getName().toUpperCase();
			account.setName(accountName);
		}
	}

}
