package com.gruita.java.designpattern.command;

public class Invoker {

	public final static int COMMANDS_NUMBER = 5;

	Command commands[] = new Command[COMMANDS_NUMBER];
	int position;

	public Invoker() {
		position = -1;
	}

	public void setCommand(Command c) {
		if (position < commands.length - 1) {
			position++;
			commands[position] = c;
		} else {
			for (int loopIndex = 0; loopIndex < commands.length - 2; loopIndex++) {
				commands[loopIndex] = commands[loopIndex + 1];
			}
			commands[commands.length - 1] = c;
		}
	}

	public void run() {
		commands[position].execute();
	}

}
