package com.gruita.java.designpattern.factory;

public class ChoreTask extends TaskBase {

	public String description() {
		return TaskType.CHORE.getConnectionTypeAsString();
	}
}
