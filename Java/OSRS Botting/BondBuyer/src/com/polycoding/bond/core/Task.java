package com.polycoding.bond.core;

import com.polycoding.bond.Bond;

public abstract class Task extends TaskMethodProvider {

	protected Bond c;

	public Task(Bond c) {
		super(c);
		this.c = c;
	}

	public abstract boolean validate();

	public abstract void execute();

	public abstract void status();
}
