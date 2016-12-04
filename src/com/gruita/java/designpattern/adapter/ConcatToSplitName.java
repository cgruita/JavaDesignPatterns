package com.gruita.java.designpattern.adapter;

public class ConcatToSplitName implements SplitNameInterface {
	ConcatenatedName aceObject;
	String firstName;
	String lastName;

	public ConcatToSplitName(ConcatenatedName a) {
		aceObject = a;
		firstName = aceObject.getName().split(" ")[0];
		lastName = aceObject.getName().split(" ")[1];
	}

	public SplitName getSplitName() {
		return new SplitName(firstName, lastName);
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
