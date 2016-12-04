package com.gruita.java.designpattern.factory;

/**
 * 
 * @author cristian.gruita
 * 
 *         A simple task factory for Betty.
 */
public class TestFactory {
	public static void main(String args[]) {
		TaskFactory factory;

		factory = new TaskFactory();

		TaskBase taskAppointment = factory.createTask(TaskType.APPOINTMENT);

		TaskBase taskMedication = factory.createTask(TaskType.MEDICATION);

		// throws an error, as it's supposed to
		TaskBase taskGeneric = factory.createTask(TaskType.GENERIC);
	}
}
