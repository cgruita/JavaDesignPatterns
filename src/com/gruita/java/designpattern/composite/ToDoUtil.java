package com.gruita.java.designpattern.composite;

public class ToDoUtil {

	public enum TaskType {
		MEALS(0), APPOINTMENTS(1), CHORES(2), MEDS(3);
		private int mNType;

		private TaskType(int nType) {
			mNType = nType;
		}

		public int getType() {
			return mNType;
		}

		public String toString() {
			switch (getType()) {
			case 0:
				return "Meals";
			case 1:
				return "Appointments";
			case 2:
				return "Chores";
			case 3:
				return "Meds";
			default:
				return "";
			}
		}
	}

}
