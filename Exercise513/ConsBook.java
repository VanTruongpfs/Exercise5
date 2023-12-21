package Exercise513;

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
 * this is a method isEmty()
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
/**
 * this is a method thisAuthor()
 * example:
 * Book b1 = new Book("Daniel Defoe", "Robinson Crusoe 1 ", 15.50, 1719);
		Book b2 = new Book("Daniel Defoe", "Robinson Crusoe 2 ", 15.50, 1719);
		Book b3 = new Book("Daniel Defoe", "Robinson Crusoe 3", 15.50, 1719);
		Book b4 = new Book("Joseph Conrad", "Heart of Darkness", 12.80, 1902);
		Book b5 = new Book("Pat Conroy", "Beach Music", 9.50, 1996);
		
		MTBook mt = new MTBook();   
		ConsBook l5 = new ConsBook(b5, mt);
		ConsBook l4 = new ConsBook(b4, l5);
		ConsBook l3 = new ConsBook(b3, l4);
		ConsBook l2 = new ConsBook(b2, l3);
		ConsBook l1 = new ConsBook(b1, l2);
			System.out.println(l1.thisAuthor("Daniel Defoe"));
 * 	
 */
	public IBook thisAuthor(String author) {
		if(this.first.getName().equals(author)) {
			return new ConsBook(this.first, this.rest.thisAuthor(author));
		}else {
			return this.rest.thisAuthor(author);
		}
	}
/**
 * this is a method sortByTitle()
 * example:
 * Book b4 = new Book("Daniel Defoe", "Robinson Crusoe 1 ", 15.50, 1719);
		Book b2 = new Book("Daniel Defoe", "Robinson Crusoe 2 ", 15.50, 1719);
		Book b3 = new Book("Daniel Defoe", "Robinson Crusoe 3", 15.50, 1719);
		Book b1 = new Book("Joseph Conrad", "Heart of Darkness", 12.80, 1902);
		Book b5 = new Book("Pat Conroy", "Beach Music", 9.50, 1996);
		
		MTBook mt = new MTBook();   
		ConsBook l5 = new ConsBook(b5, mt);
		ConsBook l4 = new ConsBook(b4, l5);
		ConsBook l3 = new ConsBook(b3, l4);
		ConsBook l2 = new ConsBook(b2, l3);
		ConsBook l1 = new ConsBook(b1, l2);
			System.out.println(" sort by title : \n" +l1.sortByTitle());
 */
 public IBook sortByTitle() {
	 return this.rest.sortByTitle().insert(first);
 }
/**
 * this is a method insert()
 */
	public IBook insert(Book other) {
		if(other.compare(first)) {
			return new ConsBook(other, this);
		}else {
			return new ConsBook(first, this.rest.insert(other));
		}
	}
}
