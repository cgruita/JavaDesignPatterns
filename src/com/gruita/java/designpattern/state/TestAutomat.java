package com.gruita.java.designpattern.state;

/**
 * 
 * @author cristian.gruita
 * 
 *         This pattern is useful for situations where the system should react a
 *         certain way based on a specific state. This implementation manages an
 *         apartment renting solution. The states are objects themselves, and
 *         the manager (Automat) is passed on to the states, which act
 *         accordingly. For an overview of how this should work, please see
 *         screenshot in the *.doc package
 */
public class TestAutomat {
	Automat automat;

	public static void main(String args[]) {
		new TestAutomat();
	}

	public TestAutomat() {
		automat = new Automat(2);

		for (int i = 0; i < 8; i++) {
			System.out.println("iteration: " + i);
			automat.gotApplication();
			automat.checkApplication();
			automat.rentApartment();
		}
	}
}
