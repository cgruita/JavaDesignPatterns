package com.gruita.java.designpattern.adapter;

public class ConcatenatedName implements ConcatNameInterface {
	String name;

	public void setName(String n) {
		name = n;
	}

	public String getName() {
		return name;
	}
}
