package uebungsAufgaben;

public class MainLibrary {
	public static void main(String[] args) {
		Library myLibrary = new Library();

		Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 200);
		Book book2 = new Book("Moby Dick", "Herman Melville", 600);
		DVD dvd1 = new DVD("Inception", 148, "Christopher Nolan");

		myLibrary.addItem(dvd1, 0);
		myLibrary.addItem(book1, 1);
		myLibrary.addItem(book2, 2);
		
		myLibrary.listItems();

	}

}
