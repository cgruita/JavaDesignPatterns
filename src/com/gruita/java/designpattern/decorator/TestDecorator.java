package com.gruita.java.designpattern.decorator;

/**
 * 
 * @author cristian.gruita
 *
 *         Useful when several features will be added to an object, like
 *         components to a computer, and there are too many combinations of
 *         them, so the code would become too complex if all those combinations
 *         were recorded. Instead of changing the main object each time a new
 *         component is added, this approach uses wrappers, where the currently
 *         built object contains all of the previous components added.
 */
public class TestDecorator {
	public static void main(String args[]) {
		Computer computer = new Computer();

		computer = new Disk(computer);
		computer = new Monitor(computer);
		computer = new CD(computer);
		computer = new CD(computer);

		System.out.println("You're getting a " + computer.description() + ".");
	}
}
