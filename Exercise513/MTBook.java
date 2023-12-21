package Exercise513;

public class MTBook implements IBook {
/**
 * this is a method isEmty()
 */
	public boolean isEmty() {
		return true;
	}
/**
 * this is a method toString()
 */
	public String toString() {
		return "Emty List[]";
	}
/**
 * this is a method thisAuthor()
 */
	public MTBook thisAuthor(String author) {
		return new MTBook();
	}
/**
 * this is a method sortByTitle()
 */
	public MTBook sortByTitle() {
		return new MTBook();
	}
/**
 * this is a method insert()
 */
	public IBook insert(Book other) {
		return new  ConsBook(other, new MTBook());
	}
}
