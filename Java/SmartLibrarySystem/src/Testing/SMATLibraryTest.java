package Testing;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import SMATLibrarySystem.Customer;
import SMATLibrarySystem.Library;
import SMATLibrarySystem.LibraryBook;
import SMATLibrarySystem.LibraryException;

public class SMATLibraryTest {
	
	static Library lib;
	static LibraryBook book;
	static Customer c;
	
	public static void main(String[] args) {
		
	}
	
	@Before
	public void setUp() {
		lib = new Library();
		book = new LibraryBook();
		c = new Customer();
	}
	
	@Test(expected = LibraryException.class)
	public void testToStringWhenCustomersAreNotRegistered() {
		lib.addBook(book);
		// lib.register(c);
		lib.takeOutBook(c, book);
		lib.toString();
	}
	
	@Test
	public void testDeleteBook() {
		lib.addBook(book);
		lib.register(c);
		lib.takeOutBook(c, book);
		lib.deleteBook(book);
		System.out.println(c.getBooksHeld());
		assertTrue(c.getBooksHeld().size() == 0);
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
