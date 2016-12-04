package com.gruita.java.designpattern.chain;

public class GeneralSupport implements HelpInterface {

	public GeneralSupport() {
	}

	public void getHelp(HelpLevel helpConstant) {
		System.out.println("This is the General Support");
	}
}
