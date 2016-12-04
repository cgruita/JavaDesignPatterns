package com.gruita.java.designpattern.command;

public class TodoTab extends BaseReceiver {

	@Override
	public void clickTab() {
		System.out.println("Clicking the todo tab");

	}

	@Override
	public void performGetTests() {
		System.out.println("Testing todo get");

	}

	@Override
	public void performPostTests() {
		System.out.println("Testing todo post");

	}

}
