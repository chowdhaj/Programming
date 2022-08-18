package com.polycoding.bond.core;

import org.dreambot.api.methods.interactive.Players;

import com.polycoding.bond.Bond;
import com.polycoding.bond.location.Locations;

public class TaskMethodProvider {

	protected Bond c;
	private Locations l;
	private Players p;
	private String osb = "Old school bond";
	private boolean executeEndingAction;

	public TaskMethodProvider(Bond c) {
		this.c = c;
	}

	public boolean areWeInGE() {
		if (l.getGrandExchangeArea().contains(c.getLocalPlayer())) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean interactWithKing() {
		p = c.getPlayers();
		if (areWeInGE() && !inventoryContainsBond()) {
			if (p.closest(c.getMuleKing()) != null) {
				return true;
			} else {
				c.sleep(2000);
				return false;
			}
		}
		return false;
	}
	
	public boolean buyBond() {
		if (areWeInGE() && !inventoryContainsBond() 
				&& c.getInventory().count("Coins") >= c.getBondPrice()) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean returnChange() {
		p = c.getPlayers();
		if (areWeInGE() && c.getInventory().contains("Coins") && inventoryContainsBond() && p.closest(c.getMuleKing()) != null) {
			return true;
		} else {
			executeEndingAction = true;
			return false;
		}
	}
	
	public boolean endingAction() {
		return executeEndingAction;
	}
	
	public boolean inventoryContainsBond() {
		return c.getInventory().contains(osb);
	}
	
	public void setExectueEndingAction(boolean executeEndingAction) {
		this.executeEndingAction = executeEndingAction;
	}
}
