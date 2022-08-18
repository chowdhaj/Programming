package com.polycoding.bond.tasks;

import com.polycoding.bond.Bond;
import com.polycoding.bond.core.Task;
import com.polycoding.bond.core.TaskMethodProvider;
import com.polycoding.bond.location.Locations;

public class ReturnChange extends Task {
	
	private Locations l;
	private TaskMethodProvider t;

	public ReturnChange(Bond c) {
		super(c);
	}

	@Override
	public boolean validate() {
		return areWeInGE();
	}

	@Override
	public void execute() {
		t.setExectueEndingAction(true);
	}

	@Override
	public void status() {
		c.setStatus("Returning Change To Master");
	}

}
