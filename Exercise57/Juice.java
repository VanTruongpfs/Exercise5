package Exercise57;

public class Juice extends AGrocery{
	private String flavor;
	private String packages;
/**
 * this is a constructor of class Juice. There are 5 field
 * @param brandName
 * @param weight
 * @param price
 * @param flavor
 * @param packages
 * example:
 * 	new Juice("Orange Juice", 250, 10, "Orange", "bottled");
 * 	new Juice("Banana Juice", 200, 9, "Banana", "fresh");
 * 	new Juice("Apple Juice", 150, 7, "Apple", "bottled");
 */
	public Juice(String brandName, double weight, double price, String flavor, String packages) {
		super(brandName, weight, price);
		this.flavor = flavor;
		this.packages = packages;
	}
	public String toString() {
		return "\nJuice flavor: " + flavor + "\npackages=" + packages + ","+brandName+","+ weight + "," + price +"\n";
}

}
