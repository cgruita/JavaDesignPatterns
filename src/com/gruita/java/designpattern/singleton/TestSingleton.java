package com.gruita.java.designpattern.singleton;

/**
 * 
 * @author cristian.gruita
 *
 *         Code yet not checked in, but added to my workspace. Currently these
 *         pieces of info (server name, client, etc) is stored in the
 *         MainActivity. But it doesn't really belong there, this singleton will
 *         be added to Betty.
 */
public class TestSingleton {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DataManager manager = DataManager.getInstance();
		DataManager manager2 = DataManager.getInstance();
		System.out.println("The two objects: " + manager + ", " + manager2);

	}

}
