package com.gruita.java.designpattern.command;

public class TestsGet implements Command {
	Receiver receiver;

	public TestsGet(Receiver r) {
		receiver = r;
	}

	public void execute() {
		System.out.println("Executing...");
		receiver.uninstallApp();
		receiver.installApp();
		receiver.login();
		receiver.clickTab();
		receiver.performGetTests();
		receiver.logResults();
		System.out.println();
	}

}
