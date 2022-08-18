package com.polycoding.chopper.tasks;

import org.dreambot.api.wrappers.interactive.GameObject;

import com.polycoding.chopper.Chopper;
import com.polycoding.chopper.core.Task;

public class Chop extends Task {

	public Chop(Chopper c) {
		super(c);
	}

	@Override
	public boolean validate() {
		return shouldChop();
	}

	@Override
	public void execute() {
		GameObject tree = c.getGameObjects().closest(c.getTreeType().toString());
		if (tree != null) {
			//lets add some things to check on the tree first
			//canReach, within a certain area to keep player from wandering off, etc
			if (tree.interact()) {
				//not sure how well tree.exists works alone, but maybe add player is animating
				Chopper.sleepWhile(() -> tree.exists(), 2000);
			}
		} else {
			return;
		}
	}

	@Override
	public String staus() {
		return "Chopping " + c.getTreeType() + " Trees";
	}
}
