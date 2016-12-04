package com.gruita.java.designpattern.template;

public abstract class TabSetupTemplate {

	public final void go() {
		createDynamicLayouts();
		createFragment();
		callWS();
		updateDb();
		if (needsTesting()) {
			test();
		}

	}

	protected void createDynamicLayouts() {
		System.out.println("Creating Dynamic Layouts....");
	}

	protected void createFragment() {
		System.out.println("Creating Fragment....");
	}

	protected void callWS() {
		System.out.println("Calling WS....");

	}

	protected void updateDb() {
		System.out.println("Updating Db....");
	}

	protected void test() {
		System.out.println("Testing....");
	}

	protected boolean needsTesting() {
		return true;
	}
}
