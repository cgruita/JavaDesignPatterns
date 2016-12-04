package com.gruita.java.designpattern.observer;

import java.util.Iterator;
import java.util.Vector;

public class SyncManager implements Subject {

	private Vector<Observer> observers;

	public SyncManager() {
		observers = new Vector<Observer>();
	}

	public void sync() {
		System.out.println("\nSynchronization call");
		notifyObservers();
	}

	@Override
	public void registerObserver(Observer o) {
		System.out.println("Adding an observer: " + o.getName());
		observers.add(o);

	}

	@Override
	public void removeObserver(Observer o) {
		System.out.println("Removing an observer: " + o.getName());
		observers.remove(o);

	}

	@Override
	public void notifyObservers() {
		for (Iterator<Observer> iterator = observers.iterator(); iterator
				.hasNext();) {
			Observer o = (Observer) iterator.next();
			o.update();

		}

	}
}
