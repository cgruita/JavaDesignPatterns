package com.gruita.java.designpattern.chain;

public class IntermediateLayer implements HelpInterface {
	final int FRONT_END_HELP = 1;
	final int INTERMEDIATE_LAYER_HELP = 2;
	HelpInterface successor;

	public IntermediateLayer(HelpInterface s) {
		successor = s;
	}

	public void getHelp(HelpLevel helpConstant) {
		if (helpConstant != HelpLevel.INTERMEDIATE) {
			System.out
					.println("Intermediate layer cannot handle it. Passing it up.");
			successor.getHelp(helpConstant);
		} else {
			System.out.println("This is the intermediate layer. Nice, eh?");
		}
	}
}
