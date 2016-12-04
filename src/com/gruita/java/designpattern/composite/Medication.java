package com.gruita.java.designpattern.composite;

public class Medication extends Task {

	public Medication(String name) {
		super(name);
	}

	@Override
	public ToDoUtil.TaskType getTaskType() {
		return ToDoUtil.TaskType.MEDS;
	}

}
