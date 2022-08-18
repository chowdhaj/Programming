package com.polycoding.chopper.core;

import com.polycoding.chopper.Chopper;

public abstract class Task extends TaskMethodProvider {

	protected Chopper c;

	public Task(Chopper c) {
		super(c);
		this.c = c;
	}

	public abstract boolean validate();

	public abstract void execute();

	public abstract String staus();
}
