/*
 * * * * *
 * NOTES *
 * * * * * 
 * Classes allow you to create a new type of data (i.e. Book)
 * You can create as many instances of the class as you want
 */

// Classes & Objects Continued
package mikeDaneJavaTutorial.tutorial27;

public class Tutorial27ClassesObjectsCont {

	public static void main(String[] args) {

		// Creates a new Book object
		Book book1 = new Book();
		book1.title = "Harry Potter"; // book 1 title
		book1.author = "JK Rowling"; // book 1 author
		book1.pages = 500; // book 1 number of pages
		book1.language = "English"; // book 1 language
		
		Book book2 = new Book();
		book2.title = "The 4 Hour Work Week"; // book 2 title
		book2.author = "Tim Ferris"; // book 2 author
		book2.pages = 300; // book 2 number of pages
		book2.language = "English"; // book 2 language
		
		// Prints the title of book 1
		System.out.println(book1.title);
		
		// Prints the number of pages in book 2
		System.out.println(book2.pages);
	}
}