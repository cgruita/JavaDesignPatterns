package com.gruita.java.designpattern.command;

/**
 * 
 * @author cristian.gruita
 * 
 *         This pattern encapsulates commands as objects. This implementation
 *         can be used for testing Betty, assuming the different tabs are to be
 *         tested separately, and that get and post functionality is also tested
 *         separately.
 */
public class TestCommands {
	public static void main(String args[]) {
		new TestCommands();
	}

	public TestCommands() {
		Invoker invoker = new Invoker();

		// Create the receivers
		TodoTab todoTab = new TodoTab();
		AppointmentsTab appointmentsTab = new AppointmentsTab();

		// Create the commands
		TestsGet testsGetTodo = new TestsGet(todoTab);
		TestsPost testsPostTodo = new TestsPost(todoTab);

		TestsGet testsGetAppointments = new TestsGet(appointmentsTab);
		TestsPost testsPostAppointments = new TestsPost(appointmentsTab);

		invoker.setCommand(testsGetTodo);
		invoker.run();

		invoker.setCommand(testsPostTodo);
		invoker.run();

		invoker.setCommand(testsGetAppointments);
		invoker.run();

		invoker.setCommand(testsPostAppointments);
		invoker.run();

	}
}
