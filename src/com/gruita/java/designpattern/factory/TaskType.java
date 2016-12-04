package com.gruita.java.designpattern.factory;

public enum TaskType {

	APPOINTMENT(0), MEAL(1), MEDICATION(2), CHORE(3), GENERIC(4);

	int type;

	TaskType(int type) {
		this.type = type;
	}

	public String getConnectionTypeAsString() {
		switch (type) {
		case 0:
			return "Appointment";
		case 1:
			return "Meal";
		case 2:
			return "Medication";
		case 3:
			return "Chore";
		default:
			return "Generic";
		}
	}

}
