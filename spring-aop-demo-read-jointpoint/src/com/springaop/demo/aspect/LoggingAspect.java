package com.springaop.demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class LoggingAspect {

	@Before("com.springaop.demo.aspect.AopExpressions.forAllMethodsInDAOPackageAndNoGetterrSetterMethods()")
	public void beforeAddAccountAdvice(JoinPoint joinPoint) {
		System.out.println("\n=====>>> Performing Logging analytics");

		MethodSignature signature = (MethodSignature) joinPoint.getSignature();
		System.out.println("Method : " + signature);

		Object arg[] = joinPoint.getArgs();
		for (Object object : arg) {
			System.out.println("Parameters of method are " + object);
		}
	}

}
