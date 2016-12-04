package com.gruita.java.designpattern.composite;

/**
 * Basic class, kept just because of the name, which is common for all classes
 * in ToDo
 * 
 * @author Cristian.Gruita
 *
 */
public abstract class ToDoItem {

	protected String mName;

	public ToDoItem() {

	}

	public ToDoItem(String name) {

		mName = name;
	}

	public String getName() {
		return mName;
	}

	public abstract String toString();

}
