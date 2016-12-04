package com.gruita.java.designpattern.factory;

public class TaskFactory {
	public TaskBase createTask(TaskType type) {

		if (type == TaskType.APPOINTMENT) {
			return new AppointmentTask();
		} else if (type == TaskType.MEAL) {
			return new MealTask();
		} else if (type == TaskType.MEDICATION) {
			return new MedicationTask();
		} else if (type == TaskType.CHORE) {
			return new ChoreTask();
		} else {
			throw new IllegalArgumentException("Unknown type");
		}
	}

}
