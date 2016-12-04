package com.gruita.java.designpattern.template;

public class TabAppointments extends TabSetupTemplate {
	private String name;

	public TabAppointments(String n) {
		name = n;
	}

	public void createFragment() {
		System.out.println("Appoointments Fragment creation....");
	}

	protected void callWS() {
		System.out.println("Calling Appointments WS....");

	}

	public void test() {
		System.out.println("Testing TODO....");
	}

	public String getName() {
		return name;
	}

	public boolean needsTesting() {
		return false;
	}

}
