package com.gruita.java.designpattern.decorator;

public class Disk extends Computer {
	Computer computer;

	public Disk(Computer c) {
		computer = c;
	}

	public String description() {
		return computer.description() + " and a disk";
	}
}
