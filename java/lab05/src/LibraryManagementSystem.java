import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryManagementSystem{

	public static void main(String[] args)
	{
		Library<Book, LibraryUser> library = new Library<>();
		int choice;
		Scanner scan = new Scanner(System.in);
		do{
			System.out.print("The Library Management System:\n"
				+ "1) Add book to library\n"
				+ "2) Remove book from library\n"
				+ "3) Book Search\n"
				+ "4) Show all books in the library\n"
				+ "5) Borrow/return book\n"
				+ "6) Quit\n");
			choice = scan.nextInt();
			scan.nextLine();
			switch(choice) {
			case 1:
				System.out.println("Enter title: " );
				String t =  scan.nextLine();
				System.out.println("Enter author: " );
				String a =  scan.nextLine();
				System.out.println("Enter genre: " );
				String g = scan.nextLine();
				System.out.println("Enter publication year: " );
				String pY = scan.nextLine();
				library.addBook(new Book(t, a, g, pY));
				break;
			case 2: 
				System.out.println("Enter title of book to be removed: " );
				library.removeBook(scan.nextLine());
				break;
			case 3:
				int searchchoice;
				do {
					System.out.print("Book search options:\n"
						+ "1) Search by keyword\n"
						+ "2) Filter by genre\n"
						+ "3) Filter by author\n"
						+ "4) Recommend a book\n"
						+ "5) back\n");
					searchchoice = scan.nextInt();
					scan.nextLine();
					switch(searchchoice) {
						case 1:
							System.out.print("Search keyword: ");
							library.search(scan.nextLine());
							break;
						case 2:
							System.out.print("Select Genre: ");
							library.filterByGenre(scan.nextLine());
							break;
						case 3:
							System.out.print("Select Author: ");
							library.filterByAuthor(scan.nextLine());
							break;
						case 4:
							System.out.print("Select Genre: ");
							library.recommendBook (scan.nextLine());
							break;
						case 5:
						default:
							System.out.print("Invalid selection");
					}
				}while (searchchoice != 5);
				break;
			case 4:
				//do sorting
				int sortchoice;
				do{
					System.out.print("Display by:\n"
						+ "1) Title\n"
						+ "2) Genre\n"
						+ "3) Author\n"
						+ "4) Publication Year\n");
					sortchoice = scan.nextInt();
					scan.nextLine();
					switch(sortchoice) {
						case 1:
							//library.displayBooks();
							break;
						case 2:
							break;
						case 3:
							break;
						case 4:
							break;
						default:
							System.out.print("Invalid selection");
					}
				}while (sortchoice != 3);
				break;
			case 5:
				int userchoice;
				do {
					System.out.print("Book borrow/return options:\n"
							+ "1) Borrow book\n"
							+ "2) Return book\n"
							+ "3) back\n");
					userchoice = scan.nextInt();
					scan.nextLine();
					switch(userchoice) {
					case 1:
						System.out.print("Enter Name: ");
						String name =scan.nextLine();
						if (library.checkUser(name)==false) {library.addUser(new LibraryUser(name,new ArrayList<>()));}
						
						System.out.print("Enter book to borrow: ");
						String book =scan.nextLine();
						library.borrowBook(name, book);
						break;
					case 2:
						System.out.print("Enter Name: ");
						String name2 =scan.nextLine();
						if (library.checkUser(name2)==false) {
							library.addUser(new LibraryUser(name2,new ArrayList<>()));
							}
						System.out.print("Enter book to return: ");
						String book2 =scan.nextLine();
						library.returnBook(name2, book2);
						break;
					case 3:
					default:
						System.out.print("Invalid selection");
					}
				}while (userchoice != 3);

				break;
			case 6:

				break;
			default:
				System.out.print("Invalid selection");
			}
		}while (choice != 6);
		
	}
}