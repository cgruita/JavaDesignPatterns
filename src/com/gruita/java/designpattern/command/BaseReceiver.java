package com.gruita.java.designpattern.command;

public abstract class BaseReceiver implements Receiver {

	@Override
	public void uninstallApp() {
		System.out.println("Uninstalling app");

	}

	@Override
	public void installApp() {
		System.out.println("Installing app");

	}

	@Override
	public void login() {
		System.out.println("Betty Login");

	}

	@Override
	public abstract void clickTab();

	@Override
	public abstract void performGetTests();

	@Override
	public abstract void performPostTests();

	@Override
	public void logResults() {
		System.out.println("Log results");

	}

}
