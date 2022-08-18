package enums;

import org.dreambot.api.methods.map.Area;

public enum PubLocation {

	BLUE_MOON_INN (new Area(3180, 3441, 3185, 3433), new Area(3218, 3402, 3227, 3394), "Varrock West", "Bartender"), 
	DANCING_DONKEY_INN (new Area(3250, 3423, 3257, 3419), new Area(3275, 3493, 3282, 3486), "Varrock East", "Bartender");
	
	private Area bankLoc;
	private Area pubLoc;
	private String scapeLocation;
	private String bartenderName;

	PubLocation(Area bankLoc, Area pubLoc, String scapeLocation, String bartenderName) {
		
		this.setBankLoc(bankLoc);
		this.setPubLoc(pubLoc);
		this.setScapeLocation(scapeLocation);
		this.setBartenderName(bartenderName);
	}
	
	public Area setBankLoc(Area bankLoc) {
		return this.bankLoc = bankLoc;
	}

	public Area getBankLoc() {
		return bankLoc;
	}

	public Area setPubLoc(Area pubLoc) {
		return this.pubLoc = pubLoc;
	}

	public Area getPubLoc() {
		return pubLoc;
	}
	
	public String setScapeLocation(String scapeLocation) {
		return this.scapeLocation = scapeLocation;
	}

	public String getScapelocation() {
		return scapeLocation;
	}
	
	public String setBartenderName(String bartenderName) {
		return this.bartenderName = bartenderName;
	}
	
	public String getBartenderName() {
		return bartenderName;
	}
	
	@Override
	public String toString() {
		String loc = super.toString().toLowerCase().replaceAll("_", " ");
		return capitalizeFirstLetterInString(loc);
	}

	public static String capitalizeFirstLetterInString(String loc) {
		char[] chars = loc.toLowerCase().toCharArray();
		boolean found = false;
		for (int i = 0; i < chars.length; i++) {
			if (!found && Character.isLetter(chars[i])) {
				chars[i] = Character.toUpperCase(chars[i]);
				found = true;
			} else if (Character.isWhitespace(chars[i])) {
				found = false;
			}
		}
		return String.valueOf(chars);
	}
}
