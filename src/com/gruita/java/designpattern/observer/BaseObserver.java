package com.gruita.java.designpattern.observer;

public abstract class BaseObserver implements Observer {

	public void update() {
		System.out.println(getName());
	}

}
