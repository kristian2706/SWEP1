package uebungsAufgaben;

public class Book {
	private String name;
	private String author;
	private int numberOfPages;

	public String getDescription() {
		return "Book: " + name + " by " + author + ", " + numberOfPages + " pages.";
	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	public Book() {

	}

	public Book(String name, String author, int numberOfPages) {
		this.name = name;
		this.author = author;
		this.numberOfPages = numberOfPages;
	}

}
