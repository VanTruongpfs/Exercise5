package Exercise51;

public class Address {
	private int numberOfHouse;
	private String streetName;
	private String city;
/**
 * this is a constructor of class Address. There are 3 field
 * @param numberOfHouse
 * @param streetName
 * @param city
 * example:
 * 	new Address(23 , "Maple Street", "Brookline");
 * 	new Address(5 ,"Joye Road", "Newton");
 * 	new Address(83 "Winslow Road", "Waltham");
 */
	public Address(int numberOfHouse, String streetName, String city) {
		this.numberOfHouse = numberOfHouse;
		this.streetName = streetName;
		this.city = city;
	}
@Override
public String toString() {
	return "\nnumberOfHouse: " + numberOfHouse + "\nstreetName: " + streetName + "\nCity: " + city ;
}
	
}
