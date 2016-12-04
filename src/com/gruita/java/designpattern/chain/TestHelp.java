package com.gruita.java.designpattern.chain;

/**
 * 
 * @author cristian.gruita
 * 
 *         Whenever an object cannot handle a request, it will pass it on to
 *         another object, which is passed on to its constructor.
 */
public class TestHelp {
	public static void main(String args[]) {

		GeneralSupport general = new GeneralSupport();

		IntermediateLayer intermediateLayer = new IntermediateLayer(general);

		FrontEnd frontEnd = new FrontEnd(intermediateLayer);

		frontEnd.getHelp(HelpLevel.GENERAL);

	}
}
