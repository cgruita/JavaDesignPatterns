package com.gruita.java.designpattern.command;

public class AppointmentsTab extends BaseReceiver {

	@Override
	public void clickTab() {
		System.out.println("Clicking the Appointments tab");

	}

	@Override
	public void performGetTests() {
		System.out.println("Testing appointments get");

	}

	@Override
	public void performPostTests() {
		System.out.println("Testing appointments post");

	}

}
