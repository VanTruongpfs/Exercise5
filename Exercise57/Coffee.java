package Exercise57;

public class Coffee extends AGrocery{
	private String kind;
/**
 * This is a constructor of class Coffee. There are 4 field
* @param brandName
* @param weight
* @param price
* @param kind
* example:
*  new Coffee("Hawaiian Kona", 100, 15.95, "decaffeinated");
*	new Coffee("Ethiopian", 1000, 8.0, "regular");
*	new Coffee("Colombian Supreme ", 1700, 9.5, "regular");
*/
	public Coffee(String brandName, double weight, double price, String kind) {
		super(brandName, weight, price);
		this.kind = kind;
		}
/**
 * this is method toString()
 */
	public String toString() {
		return "\nCoffee kind: " + kind + ","+brandName+","+ weight + "," + price +"\n";
		
}
}

