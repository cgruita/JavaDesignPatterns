package com.gruita.java.designpattern.command;

public interface Receiver {
	public void uninstallApp();

	public void installApp();

	public void login();

	public void clickTab();

	public void performGetTests();

	public void performPostTests();

	public void logResults();
}
