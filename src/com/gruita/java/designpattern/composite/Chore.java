package com.gruita.java.designpattern.composite;

public class Chore extends Task {

	public Chore(String name) {
		super(name);
	}

	@Override
	public ToDoUtil.TaskType getTaskType() {
		return ToDoUtil.TaskType.CHORES;
	}

}
