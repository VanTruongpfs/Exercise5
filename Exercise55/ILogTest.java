package Exercise55;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ILogTest {
/**
 * this is testing for constructor
 */
	@Test
	void testConstructor() {
		new Entry(new Date(29, 11, 2023), 5.3, 27, "good");
		new Entry(new Date(30, 11, 2023), 2.8, 24, "tired");
		new Entry(new Date(31, 11, 2023), 26.2, 159, "exhausted");
	}
/**
 * this is testing for method totalDistanceInMonth()
 */
	@Test
	void testTotalDistanceInMonth() {
		Entry e1 = new Entry(new Date(29, 11, 2023), 5.3, 27, "good");
		Entry e2 = new Entry(new Date(30, 11, 2023), 2.8, 24, "tired");
		Entry e3 = new Entry(new Date(31, 11, 2023), 26.2, 159, "exhausted");
		
		MTLog mt = new MTLog();
		ConsLog l3 = new ConsLog(e3, mt);
		ConsLog l2 = new ConsLog(e2, l3);
		ConsLog l1 = new ConsLog(e1, l2);
		 assertEquals(l1.totalDistanceInMonth(10), 0);
		 assertEquals(l2.totalDistanceInMonth(11), 29);
		 assertEquals(l1.totalDistanceInMonth(11), 34.3);
		 System.out.println(l1.totalDistanceInMonth(11));
	}
/**
 * this is testing for method maxDistance()
 */
	@Test
	void testMaxDistance() {
		Entry e1 = new Entry(new Date(29, 11, 2023), 5.3, 27, "good");
		Entry e2 = new Entry(new Date(30, 11, 2023), 2.8, 24, "tired");
		Entry e3 = new Entry(new Date(31, 11, 2023), 26.2, 159, "exhausted");
		
		MTLog mt = new MTLog();
		ConsLog l3 = new ConsLog(e3, mt);
		ConsLog l2 = new ConsLog(e2, l3);
		ConsLog l1 = new ConsLog(e1, l2);
			assertEquals(l1.maxDistance(), 26.2);
			assertEquals(l2.maxDistance(), 26.2);
			assertEquals(l3.maxDistance(), 26.2);
			System.out.println(l1.maxDistance());
	}
/**
 * this is testing for method sortByMinutePerMile()
 */
	@Test
	void testSortByMinutePerMile() {
		Entry e1 = new Entry(new Date(29, 11, 2023), 5.3, 27, "good");
		Entry e2 = new Entry(new Date(30, 11, 2023), 2.8, 24, "tired");
		Entry e3 = new Entry(new Date(31, 11, 2023), 26.2, 159, "exhausted");
		
		MTLog mt = new MTLog();
		ConsLog l3 = new ConsLog(e3, mt);
		ConsLog l2 = new ConsLog(e2, l3);
		ConsLog l1 = new ConsLog(e1, l2);
		 System.out.println(l1.sortByMinutePerMile());
		
	}

}
