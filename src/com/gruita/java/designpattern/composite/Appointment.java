package com.gruita.java.designpattern.composite;

public class Appointment extends Task {

	public Appointment(String name) {
		super(name);

	}

	@Override
	public ToDoUtil.TaskType getTaskType() {
		return ToDoUtil.TaskType.APPOINTMENTS;
	}

}
