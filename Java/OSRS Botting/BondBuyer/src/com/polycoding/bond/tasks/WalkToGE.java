package com.polycoding.bond.tasks;

import com.polycoding.bond.Bond;
import com.polycoding.bond.core.Task;
import com.polycoding.bond.location.Locations;

public class WalkToGE extends Task {
	
	private Locations l;

	public WalkToGE(Bond c) {
		super(c);
	}

	@Override
	public boolean validate() {
		return areWeInGE();
	}

	@Override
	public void execute() {
		c.getWalking().walk(l.getGrandExchangeArea().getRandomTile());
	}

	@Override
	public void status() {
		c.setStatus("Walking To GE");
	}
}
