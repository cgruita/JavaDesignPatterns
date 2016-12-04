package com.gruita.java.designpattern.state;

import java.util.Random;

public class GotApplicationState implements State {
	AutomatInterface automat;
	Random random;

	public GotApplicationState(AutomatInterface d) {
		automat = d;
		random = new Random();
	}

	public String gotApplication() {
		return "\tWe already got your application.";
	}

	public String checkApplication() {
		int yesno = random.nextInt(10) % 10;

		if (yesno > 4 && automat.getCount() > 0) {
			automat.setState(automat.getApartmentRentedState());
			return "\tCongratulations, you were approved.";
		} else {
			automat.setState(automat.getWaitingState());
			return "\tSorry, you were not approved.";
		}
	}

	public String rentApartment() {
		return "\tYou must have your application checked.";
	}

	public String dispenseKeys() {
		return "\tYou must have your application checked.";
	}
}
