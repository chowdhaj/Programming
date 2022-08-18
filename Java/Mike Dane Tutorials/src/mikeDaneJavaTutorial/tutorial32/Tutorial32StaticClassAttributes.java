/*
 * * * * *
 * NOTES *
 * * * * * 
 * A Static attribute is an attribute of a class that is the same
 *     for all of the objects of that class
 * All of the objects in a class can access the same value
 * Attributes should always have Getters and Setters. This is
 *     Java convention
 * Static attributes are the same across all Objects
 * When accessing a static attribute, you should access it on the
 *     class, and NOT an instance of the class. For example:
 *         Song.songCount      (GOOD)
 *         this.songCount      (BAD)
 *         songName.songCount  (BAD)
 */

// Static Class Attributes
package mikeDaneJavaTutorial.tutorial32;

import mikeDaneJavaTutorial.tutorial32.Song;

public class Tutorial32StaticClassAttributes {
	
	public static void main(String[] args) {
		
		// Create new Song Object
		Song holiday = new Song("Holiday", "Green Day", 200);
		Song carmen  = new Song("Carmen", "Lana Del Ray", 250);
		
		// Print out number of songs from both 'holiday' and 'carmen' instances
		System.out.println(holiday.getSongCount());
		System.out.println(carmen.getSongCount());
		
		// Create new song
		Song motto = new Song("The Motto", "Drake", 300);
		
		// Print out number of songs from all three instances
		System.out.println(holiday.getSongCount());
		System.out.println(carmen.getSongCount());
		System.out.println(motto.getSongCount());	
	}
}