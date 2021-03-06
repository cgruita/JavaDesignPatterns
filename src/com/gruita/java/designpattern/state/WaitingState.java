package com.gruita.java.designpattern.state;

public class WaitingState implements State {
	AutomatInterface automat;

	public WaitingState(AutomatInterface d) {
		automat = d;
	}

	public String gotApplication() {
		automat.setState(automat.getGotApplicationState());
		return "\tThanks for the application.";
	}

	public String checkApplication() {
		return "\tYou have to submit an application.";
	}

	public String rentApartment() {
		return "\tYou have to submit an application.";
	}

	public String dispenseKeys() {
		return "\tYou have to submit an application.";
	}
}
