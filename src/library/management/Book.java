package library.management;

/**
 * The Book class represents a book with a title, author, ISBN, and price.
 * It provides constructors for initializing a book, getter and setter methods for accessing 
 * book attributes, and overrides equals and toString methods for comparison 
 * and string representation.
 */
public class Book {
	private String title;
	private String author;
	private String ISBN;
	private double price; 
	
	/**
     * Default constructor that initializes a book with default values.
     * Title, author, and ISBN are set to "Unknown," and price is set to 0.0.
     */
	public Book() {
		 title = "Unknown";
		 author = "Unknown";
		 ISBN = "Unknown";
		 price = 0.0;	
		 
		 //no "this" needed because there is no parameters  
	}
	
	/**
     * Constructs a Book object with specified values.
     */
	public Book(String title, String author, String ISBN, double price) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN; 
		this.price = price; 
		
	}
	
	/**
     * Copy constructor that creates a new Book object as a copy of an existing one.
     */
	public Book(Book copy) {
		this.title = copy.title;
		this.author = copy.author;
		this.ISBN = copy.ISBN;
		this.price = copy.price;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = (title == null || title.strip().isEmpty()) ? "Unknown Author" : title.strip(); //clean input and check edge cases
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		
		 this.author = (author == null || author.strip().isEmpty()) ? "Unknown Author" : author.strip(); //clean input and check edge cases
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
			
		//Make sure price is greater than 0
		    if (price < 0) {
		        System.out.println("Warning: Price cannot be negative. Setting to $0.00.");
		        this.price = 0.0;
		    } else {
		        this.price = price;
		  }
		
		this.price = price;
	}
	
	/**
     * Compares this book with another object based on ISBN.
     */
	@Override
	public boolean equals(Object other) {
		Book b = (Book) other; //casting because need to access specific fields in Book class 
		if(b == null) return false;
		
		else return ISBN.equals(b.ISBN);

		}
	
	/**
     * Returns a string representation of the book.
     * 
     * @return A formatted string containing the book's title, author, ISBN, and price.
     */
	@Override
	public String toString() {
		return title + " by " + author + " (ISBN: " + ISBN + "), $" + price;
		
	}
	
}
