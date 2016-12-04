package com.gruita.java.designpattern.factory;

public class MedicationTask extends TaskBase {

	public String description() {
		return TaskType.MEDICATION.getConnectionTypeAsString();
	}
}
