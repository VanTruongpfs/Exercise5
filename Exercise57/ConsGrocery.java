package Exercise57;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConsGrocery implements IGrocery{
	private AGrocery first;
	private IGrocery rest;
/**
 * this is a constructor of class ConsGrocery. There are 2 field
 * @param first
 * @param rest
 */
	public ConsGrocery(AGrocery first, IGrocery rest) {
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
 * this is method toString()

 */
	public String toString() {
		return this.first.toString()+this.rest.toString();
		}
/**
 * this is method howMany()
 * example:
 * 		Coffee c1 = new Coffee("Hawaiian Kona", 100, 15.95, "decaffeinated");
		Coffee c2 = new Coffee("Ethiopian", 1000, 8.0, "regular");
		Coffee c3 = new Coffee("Colombian Supreme ", 1700, 9.5, "regular");
		
		IceCream i1 = new IceCream("CoconutCream", 100, 15, "Coconut", "sorbet");
		IceCream i2 = new IceCream("MilkCream", 150, 13, "Milk", "frozen yogurt");
		IceCream i3 = new IceCream("CocoaCream", 80, 12, "Cocoa", "sorbet");
		
		Juice j1 = new Juice("Orange Juice", 250, 10, "Orange", "bottled");
		Juice j2 = new Juice("Banana Juice", 200, 9, "Banana", "fresh");
		Juice j3 = new Juice("Apple Juice", 150, 7, "Apple", "bottled");
		
		MTGrocery mt = new MTGrocery();
		ConsGrocery l9 = new ConsGrocery(j3,mt);
		ConsGrocery l8 = new ConsGrocery(j2,l9);
		ConsGrocery l7 = new ConsGrocery(j1,l8);
		ConsGrocery l6 = new ConsGrocery(i3,l7);
		ConsGrocery l5 = new ConsGrocery(i2,l6);
		ConsGrocery l4 = new ConsGrocery(i1,l5);
		ConsGrocery l3 = new ConsGrocery(c3,l4);
		ConsGrocery l2 = new ConsGrocery(c2,l3);
		ConsGrocery l1 = new ConsGrocery(c1,l2);
			assertEquals(l1.howMany(),9);
			assertEquals(l2.howMany(),8);
			assertEquals(l3.howMany(),7);
			assertEquals(l4.howMany(),6);
		System.out.println(l1.howMany());
 */
	public int howMany() {
		if(this.first != null) {
			return 1 + this.rest.howMany();
		}else {
			return this.rest.howMany();
		}
	}
/**
 * this is method brandName()
 * example:
 * 		Coffee c1 = new Coffee("Hawaiian Kona", 100, 15.95, "decaffeinated");
		Coffee c2 = new Coffee("Ethiopian", 1000, 8.0, "regular");
		Coffee c3 = new Coffee("Colombian Supreme ", 1700, 9.5, "regular");
		
		IceCream i1 = new IceCream("CoconutCream", 100, 15, "Coconut", "sorbet");
		IceCream i2 = new IceCream("MilkCream", 150, 13, "Milk", "frozen yogurt");
		IceCream i3 = new IceCream("CocoaCream", 80, 12, "Cocoa", "sorbet");
		
		Juice j1 = new Juice("Orange Juice", 250, 10, "Orange", "bottled");
		Juice j2 = new Juice("Banana Juice", 200, 9, "Banana", "fresh");
		Juice j3 = new Juice("Apple Juice", 150, 7, "Apple", "bottled");
		
		MTGrocery mt = new MTGrocery();
		ConsGrocery l9 = new ConsGrocery(j3,mt);
		ConsGrocery l8 = new ConsGrocery(j2,l9);
		ConsGrocery l7 = new ConsGrocery(j1,l8);
		ConsGrocery l6 = new ConsGrocery(i3,l7);
		ConsGrocery l5 = new ConsGrocery(i2,l6);
		ConsGrocery l4 = new ConsGrocery(i1,l5);
		ConsGrocery l3 = new ConsGrocery(c3,l4);
		ConsGrocery l2 = new ConsGrocery(c2,l3);
		ConsGrocery l1 = new ConsGrocery(c1,l2);
			assertEquals(l9.brandName(),"Apple Juice" + "\nEnd List");
			assertEquals(l8.brandName(),"Banana Juice" + "\nApple Juice" + "\nEnd List");
			assertEquals(l7.brandName(),"Orange Juice" + "\nBanana Juice" + "\nApple Juice" + "\nEnd List");
		System.out.println(l1.brandName());
 */
	public String brandName() {
		return this.first.getBrandName()+"\n" + this.rest.brandName();
	}
/**
 * this is method highestPrice()
 * example:
 * 		Coffee c1 = new Coffee("Hawaiian Kona", 100, 15.95, "decaffeinated");
		Coffee c2 = new Coffee("Ethiopian", 1000, 8.0, "regular");
		Coffee c3 = new Coffee("Colombian Supreme ", 1700, 9.5, "regular");
		
		IceCream i1 = new IceCream("CoconutCream", 100, 15, "Coconut", "sorbet");
		IceCream i2 = new IceCream("MilkCream", 150, 13, "Milk", "frozen yogurt");
		IceCream i3 = new IceCream("CocoaCream", 80, 12, "Cocoa", "sorbet");
		
		Juice j1 = new Juice("Orange Juice", 250, 10, "Orange", "bottled");
		Juice j2 = new Juice("Banana Juice", 200, 9, "Banana", "fresh");
		Juice j3 = new Juice("Apple Juice", 150, 7, "Apple", "bottled");
		
		MTGrocery mt = new MTGrocery();
		ConsGrocery l9 = new ConsGrocery(j3,mt);
		ConsGrocery l8 = new ConsGrocery(j2,l9);
		ConsGrocery l7 = new ConsGrocery(j1,l8);
		ConsGrocery l6 = new ConsGrocery(i3,l7);
		ConsGrocery l5 = new ConsGrocery(i2,l6);
		ConsGrocery l4 = new ConsGrocery(i1,l5);
		ConsGrocery l3 = new ConsGrocery(c3,l4);
		ConsGrocery l2 = new ConsGrocery(c2,l3);
		ConsGrocery l1 = new ConsGrocery(c1,l2);
			assertEquals(l1.highestPrice(), 15.95);
			assertEquals(l2.highestPrice(), 15);
			assertEquals(l3.highestPrice(), 15);
 */
	public double highestPrice() {
		if(this.first.getPrice()>this.rest.highestPrice()) {
			return this.first.getPrice();
		}else {
			return this.rest.highestPrice();
		}
	}
/**
 * this is method equals()
 */
	public boolean equals(Object obj) {
		if(obj == null || !(obj instanceof ConsGrocery)) {
			return false;
		}else {
			ConsGrocery that = (ConsGrocery) obj;
			return this.first.equals(that.first) &&
					this.rest.equals(that.rest);
	}
	}
}
