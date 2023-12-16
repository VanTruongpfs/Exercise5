package Exercise57;

public class IceCream extends AGrocery{
	private String flavor;
	private String packages;
/**
 * this is a constructor of class IceCream. There are 5 field
 * @param brandName
 * @param weight
 * @param price
 * @param flavor
 * @param packages
 * example:
 * 	new IceCream("CoconutCream", 100, 15, "Coconut", "sorbet");
 * 	new IceCream("MilkCream", 150, 13, "Milk", "frozen yogurt");
 * 	new IceCream("CocoaCream", 80, 12, "Cocoa", "sorbet");
 */
	public IceCream(String brandName, double weight, double price, String flavor, String packages) {
		super(brandName, weight, price);
		this.flavor = flavor;
		this.packages = packages;
	}
	public String toString() {
		return "\nIceCream flavor: " + flavor + "\npackages: " + packages + ","+brandName+","+ weight + "," + price +"\n";
}

}
