package com.springaop.demo.client;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springaop.demo.config.DemoConfig;
import com.springaop.demo.dao.AccountDAO;
import com.springaop.demo.model.Account;

public class MainDemoApp {

	public static void main(String[] args) {

		// read the spring config class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

		// get the bean from spring container
		AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);

		List<Account> accounts = accountDAO.findAcounts();
		System.out.println();
		System.out.println("Accounts : " + accounts);
		// close the context
		context.close();
	}

}
