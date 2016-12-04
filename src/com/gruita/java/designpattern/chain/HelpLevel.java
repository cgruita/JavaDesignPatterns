package com.gruita.java.designpattern.chain;

public enum HelpLevel {

	FRONT_END(0), // can handle only a few requests
	INTERMEDIATE(1), // can handle come requests
	GENERAL(2); // can handle all requests

	int nLevel;

	HelpLevel(int level) {
		nLevel = level;
	}

}
