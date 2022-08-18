package mikeDaneJavaTutorial.tutorial28;

/*
 * Book class that contains attributes to model a
 * Book in real life. Currently, the Book class has
 * the following attributes: Title, Author, Number 
 * of pages, and Language the book is in.
 */
public class Book {
	
	String title;
	String author;
	int pages;
	String language;
	
	/**
	 * Constructor for the Book object.
	 * 
	 * The arguments in the constructor are assigned to the Object's
	 * attributes. These attributes are initialized with the Object
	 * 
	 * @param title The title of the book
	 * @param author The author of the book
	 * @param pages The number of pages in the book
	 * @param language The language the book is in
	 */
	public Book(String title, String author, int pages, String language) {
		
		// The 'this' keyword refers to the Object's attributes
		this.title = title;
		this.author = author;
		this.pages = pages;
		this.language = language;
	}
}