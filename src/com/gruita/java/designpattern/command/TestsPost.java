package com.gruita.java.designpattern.command;

public class TestsPost implements Command {
	Receiver receiver;

	public TestsPost(Receiver r) {
		receiver = r;
	}

	public void execute() {
		System.out.println("Executing...");
		receiver.uninstallApp();
		receiver.installApp();
		receiver.login();
		receiver.clickTab();
		receiver.performPostTests();
		receiver.logResults();
		System.out.println();
	}

}
