package com.gruita.java.designpattern.factory;

public abstract class TaskBase {
	public TaskBase() {
		System.out.println("Creating a task of type: " + description());
	}

	public String description() {
		return TaskType.GENERIC.getConnectionTypeAsString();
	}
}
