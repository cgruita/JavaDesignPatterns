package com.gruita.java.designpattern.state;

public class ApartmentRentedState implements State {
	AutomatInterface automat;

	public ApartmentRentedState(AutomatInterface d) {
		automat = d;
	}

	public String gotApplication() {
		return "\tHang on, we're renting you an apartment.";
	}

	public String checkApplication() {
		return "\tHang on, we're renting you an apartment.";
	}

	public String rentApartment() {
		automat.setCount(automat.getCount() - 1);
		return "\tRenting you an apartment....";
	}

	public String dispenseKeys() {
		if (automat.getCount() <= 0) {
			automat.setState(automat.getFullyRentedState());

		} else {
			automat.setState(automat.getWaitingState());
		}
		return "\tHere are your keys!";
	}
}
