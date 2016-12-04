package com.gruita.java.designpattern.composite;

/**
 * Base class for all tasks
 * 
 * @author Cristian.Gruita
 *
 */
public abstract class Task extends ToDoItem {

	public Task(String name) {
		super(name);
	}

	@Override
	public String toString() {
		return String.format("Task name: %20s  \tType: %15s", getName(),
				getTaskType());
	}

	public abstract ToDoUtil.TaskType getTaskType();

}
