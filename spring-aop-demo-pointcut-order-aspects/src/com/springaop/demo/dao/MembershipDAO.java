package com.springaop.demo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {

	public void addSillyMember() {
		System.out.println(getClass() + ": Doing my DB work, addSillyMember()");
	}

}
