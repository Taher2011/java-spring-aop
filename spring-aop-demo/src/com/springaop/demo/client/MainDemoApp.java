package com.springaop.demo.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springaop.demo.config.DemoConfig;
import com.springaop.demo.dao.AccountDAO;
import com.springaop.demo.dao.MembershipDAO;

public class MainDemoApp {

	public static void main(String[] args) {

		// read the spring config class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

		// get the bean from spring container
		AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);
		MembershipDAO membershipDAO = context.getBean("membershipDAO", MembershipDAO.class);

		// call the business method
		accountDAO.addAccount();
		System.out.println();
		membershipDAO.addAccount();

		// close the context
		context.close();
	}

}
