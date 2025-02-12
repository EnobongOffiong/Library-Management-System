package library.management;

public class Library {

	private Book[] books = new Book[5];
	private int count = 0;
	
	
	/**
	 * This method will add a book to the library if there is space available.
	 * 
	 * @param book
	 * 			This argument is the book object to be added
	 * @return
	 * 			Return false if there is no space for the new book. 
	 * 			Returns true if the addition was successful.
	 */
	public boolean addBook(Book book) {
		if (book == null) {
            System.out.println("Cannot add a null book.");
            return false;
        }
		
		if(count >= books.length) {
			System.out.println("There is no more space for to add new books");
			return false;
		}
		
		System.out.println("Adding books...");
		
		books[count] = book;
		count++;
		
		System.out.println("Book added successfully!");
		
		return true;
	}

	/**
	 * This method will remove a book from the library if it exists
	 * 
	 * @param book
	 * 			This argument is the book object to be removed
	 * @return
	 * 			Return false if there are no books in the library, or the book doesn't exist. 
	 * 			Returns true if the book was found and removed.
	 */
	public boolean removeBook(Book book) {
		if (book == null) {
            System.out.println("Cannot remove a null book.");
            return false;
        }
		
		if(count == 0) {
			System.out.println("There are no books in your Library");
			return false;
		}
		
		for(int i = 0; i < count; i++) {
			if(books[i] != null && books[i].getISBN().equals(book.getISBN())) {
				System.out.println("Removing book: " + book.getTitle());
				
				for (int j = i; j < count - 1; j++) {
	                books[j] = books[j + 1];  
	            }
				
				books[count-1]=null;
				count--;
				return true;
			}
		}
		
		
		System.out.println("Cannot remove book: " + book.getTitle() + ", book does not exist");
		return false;
	}

	/**
     * Searches for a book by ISBN.
     *
     * @param ISBN
     * 			 The ISBN number of the book to search for.
     * @return 
     * 			 The Book object if found, or null if no matching book exists.
     */
	 
	public Book searchByISBN(String ISBN) {
		if (ISBN == null) {
            System.out.println("Cannot search for a null ISBN.");
            return null;
        }
		
		for(int i = 0 ; i < count; i++) {
			if(books[i] != null) {
			if(books[i].getISBN().equals(ISBN)) {
				return books[i];
			}
		}
		}
		System.out.println("Could not find any book with matching ISBN");
		return null;
	}
	
	/**
     * Displays all books in the library if there are any.
     * 
     * Prints each book's details using its overridden toString() method.
     */
	public void displayBooks() {
		if(count == 0) {
			System.out.println("There are no books in your Library");
			return ;
		}
		
		System.out.println("All books in library:");
		for(int i = 0; i < count; i++) {
			System.out.println(i+1 + ". " + books[i]);
		}
	
	}
}

