package Exercise54;

public class Information {
	private String name;
	private int yearOfBirth;
/**
 * this is a constructor of class Information. There are 2 field
 * @param name
 * @param yearOfBirth
 * example:
 * 	new Information("Father", 1972);
 * 	new Information("Mother", 1973);
 * 	new Information("Grandfather", 1950);
 * 	new Information("Grandmother", 1952);
 * 	new Information("Great-Grandfather", ???);
 * 	new Information("Great-Grandmother", ???);
 */
	public Information(String name, int yearOfBirth) {
		this.name = name;
		this.yearOfBirth = yearOfBirth;
	}
@Override
public String toString() {
	return "Information [name=" + name + ", yearOfBirth=" + yearOfBirth + "]";
}
	
	
}
