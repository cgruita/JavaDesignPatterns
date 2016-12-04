package com.gruita.java.designpattern.decorator;

public class Monitor extends Computer {
	Computer computer;

	public Monitor(Computer c) {
		computer = c;
	}

	public String description() {
		return computer.description() + " and a monitor";
	}
}
