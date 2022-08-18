package enums;

import extras.ConvertString;

public enum Container {
	
	VIAL, 
	BUCKET, 
	JUG, 
	BOWL;
	
	@Override
	public String toString() {
		
		String item = super.toString().toLowerCase().replaceAll("_", " ");
		return ConvertString.formatString(item);
	}
}
