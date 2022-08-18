package com.polycoding.bond.tasks;

import com.polycoding.bond.Bond;
import com.polycoding.bond.core.Task;

public class EndingAction extends Task {
	
	String action;
	
	public EndingAction(Bond c) {
		super(c);
	}

	@Override
	public boolean validate() {
		return endingAction();
	}

	@Override
	public void execute() {
		
	}

	@Override
	public void status() {
		c.setStatus(action);
	}
}
