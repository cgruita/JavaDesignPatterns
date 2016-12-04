package com.gruita.java.designpattern.state;

public class FullyRentedState implements State {
	AutomatInterface automat;

	public FullyRentedState(AutomatInterface d) {
		automat = d;
	}

	public String gotApplication() {
		return "\tSorry, we're fully rented.";
	}

	public String checkApplication() {
		return "\tSorry, we're fully rented.";
	}

	public String rentApartment() {
		return "\tSorry, we're fully rented.";
	}

	public String dispenseKeys() {
		return "\tSorry, we're fully rented.";
	}
}
