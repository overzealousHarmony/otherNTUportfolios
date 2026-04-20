import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Library<T extends Book, U extends LibraryUser>{
	//Create a list of books, a set of genres, and a map of authors with their books
	private List<T> bookList = new ArrayList<T>(); //list of books
	private Set<String> genreSet = new HashSet<>(); //set of genres
	private Map<String, String> authorMap = new HashMap<>(); //map of authors
	//libraryuser database
	private List<U> userList= new ArrayList<U>();
	//-------------------------------------
	
	public void addBook(T book) {
		bookList.add(book);
		genreSet.add(book.getGenre());
		authorMap.put(book.getTitle(), book.getAuthor());
		System.out.println(book.getTitle() + " was added to the library.");
    }
	
	public void removeBook(String title) {
		boolean bookExists=false;
		boolean genreExists=false;
        for (T book : bookList) {
            if (book.getTitle().equals(title)) {
            	bookExists=true;
            	bookList.remove(book);
            	//remove book in author map
            	authorMap.remove(book.getTitle());
            	
            	//check if genre needs to be removed
            	String bookGenre=book.getGenre();
            	for (T book2 : bookList) {
            		if (book2.getGenre().equals(bookGenre)) {
            			genreExists=true;
            			break;
            		}
            	}
            	if (genreExists==false) {genreSet.remove(book.getGenre());}
            	
            	System.out.println(book.getTitle() + " was removed from the library.");
            	
            	break;
            }
            
        }
        if (bookExists==false) {System.out.println(title + " is not a book in the library. ");}
	}
	
	public void search(String keyword){
		List<T> searchresults = new ArrayList<>();
		bookList.stream().forEach(book-> {
			if (book.matchesKeyword(keyword)) {searchresults.add(book);}
			});
		if (searchresults.size()!=0) {
			System.out.println("Search Results: \n");
			for (T book : searchresults) {
	            System.out.println(book.toString());
	        }
			System.out.println("---------\n");
		}
		else {System.out.println("No search results found \n");}
	}
	
	public void filterByGenre(String genre){
		
		List<T> filteredbookList = new ArrayList<>();
		bookList.stream().forEach(book-> {
			if (book.getGenre().equals(genre)) {filteredbookList.add(book);}
			});
		if (filteredbookList.size()!=0) {
			System.out.println("Filter by genre: "+genre+ "\n");
			for (T book : filteredbookList) {
	            System.out.println(book.toString());
	        }
			System.out.println("---------\n");
		}
		else {System.out.println("No books with this genre found \n");}
	}
	
	public void filterByAuthor(String author){
		
		List<T> filteredbookList = new ArrayList<>();
		bookList.stream().forEach(book-> {
			if (book.getAuthor().equals(author)) {filteredbookList.add(book);}
			});
		if (filteredbookList.size()!=0) {
			System.out.println("Filter by author: "+author+ "\n");
			for (T book : filteredbookList) {
	            System.out.println(book.toString());
	        }
			System.out.println("---------\n");
		}
		else {System.out.println("No books with this author found \n");}
		
	}
		
	public void recommendBook(String genre) {
		System.out.println("Filter by genre: "+genre+ "\n");
		List<T> filteredbookList = new ArrayList<>();
		bookList.stream().forEach(book-> {
			if (book.getGenre().equals(genre)) {filteredbookList.add(book);}
			});
		Random rand = new Random();
		int i = rand.nextInt(filteredbookList.size());
		System.out.println("Try '"+filteredbookList.get(i).getTitle()+"' by "+filteredbookList.get(i).getAuthor()+".");
	}
	
	public void displayBooks() {
        if (bookList.isEmpty()) {
            System.out.println("Library is empty.");
        } else {
            System.out.println("Library books:\n");
            //bookList.stream().forEach(book -> System.out.println(book.toString()));
            for (T book : bookList) {
                System.out.println(book.toString());
            }
            System.out.println("---------\n");
            /*delete later
            for (String g : genreSet) {
                System.out.println(g);
            }
            System.out.println(authorMap);*/
            
        }
    }
	
	
	public void addUser(U user) {
		userList.add(user);
    }

    public boolean checkUser(String name) {
    	for (U user : userList) {
    		if (user.getName().equals(name)) {
    			return true;
    		}
    	}
    	return false;
    }
    
  //borrow or return
    public void borrowBook(String name, String booktitle) {
    	//get the book
    	int bookIndex =-1;
    	for (T book : bookList) {
    		if (book.getTitle().toString().equals(booktitle)) {
    			bookIndex= bookList.indexOf(book);
    			break;
    		}
    	}
    	
    	if(bookIndex ==-1) {System.out.println("Invalid book title.");}
    	else {	
    		T borrowedBook= bookList.get(bookIndex);
	        if (borrowedBook.isAvailable()) {
	        	borrowedBook.borrowBook();
	        	int userIndex=-1;
	        	for (U user : userList) {
	        		if (user.getName().toString().equals(name));
	        		userIndex= userList.indexOf(user);
	    			break;
	        	};
	            U user = userList.get(userIndex);
	            user.addBorrowBook(borrowedBook); 
	            System.out.println("Book is borrowed. ");
	        } 
	        else {
	            System.out.println("Book is not available for borrowing.");
	        	}
    		}
	    }

    public void returnBook(String name, String booktitle) {
    	//get the book
    	int bookIndex =-1;
    	for (T book : bookList) {
    		if (book.getTitle().toString().equals(booktitle)) {
    			bookIndex= bookList.indexOf(book);
    			break;
    		}
    	}
    	
    	if(bookIndex ==-1) {System.out.println("Invalid book title.");}
    	else {
    		T borrowedBook= bookList.get(bookIndex);
    		//check if user has book
    		int userIndex=-1;
        	for (U user : userList) {
        		if (user.getName().toString().equals(name));
        		userIndex= userList.indexOf(user);
    			break;
        	};
            U user = userList.get(userIndex);
    		if (user.isBookBorrowed(borrowedBook)==false) {System.out.println(borrowedBook.getTitle() + " is not borrowed by user. ");}  
    		else {
    			borrowedBook.returnBook();
    			user.removeBorrowBook(borrowedBook);
    			System.out.println("Book is returned.");
    		}
    	}
    }
	
}