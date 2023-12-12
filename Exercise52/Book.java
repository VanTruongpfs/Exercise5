package Exercise52;

public class Book {
	private String authorName;
	private String title;
	private double price;
	private int publication;
/**
 * this is a constructor of class Book. There are 4 field
 * @param authorName
 * @param title
 * @param price
 * @param publication
 *  example:
 *  new Book("Daniel Defoe", "Robinson Crusoe", 15.50, 1719);
 *  new Book("Joseph Conrad", "Heart of Darkness", 12.80, 1902);
 *  new Book("Pat Conroy", "Beach Music", 9.50, 1996);
 */
	public Book(String authorName, String title, double price, int publication) {
		this.authorName = authorName;
		this.title = title;
		this.price = price;
		this.publication = publication;
	}
@Override
public String toString() {
	return "\nauthorName: " + authorName + "\ntitle: " + title + "\nprice: " + price + "\npublication: " + publication
			+ "\n";
}
	

}
