package com.springaop.demo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	@Pointcut("execution(public void addAccount())")
	private void forAlladdAccountMethods() {
	}

	@Before("forAlladdAccountMethods()")
	public void beforeAddAccountAdvice() {
		System.out.println("======>Executing @Before advice on addAccount()");
	}

}
