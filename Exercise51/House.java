package Exercise51;

public class House {
	private String kind;
	private int numberOfRoom;
	private double price;
	private Address address;
/**
 * this is a constructor of class House. There are 4 field
 * @param kind
 * @param numberOfRoom
 * @param price
 * @param address
 * example:
 *  new House("Ranch", 7 , 375000, new Address(23 , "Maple Street", "Brookline"));
 *  new House("Colonial", 9, 450000, new Address(5 ,"Joye Road", "Newton"));
 *  new House("Cape", 6, 235000, new Address(83 "Winslow Road", "Waltham"));
 */
	public House(String kind, int numberOfRoom, double price, Address address) {
		this.kind = kind;
		this.numberOfRoom = numberOfRoom;
		this.price = price;
		this.address = address;
	}
@Override
public String toString() {
	return "\nHouse kind:" + kind + "\nnumberOfRoom: " + numberOfRoom + "\nprice: " + price + "\nAddress: " + address + "\n\n";
}
	
	
	

}
