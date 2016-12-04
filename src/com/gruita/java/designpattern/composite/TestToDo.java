package com.gruita.java.designpattern.composite;

/**
 * 
 * @author cristian.gruita
 * 
 *         Prototype for composite objects, where both the groups and the
 *         individual tasks inherit from the same type (ToDoItem). Thus, a
 *         collection of ToDoItem objects can be passed to the list adapter in
 *         the ToDo fragment, containing all the data needed to display that
 *         list item. That way, there is no need for lists and maps of objects
 */
public class TestToDo {
	private ToDo toDo;

	public static void main(String args[]) {
		new TestToDo();

	}

	public TestToDo() {
		toDo = new ToDo();

		// group meds empty stomach
		String medsEmptyStomach = "Meds Empty Stomach";
		TaskGroup groupMedsEmptyStomach = new TaskGroup(medsEmptyStomach);
		groupMedsEmptyStomach
				.add(new Medication("Tylenol"/* , medsEmptyStomach */));
		groupMedsEmptyStomach
				.add(new Medication("Advil" /* , medsEmptyStomach */));

		// task breakfast
		String oneTaskGroupBreakfast = "One Task Group Breakfast";
		Task breakfast = new Meal(oneTaskGroupBreakfast);

		// task appointment (not a group)
		String oneTaskGroupAppointment = "One Task group appointment";
		Task appointment = new Appointment(oneTaskGroupAppointment);

		// group chores
		String chores = "Chores";
		TaskGroup groupChores = new TaskGroup(chores);
		groupChores.add(new Chore("Bathe client"));
		groupChores.add(new Chore("Take trash out"));
		groupChores.add(new Chore("Shopping"));

		// group meds with food, single item
		String medsWithfood = "Meds with food";
		TaskGroup groupMedsWithfood = new TaskGroup(medsWithfood);
		groupMedsWithfood.add(new Medication("Scopolamine"));

		toDo.add(groupMedsEmptyStomach);
		toDo.add(breakfast);
		toDo.add(appointment);
		toDo.add(groupChores);
		toDo.add(groupMedsWithfood);

		System.out.println(toDo.toString());
	}
}
