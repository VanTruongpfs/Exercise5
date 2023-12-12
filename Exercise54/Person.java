package Exercise54;

public class Person {
	private String name;
	private int yearOfBirth;
	private IAncestor ancestry;
/**
 * this is a constructor of class Person. There are 3 field
 * @param name
 * @param yearOfBirth
 * @param ancestry
 * example:
 *  Information i1 = new Information("Father", 1972);
 * 	Information i2 = new Information("Mother", 1973);
 * 	Information i3 = new Information("Grandfather", 1950);
 * 	Information i4 = new Information("Grandmother", 1952);
 * 	Information i5 = new Information("Great-Grandfather", ???);
 * 	Information i6 = new Information("Great-Grandmother", ???);
 * 	
 *  MTAncestor mt = new MTAncestor();
 *  ConsAncestor c3 = new ConsAncestor(i5, i6, mt);
 *  ConsAncestor c2 = new ConsAncestor(i4, i3, c1);
 *  ConsAncestor c1 = new ConsAncestor(i2, i1, c2);
 *  
 *  new Person("Truong", 2005, c1)
 */
	public Person(String name, int yearOfBirth, IAncestor ancestry) {
		this.name = name;
		this.yearOfBirth = yearOfBirth;
		this.ancestry = ancestry;
	}
@Override
public String toString() {
	return "Person [name=" + name + ", yearOfBirth=" + yearOfBirth + ", ancestry=" + ancestry + "]";
}
	
	
}
