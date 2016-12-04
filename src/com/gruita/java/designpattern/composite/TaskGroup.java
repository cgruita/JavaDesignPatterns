package com.gruita.java.designpattern.composite;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Wrapper for an array of Task objects Allows to iterate through the tasks
 *
 */
public class TaskGroup extends ToDoItem {
	private ArrayList<Task> mTasks = new ArrayList<Task>();

	// private int mNumber = 0;

	public TaskGroup(String name) {
		super(name);
	}

	public void add(Task task) {
		mTasks.add(task);
	}

	public Iterator<?> iterator() {
		return new TaskGroupIterator(mTasks);
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		Iterator<?> iterator = iterator();

		sb.append(String.format("<<%s>>", getName()));
		sb.append("\nContent: ");

		while (iterator.hasNext()) {
			ToDoItem c = (ToDoItem) iterator.next();
			sb.append("\n\t\t" + c.toString());
		}
		return sb.toString();
	}

}
