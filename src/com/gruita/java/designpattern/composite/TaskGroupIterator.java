package com.gruita.java.designpattern.composite;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Iterates through the tasks of the group
 * 
 * @author Cristian.Gruita
 * 
 */
public class TaskGroupIterator implements Iterator<Object> {
	private ArrayList<Task> toDo;
	private int location = 0;

	public TaskGroupIterator(ArrayList<Task> tasks) {
		toDo = tasks;
	}

	public java.lang.Object next() {
		return toDo.get(location++);
	}

	public boolean hasNext() {
		if (location < toDo.size() && toDo.get(location) != null) {
			return true;
		} else {
			return false;
		}
	}

	public void remove() {
	}
}
