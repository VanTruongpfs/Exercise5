package Exercise54;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConsAncestorTest {

	@Test
	void testAncestor() {
		Information i1 = new Information("Father", 1972);
		Information i2 = new Information("Mother", 1973);
		Information i3 = new Information("Grandfather", 1950);
	 	Information i4 = new Information("Grandmother", 1952);
		Information i5 = new Information("Great-Grandfather", 1930);
	 	Information i6 = new Information("Great-Grandmother", 1933);
			
		  MTAncestor mt = new MTAncestor();
		  ConsAncestor c3 = new ConsAncestor(i5, i6, mt);
		  ConsAncestor c2 = new ConsAncestor(i4, i3, c3);
		  ConsAncestor c1 = new ConsAncestor(i2, i1, c2);
		  
		  Person p1 = new Person("Truong", 2005, c1);
		  System.out.println(p1);
	}

}
