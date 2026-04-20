public class Book<T>implements Searchable {
	private String  title;
	private String author;
	private String genre;
	private String pubYear;
	private boolean isAvailable = true;
	
	public Book(String title, String author, String genre, String pubYear) {
		this.title= title;
		this.author=author;
		this.genre=genre;
		this.pubYear=pubYear;
	}
	
	// get item details
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getGenre() { return genre; }
    public String getPubYear() { return pubYear; }
	
	//borrowing
	
	public boolean isAvailable() {return isAvailable;}
	public void borrowBook() {isAvailable = false; }
	public void returnBook() {isAvailable = true; }
	
	//Search
	public boolean matchesKeyword(String keyword) {
		keyword =keyword.toLowerCase();
			return title.toLowerCase().contains(keyword)|| author.toLowerCase().contains(keyword)|| genre.toLowerCase().contains(keyword)|| pubYear.toLowerCase().contains(keyword);
	}
	
	//print
	public String toString() {
        return "Title: '" + title + "' | Author: " + author + " | Genre: "+ genre + " | Publication Year: " +
        	pubYear;
    }


}