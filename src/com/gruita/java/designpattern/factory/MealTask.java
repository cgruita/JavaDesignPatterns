package com.gruita.java.designpattern.factory;

public class MealTask extends TaskBase {

	public String description() {
		return TaskType.MEAL.getConnectionTypeAsString();
	}
}
