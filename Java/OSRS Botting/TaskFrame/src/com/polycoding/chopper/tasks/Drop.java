package com.polycoding.chopper.tasks;

import com.polycoding.chopper.Chopper;
import com.polycoding.chopper.core.Task;

public class Drop extends Task {

	public Drop(Chopper c) {
		super(c);
	}

	@Override
	public boolean validate() {
		return shouldDrop();
	}

	@Override
	public void execute() {

		if (c.getInventory().dropAll(c.getTreeType().getLogName())) {
			Chopper.sleepUntil(() -> !c.getInventory().contains(c.getTreeType().getLogName()), 10000);
		}
	}

	@Override
	public String staus() {
		return "Dropping " + c.getTreeType() + " Logs";
	}
}
