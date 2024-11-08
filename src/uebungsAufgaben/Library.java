package uebungsAufgaben;

public class Library {

	Object[] items = new Object[10];

	public void addItem(Object item, int index) {
		if (index >= 0 && index < items.length) {
			items[index] = item;
		} else {
			System.out.println("Index out of bounds!");
		}
	}

	public void listItems() {
		for (Object item : items) {
			if (item instanceof Book) {
				Book book = (Book) item;
				System.out.println(book.getDescription());
			} else if (item instanceof DVD) {
				DVD dvd = (DVD) item;
				System.out.println(dvd.getDescription());
			}

		}
	}

}
