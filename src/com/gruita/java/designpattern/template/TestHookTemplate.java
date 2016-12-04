package com.gruita.java.designpattern.template;

/**
 * 
 * @author cristian.gruita
 *
 *         Useful if there are certain actions that have to be executed in a
 *         sequence, for several recipients. The pattern makes sure that the
 *         order is the same for all calls, and that no action is left out. This
 *         possible Betty implementation calls the same actions for all tabs:
 *         creating the dynamic layouts, creating the fragment(s), calling WS,
 *         updating the cache, testing if needed.
 */
public class TestHookTemplate {
	public static void main(String args[]) {

		TabTodo tabTodo = new TabTodo("Todo");
		System.out.println(tabTodo.getName() + ":");
		tabTodo.go();

		TabAppointments tabAppointments = new TabAppointments("Appointments");
		System.out.println("\n" + tabAppointments.getName() + ":");
		tabAppointments.go();

	}
}
