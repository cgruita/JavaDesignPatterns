package com.gruita.java.designpattern.template;

public class TabTodo extends TabSetupTemplate {
	private String name;

	public TabTodo(String n) {
		name = n;
	}

	public void createFragment() {
		System.out.println("Todo Fragment creation....");
	}

	protected void callWS() {
		System.out.println("Calling Todo WS....");

	}

	public void test() {
		System.out.println("Testing TODO....");
	}

	public String getName() {
		return name;
	}
}
