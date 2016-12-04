package com.gruita.java.designpattern.chain;

public class FrontEnd implements HelpInterface {

	HelpInterface successor;

	public FrontEnd(HelpInterface s) {
		successor = s;
	}

	public void getHelp(HelpLevel helpConstant) {
		if (helpConstant != HelpLevel.FRONT_END) {
			System.out.println("Front end cannot handle it. Passing it up.");
			successor.getHelp(helpConstant);
		} else {
			System.out.println("This is the front end. Don't you like it?");
		}
	}
}
