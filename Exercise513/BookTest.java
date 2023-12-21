package Exercise513;
import java.util.Comparator;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BookTest {
/**
 * this is testing for list book
 */
	@Test
	 public void testConstructor(){
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
/**
 * this is testing for method thisAuthor()
 */
	@Test
	public void testThisAuthor() {
		Book b1 = new Book("Daniel Defoe", "Robinson Crusoe 1 ", 15.50, 1719);
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
	}
/**
 * this is testing for method sortByTitle()
 */
	@Test
	public void testSortByTitle() {
		Book b4 = new Book("Daniel Defoe", "Robinson Crusoe 1 ", 15.50, 1719);
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
	}
}
