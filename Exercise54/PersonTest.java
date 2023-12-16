package Exercise54;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonTest {
/**
 * this is testing for constructor
 */
	@Test
	void testConstructor() {
		Person p1 = new Person("Peter", 1980, new Person("Paul", 1956, new Person("???"), 
				new Person("Annie", 1938, new Person("Bob", 1917, new Person("???"), new Person("???")), new Person("???"))),
					new Person("Janet", 1958, new Person("Robert", 1935, new Person("???"), new Person("???")), 
						new Person("Angela", 1936, new Person("???"), new Person("???"))));
				System.out.println(p1.toString());
	}

}
