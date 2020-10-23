package com.varsha.springcore.springcoreadvanced.autowiring.assgn;

import org.springframework.beans.factory.annotation.Autowired;

public class Customer {
	private String name;
	@Autowired
	private Reservation rsvr;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Reservation getRsvr() {
		return rsvr;
	}

	public void setRsvr(Reservation rsvr) {
		this.rsvr = rsvr;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", rsvr=" + rsvr + "]";
	}
}
