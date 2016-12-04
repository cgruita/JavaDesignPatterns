package com.gruita.java.designpattern.decorator;

public class CD extends Computer {
	Computer computer;

	public CD(Computer c) {
		computer = c;
	}

	public String description() {
		return computer.description() + " and a CD";
	}
}
