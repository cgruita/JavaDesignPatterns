package com.gruita.java.designpattern.adapter;

/**
 * 
 * @author cristian.gruita
 * 
 *         Used when there is an object available (in this case, ConcatedName),
 *         but the method id only taking in a different type of object
 *         (SplitName) Happened in Betty several times.
 */
public class TestAdapter {

	public static void methodTakingInSplitName(SplitName splitName) {
		System.out
				.println("Customer's first name: " + splitName.getFirstName());
		System.out.println("Customer's last name: " + splitName.getLastName());
	}

	public static void main(String args[]) {

		ConcatenatedName fullName = new ConcatenatedName();

		fullName.setName("Joshua Bloch");

		ConcatToSplitName adapter = new ConcatToSplitName(fullName);

		SplitName splitName = adapter.getSplitName();

		System.out.println("split name is: " + splitName.getFirstName() + ", "
				+ splitName.getLastName());

		methodTakingInSplitName(splitName);

	}
}
