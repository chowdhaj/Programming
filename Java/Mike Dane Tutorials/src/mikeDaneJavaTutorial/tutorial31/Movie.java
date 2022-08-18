package mikeDaneJavaTutorial.tutorial31;

/**
 * Movie Class
 * 
 * @author Jatin 
 */
public class Movie {
	
	private String title;
	private String director;
	private String rating;
	
	/**
	 * Constructor for the Movie Object
	 * 
	 * @param title The title/name of the movie
	 * @param director The person who directed the movie
	 * @param rating The movie's current rating
	 */
	public Movie(String title, String director, String rating) {
		
		// Sets the Movie's attributes using the Setter functions
		this.setTitle(title);
		this.setDirector(director);
		this.setRating(rating);
	}
	
	/**
	 * Gets the Movie's title attribute
	 * 
	 * @return The title of the movie
	 */
	public String getTitle() {
		return this.title;
	}
	
	/**
	 * Sets the Movie's title
	 * 
	 * @param title The new title of the movie
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	/**
	 * Gets the director attribute of the Movie
	 * 
	 * @return The director attribute of the Movie
	 */
	public String getDirector() {
		return this.director;
	}
	
	/**
	 * Sets the director attribute of the Movie
	 * 
	 * @param director The new director of the movie
	 */
	public void setDirector(String director) {
		this.director = director;
	}
	
	/**
	 * Gets the rating attribute of the Movie
	 * 
	 * @return The rating of the Movie
	 */
	public String getRating() {
		return this.rating;
	}
	
	/**
	 * Sets the rating attribute of the Movie
	 * 
	 * The input rating is first checked to see if it is a valid rating,
	 * before being assigned. If it is not a valid rating, then the rating
	 * of the movie is set to "NR"
	 * 
	 * @param rating The new rating of the movie
	 */
	public void setRating(String rating) {
		
		if (rating.equalsIgnoreCase("g")     || rating.equalsIgnoreCase("pg") || 
			rating.equalsIgnoreCase("pg-13") || rating.equalsIgnoreCase("r")  ||
			rating.equalsIgnoreCase("nr")) {
			
				this.rating = rating.toUpperCase();
				
		} else {
			
			System.out.println("'" + rating + "' is not a valid rating");
			this.rating = "NR";
		}
	}
	
	/**
	 * Prints all attributes of the Movie: title, director, and rating
	 */
	public void printInformation() {
		System.out.println("Movie    : " + this.getTitle()    + "\n" +
				           "Director : " + this.getDirector() + "\n" +
				           "Rating   : " + this.getRating());
	}
}