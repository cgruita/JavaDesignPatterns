package com.gruita.java.designpattern.singleton;

/**
 * 
 * Singleton, contains global or data related to a specific fragment (like ToDo)
 * 
 * @author cristian.gruita
 *
 */
public class DataManager {

	// the instance itself
	private static DataManager INSTANCE;

	// global data

	private static Client client;
	private static String serverName;

	// ToDo fragment data
	// whether the view should be reloaded for ToDoDetailsFragment:
	private static boolean todoReloadDetailsView;

	private DataManager() {

	}

	public static DataManager getInstance() {
		if (INSTANCE == null) {
			System.out.println("Instance is null, creating the object");
			INSTANCE = new DataManager();
		}
		System.out.println("Returning the instance");
		return INSTANCE;
	}

	// getters and setters

	// client
	public Client getClient() {
		return client;
	}

	public void setClient(Client cl) {
		client = cl;
	}

	// server name
	public String getServerName() {
		return serverName;
	}

	public void setServerName(String servName) {
		serverName = servName;
	}

	// ToDoReloadView
	public boolean getTodoReloadDetailsView() {
		return todoReloadDetailsView;
	}

	public void setTodoReloadDetailsView(boolean bReload) {
		todoReloadDetailsView = bReload;
	}

}
