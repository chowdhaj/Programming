package enums;

import org.dreambot.api.methods.map.Area;
import extras.ConvertString;

public enum Location {
	
	VARROCK_EAST(new Area(3254, 3420, 3250, 3422), new Area (3237, 3436, 3241, 3432)),
	FALADOR_WEST(new Area(2943, 3373, 2947, 3368), new Area (2949, 3382, 2953, 3380)),
	EDGEVILLE(new Area(3091, 3498, 3095, 3492), new Area(3083, 3504, 3087, 3500));
	
	private Area bank;
	private Area fountain;
	
	Location(Area bank, Area fountain) {
		this.bank = bank;
		this.fountain = fountain;
	}

	public Area getBank() {
		return this.bank;
	}

	public Area getFountain() {
		return this.fountain;
	}
	
	@Override
	public String toString() {
		String item = super.toString().toLowerCase().replaceAll("_", " ");
		return ConvertString.formatString(item);
	}
}
