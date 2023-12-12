package Exercise52;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BookTest {
/**
 * this is testing for list book
 */
	@Test
	void testConsBook() {
		 Book b1 = new Book("Daniel Defoe", "Robinson Crusoe", 15.50, 1719);
		 Book b2 = new Book("Joseph Conrad", "Heart of Darkness", 12.80, 1902);
		 Book b3 = new Book("Pat Conroy", "Beach Music", 9.50, 1996);
		 
		 MTBook mt = new MTBook();
		 ConsBook l3 = new ConsBook(b3, mt);
		 ConsBook l2 = new ConsBook(b2, l3);
		 ConsBook l1 = new ConsBook(b1, l2);
		 
		 System.out.println("Book store\n"+l1);
		 System.out.println("\nMy favorite book\n"+l2);
	}

}
