package com.polycoding.bond.tasks;

import com.polycoding.bond.Bond;
import com.polycoding.bond.core.Task;

public class HandleGE extends Task {
	

	public HandleGE(Bond c) {
		super(c);
	}

	@Override
	public boolean validate() {
		return buyBond();
	}

	@Override
	public void execute() {
		if (c.getGrandExchange().isBuyOpen()) {
			
		} else {
			if (c.getGrandExchange().openBuyScreen(c.getGrandExchange().getFirstOpenSlot())) {
				Bond.sleepUntil(() -> c.getGrandExchange().isBuyOpen(), 3500);
			}
		}
	}

	@Override
	public void status() {
		c.setStatus("Buying OS Bond");
	}
}
