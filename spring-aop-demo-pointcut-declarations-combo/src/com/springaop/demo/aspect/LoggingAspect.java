package com.springaop.demo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	@Pointcut("execution(* com.springaop.demo.dao.*.*(..))")
	private void forAllMethodsInDAOPackage() {
	}

	@Pointcut("execution(* com.springaop.demo.dao.*.get*(..))")
	private void forGetterMethods() {
	}

	@Pointcut("execution(* com.springaop.demo.dao.*.set*(..))")
	private void forSetterMethods() {
	}

	@Pointcut("forAllMethodsInDAOPackage() && !(forGetterMethods() || forSetterMethods())")
	private void forAllMethodsInDAOPackageAndNoGetterrSetterMethods() {
	}

	@Before("forAllMethodsInDAOPackageAndNoGetterrSetterMethods()")
	public void beforeAddAdvice() {
		System.out.println("======>Executing @Before advice on addAccount()");
	}

}
