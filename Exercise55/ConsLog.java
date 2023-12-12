package Exercise55;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConsLog implements ILog{
	private Entry first;
	private ILog rest;
/**
 * this is a constructor of class ConsLog. There are 2 field
 * @param first
 * @param rest
 */
	public ConsLog(Entry first, ILog rest) {
		this.first = first;
		this.rest = rest;
	}
/**
 *this is method isEmty()
 */
	public boolean isEmty() {
		return false;
	}
/**
 * this is method toString()
 */
	public String toString() {
		return this.first.toString()+this.rest.toString();
}
/**
 * this is method totalDistanceInMonth()
 * example:
 * 	Entry e1 = new Entry(new Date(29, 11, 2023), 5.3, 27, "good");
	Entry e2 = new Entry(new Date(30, 11, 2023), 2.8, 24, "tired");
	Entry e3 = new Entry(new Date(31, 11, 2023), 26.2, 159, "exhausted");
		
	MTLog mt = new MTLog();
	ConsLog l3 = new ConsLog(e3, mt);
	ConsLog l2 = new ConsLog(e2, l3);
	ConsLog l1 = new ConsLog(e1, l2);
		assertEquals(l1.totalDistanceInMonth(10), 0);
		assertEquals(l2.totalDistanceInMonth(11), 29);
		assertEquals(l1.totalDistanceInMonth(11), 34.3);
 */
	public double totalDistanceInMonth(int month) {
		if(this.first.getMonth()==(month)) {
			return this.first.getDistance()+ this.rest.totalDistanceInMonth(month);
		}else {
			return this.rest.totalDistanceInMonth(month);
		}
	}
/**
 * this is method maxDistance()
 * example:
 * 	Entry e1 = new Entry(new Date(29, 11, 2023), 5.3, 27, "good");
	Entry e2 = new Entry(new Date(30, 11, 2023), 2.8, 24, "tired");
	Entry e3 = new Entry(new Date(31, 11, 2023), 26.2, 159, "exhausted");
	
	MTLog mt = new MTLog();
	ConsLog l3 = new ConsLog(e3, mt);
	ConsLog l2 = new ConsLog(e2, l3);
	ConsLog l1 = new ConsLog(e1, l2);
		assertEquals(l1.maxDistance(), 26.2);
		assertEquals(l2.maxDistance(), 26.2);
		assertEquals(l3.maxDistance(), 26.2);
 */
	public double maxDistance() {
		if(this.first.getDistance()>this.rest.maxDistance()) {
			return this.first.getDistance();
		}else {
			return this.rest.maxDistance();
		}
	}
/**
 * this is method sortByMinutePerMile()
 * example:
 * 	Entry e1 = new Entry(new Date(29, 11, 2023), 5.3, 27, "good");
		Entry e2 = new Entry(new Date(30, 11, 2023), 2.8, 24, "tired");
		Entry e3 = new Entry(new Date(31, 11, 2023), 26.2, 159, "exhausted");
		
		MTLog mt = new MTLog();
		ConsLog l3 = new ConsLog(e3, mt);
		ConsLog l2 = new ConsLog(e2, l3);
		ConsLog l1 = new ConsLog(e1, l2);
		 System.out.println(l1.sortByMinutePerMile());
 */
	public ILog sortByMinutePerMile() {
		return this.rest.sortByMinutePerMile().compare(first);
	}
/**
 * this is method compare()
 */
	public ILog compare(Entry other) {
		if(other.faster(first)) {
			return new ConsLog(other, this);
		}else {
			return new ConsLog (this.first, this.rest.compare(other));
		}
	}
}
