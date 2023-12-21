package Exercise514;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ARiverTest {
/**
 * this is testing for river system
 */
	@Test
	public void testRiverSystem() {
		new Location(1, 1, "s");
		new Location(1, 5, "t");
		new Location(3, 7, "u");
		new Location(3, 3, "b");
		new Location(5, 5, "a");
		new Location(7, 5, "m");
		 ARiver s = new ARiver(new Location(1, 1, "s"), 120);
		 ARiver t = new ARiver(new Location(1, 5, "t"), 50);
		 	Confluence b = new Confluence(new Location(3, 3, "b"), 60, s , t);
		 ARiver u = new ARiver(new Location(3, 7, "u"), 100);
			Confluence a = new Confluence(new Location(5, 5, "a"), 30, u , b); 
		 Mouth m = new Mouth(new Location(7, 5, "m"), a);
		 System.out.println(m);
	}
	@Test
	public void testMaxLenght() {
		new Location(1, 1, "s");
		new Location(1, 5, "t");
		new Location(3, 7, "u");
		new Location(3, 3, "b");
		new Location(5, 5, "a");
		new Location(7, 5, "m");
		ARiver s = new ARiver(new Location(1, 1, "s"), 120);
		ARiver t = new ARiver(new Location(1, 5, "t"), 50);
		Confluence b = new Confluence(new Location(3, 3, "b"), 60, s , t);
		ARiver u = new ARiver(new Location(3, 7, "u"), 100);
		Confluence a = new Confluence(new Location(5, 5, "a"), 30, u , b); 
		Mouth m = new Mouth(new Location(7, 5, "m"), a);
//		System.out.println(a.maxLength());
	}
}
