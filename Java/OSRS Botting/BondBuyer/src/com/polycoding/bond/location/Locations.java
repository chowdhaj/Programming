package com.polycoding.bond.location;

import org.dreambot.api.methods.map.Area;

public class Locations {
	
	private Area grandExchange = new Area(3162, 3487, 3167, 3486);
	private Area lumbridgeCenter = new Area(3217, 3222, 3224, 3214);
	private Area edgevilleBank = new Area(3091, 3498, 3094, 3490);
	private Area faladorBankEast = new Area(3009, 3358, 3015, 3355);
	private Area draynorMarket = new Area(3076, 3254, 3081, 3250);
	private Area varrockCenter = new Area(3208, 3432, 3216, 3425);
	
	public Area getGrandExchangeArea() {
		return this.grandExchange;
	}
	
	public Area getlumbridgeArea() {
		return this.lumbridgeCenter;
	}
	
	public Area getEdgevilleArea() {
		return this.edgevilleBank;
	}
	
	public Area getFaladorArea() {
		return this.faladorBankEast;
	}
	
	public Area getDraynorArea() {
		return this.draynorMarket;
	}
	
	public Area getVarrockArea() {
		return this.varrockCenter;
	}
	
	
}
