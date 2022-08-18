package com.polycoding.chopper.enums;

public enum Presets {

	TREE(1, "Logs"), OAK(15, "Oak logs"), WILLOW(30, "Willow logs"), MAPLE(45, "Maple logs"), 
	MAHOGANY(50, "Mahogany logs"), YEW(60, "Yew logs"), MAGIC(75, "Magic logs");

	private int minChopLevel;
	private String logName;

	Presets(int minChopLevel, String logName) {
		this.minChopLevel = minChopLevel;
		this.logName = logName;
	}

	public int getLevel() {
		return minChopLevel;
	}

	public String getLogName() {
		return logName;
	}

	@Override
	public String toString() {
		String purtify = super.toString().toLowerCase().replaceAll("_", " ");
		return Character.toUpperCase(purtify.charAt(0)) + purtify.substring(1, purtify.length());
	}
}
