package mikeDaneJavaTutorial.tutorial32;

/**
 * Song Class ADT
 * 
 * @author Jatin
 */
public class Song {
	
	private String title;
	private String artist;
	private int lengthInSeconds;
	private static int songCount = 0;
	
	/**
	 * Constructor for the Song Object
	 * 
	 * @param title The name of the song
	 * @param artist The artist of the song
	 * @param length The length of the song in seconds
	 */
	public Song(String title, String artist, int length) {
		
		this.title = title;
		this.artist = artist;
		this.lengthInSeconds = length;
		Song.songCount++;
		System.out.println("Song Count: " + Song.songCount);
	}

	/**
	 * Gets the title of the song
	 * 
	 * @return The title of the song
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Sets the title of the song
	 * 
	 * @param title The new title of the song
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * Gets the artist of the song
	 * 
	 * @return The artist of the song
	 */
	public String getArtist() {
		return artist;
	}

	/**
	 * Sets the artist of the song
	 * 
	 * @param artist The new artist of the song
	 */
	public void setArtist(String artist) {
		this.artist = artist;
	}

	/**
	 * Gets the length of the song
	 * 
	 * @return The length of the song
	 */
	public int getLengthInSeconds() {
		return lengthInSeconds;
	}

	/**
	 * Sets the length of the song
	 * 
	 * @param length The new length of the song in seconds
	 */
	public void setLengthInSeconds(int length) {
		this.lengthInSeconds = length;
	}
	
	/**
	 * Gets the number of Song instances
	 * 
	 * @return The number of songs created
	 */
	public int getSongCount() {
		return Song.songCount;
	}
}