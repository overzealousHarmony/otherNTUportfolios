import java.util.ArrayList;
import java.util.List;

public class LibraryUser<T extends Book,U>{
	private String name;
    private List<T> borrowedBooks = new ArrayList<>();
    
    
    public LibraryUser(String name, List<T> borrowedBooks) {
        this.name = name;
        this.borrowedBooks = borrowedBooks;
    }
    
  //get info

    public String getName() { return name; }
    public List<T> getBorrowedBooks() { return borrowedBooks; }
    
    
    public void addBorrowBook(T book) {
    	borrowedBooks.add(book);
    }
    
    public void removeBorrowBook(T book) {
    	borrowedBooks.remove(book);
    }
    
    public boolean isBookBorrowed(T book2) {
    	System.out.println(borrowedBooks);
    	for (T book : borrowedBooks) {
    		if (book.getTitle().equals(book2.getTitle())) {
    			return true;
    		}
    	}
    	return false;
    }
  
}