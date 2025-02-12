package library.test;

import library.management.Book;
import library.management.Library;


/**
 * The {@code LibraryApp} class serves as the class for testing
 * the {@code Library} class. It showcases adding, searching, displaying,
 * and removing books from the library.
 * 
 * This program tests functionalities such as:
 * <ul>
 *  <li>Creating books using both parameterized constructors and setter methods.</li>
 *  <li>Copying book objects.</li>
 *  <li>Searching for books by ISBN.</li>
 *  <li>Displaying all books in the library.</li>
 *  <li>Removing books from the library.</li>
 *  <li>Handling books that do not exist in the library.</li>
 * </ul>
 */
public class LibraryApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Library lib = new Library();
		
		//using the parameterized method to add books
		Book b1 = new Book("The Cat in the Hat", "Dr.Seuss", "9780007247882", 8.99 );
		lib.addBook(b1);
		
		Book b2 = new Book( "Verity", "Colleen Hoover", "9781538724736", 10.99);
		lib.addBook(b2);
		
		//using the setter method to add a book
		Book b3 = new Book(); 
		b3.setTitle("The 48 Laws of Power");
		b3.setAuthor("Robert Greene");
		b3.setISBN("9788467039054");
		b3.setPrice(14.55);
		lib.addBook(b3);
		
		//copying book 2, so b4 and b2 are the same 
		Book b4 = new Book(b2);
		lib.addBook(b4);
		
		//searching for a book by ISBN
		System.out.println();
		String ISBN = "9780007247882";
		System.out.println("Searching for book with ISBN:" + ISBN);
		Book find = lib.searchByISBN(ISBN);
		if (find != null) {
			System.out.println("Book Found: " + find.toString());
		}
		
		//Displaying all books in the library
		System.out.println();
		lib.displayBooks();
		
		//Removing b4 from the library
		System.out.println();
		lib.removeBook(b4);
		
		System.out.println();
		lib.displayBooks();
		
		//Attempt to remove a book that doesn't exist
		Book b6 = new Book ("My Diary", "Unknown", "Unknown", 10);
		System.out.println();
		lib.removeBook(b6);
		
		System.out.println();
		lib.displayBooks();
		
	
	}

}
