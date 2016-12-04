package com.gruita.java.designpattern.composite;

public class Meal extends Task {

	public Meal(String name) {
		super(name);
	}

	@Override
	public ToDoUtil.TaskType getTaskType() {
		return ToDoUtil.TaskType.MEALS;
	}

}
