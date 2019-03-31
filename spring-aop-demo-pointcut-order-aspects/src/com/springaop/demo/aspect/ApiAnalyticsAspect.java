package com.springaop.demo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class ApiAnalyticsAspect {

	@Before("com.springaop.demo.aspect.AopExpressions.forAllMethodsInDAOPackageAndNoGetterrSetterMethods()")
	public void performApiAnalytics() {
		System.out.println("\n=====>>> Performing API analytics");		
	}

}
