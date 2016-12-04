package com.gruita.java.designpattern.factory;

public class AppointmentTask extends TaskBase {

	public String description() {
		return TaskType.APPOINTMENT.getConnectionTypeAsString();
	}
}
