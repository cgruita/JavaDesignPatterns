package com.gruita.java.designpattern.composite;

import java.util.ArrayList;
import java.util.Iterator;

public class ToDo extends ToDoItem {
	private ArrayList<ToDoItem> toDoItems = new ArrayList<ToDoItem>();

	public ToDo() {
	}

	public void add(ToDoItem c) {
		toDoItems.add(c);
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		Iterator<ToDoItem> iterator = toDoItems.iterator();

		while (iterator.hasNext()) {
			ToDoItem c = (ToDoItem) iterator.next();
			sb.append("--------------------------------------------------------------------------------------------------\n");
			sb.append(c.toString() + "\n");

		}
		return sb.toString();
	}

}
