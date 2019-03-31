package com.springaop.demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.springaop.demo.model.Account;

@Component
public class AccountDAO {

	public List<Account> findAcounts() {
		System.out.println("In findAcounts()");
		List<Account> myAccounts = new ArrayList<>();
		Account account1 = new Account("Taher", "aa");
		Account account2 = new Account("Balendra", "bb");
		Account account3 = new Account("Chandan", "cc");
		myAccounts.add(account1);
		myAccounts.add(account2);
		myAccounts.add(account3);
		return myAccounts;
	}

}
