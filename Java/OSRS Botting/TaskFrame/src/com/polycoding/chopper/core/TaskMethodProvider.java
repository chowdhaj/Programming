package com.polycoding.chopper.core;

import com.polycoding.chopper.Chopper;

public class TaskMethodProvider {

	protected Chopper c;
	private String[] axes = { "Bronze axe", "Iron axe", "Steel axe", "Mithril axe",  "Adamant axe", "Rune axe", "Dragon axe" };

	public TaskMethodProvider(Chopper c) {
		this.c = c;
	}

	public boolean shouldChop() {
		return !c.getInventory().isFull() && !c.getLocalPlayer().isAnimating() && hasAxe();
	}

	public boolean shouldDrop() {
		return c.getInventory().isFull() && !c.getLocalPlayer().isAnimating();
	}

	private boolean hasAxe() {
		return c.getInventory().contains(axes) || c.getEquipment().contains(axes);
	}
}
