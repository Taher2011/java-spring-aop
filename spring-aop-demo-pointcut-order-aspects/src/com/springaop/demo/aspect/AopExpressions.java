package com.springaop.demo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AopExpressions {
	
	@Pointcut("execution(* com.springaop.demo.dao.*.*(..))")
	public void forAllMethodsInDAOPackage() {
	}

	@Pointcut("execution(* com.springaop.demo.dao.*.get*(..))")
	public void forGetterMethods() {
	}

	@Pointcut("execution(* com.springaop.demo.dao.*.set*(..))")
	public void forSetterMethods() {
	}

	@Pointcut("forAllMethodsInDAOPackage() && !(forGetterMethods() || forSetterMethods())")
	public void forAllMethodsInDAOPackageAndNoGetterrSetterMethods() {
	}

	@Before("forAllMethodsInDAOPackageAndNoGetterrSetterMethods()")
	public void beforeAddAdvice() {
		System.out.println("======>Executing @Before advice on addAccount()");
	}
}
