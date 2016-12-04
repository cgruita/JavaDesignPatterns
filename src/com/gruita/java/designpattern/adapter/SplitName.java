package com.gruita.java.designpattern.adapter;

public class SplitName implements SplitNameInterface {
	String firstName;
	String lastName;

	public SplitName(String fname, String lname) {
		firstName = fname;
		lastName = lname;

	}

	public void setFirstName(String f) {
		firstName = f;
	}

	public void setLastName(String l) {
		lastName = l;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
}
