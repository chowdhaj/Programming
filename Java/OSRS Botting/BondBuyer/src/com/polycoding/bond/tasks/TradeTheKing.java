package com.polycoding.bond.tasks;

import org.dreambot.api.methods.interactive.Players;

import com.polycoding.bond.Bond;
import com.polycoding.bond.core.Task;

public class TradeTheKing extends Task {
	
	public TradeTheKing(Bond c) {
		super(c);
	}

	@Override
	public boolean validate() {
		return areWeInGE() && interactWithKing();
	}

	@Override
	public void execute() {
		Players p = c.getPlayers();
		if (p.closest(c.getMuleKing()).interactForceRight("Trade with")) {
			Bond.sleepUntil(() -> tradeWindowIsOpen(), 3000);
			if (tradeWindowIsOpen()) {
				Bond.sleepUntil(()-> correctCoins(), 20000);
				if (correctCoins()) {
					while (c.getTrade().isOpen()) {
						if (c.getTrade().acceptTrade()) {
							Bond.sleepUntil(() -> !c.getTrade().isOpen() || c.getTrade().acceptTrade(2), 3000);
						}
					}
				}
			}
		}
	}
	
	public boolean correctCoins() {
		if (c.getBondPrice() == -69) {
			c.sleep(5000);
			return true;
		}
		if (c.getTrade().contains(false, c.getBondPrice(), "Coins")) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean tradeWindowIsOpen() {
		if (c.getTrade().isOpen()) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void status() {
		c.setStatus("Trading With " + c.getMuleKing());
	}
}
