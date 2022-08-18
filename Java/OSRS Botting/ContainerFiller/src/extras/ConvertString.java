package extras;

public class ConvertString {
	
	private String item;
	
	public ConvertString (String item) {
		formatString(this.item);
	}
		
	public static String formatString(String item) {
		char[] chars = item.toLowerCase().toCharArray();
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
