package Exercise54;

public class Person {	
	private String name;
	private int year;
	private Person father;
	private Person mother;
/**
 * this is a constructor of class Person. There are 4 field
 * @param name
 * @param year
 * @param father
 * @param mother
 * example:
 * 	new Person("Peter", 1980, new Person("Paul", 1956, new Person(),
  		new Person("Annie", 1938, new Person("Bob", 1917, new Person(), new Person()))),
  			new Person("Janet", 1958, new Person("Robert", 1935, new Person(), new Person()),new Person("Angela", 1936, new Person(), new Person()));
 */
	public Person(String name) {
		
	}
	public Person(String name, int year, Person father, Person mother) {
		this.name = name;
		this.year = year;
		this.father = father;
		this.mother = mother;
	}
	public String toString() {
		return  this.name + " " + this.year+ " name father : " + this.father+ " name mother : " + this.mother + "---\n";
	}

}
