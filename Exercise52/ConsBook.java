package Exercise52;

public class ConsBook implements IBook {
	private Book first;
	private IBook rest;
/**
 * this is a constructor of class ConsBook. There are 2 field
 * @param first
 * @param rest
 */
	public ConsBook(Book first, IBook rest) {
		this.first = first;
		this.rest = rest;
	}
/**
 * this is method isEmty()
 */
	public boolean isEmty() {
		return false;
	}
/**
 * this is a method toString()
 */
	public String toString() {
		return this.first.toString() + this.rest.toString();
	}
}
