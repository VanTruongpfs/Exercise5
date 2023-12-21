package Exercise514;

public class Location {
	private int x;
	private int y;
	private String name;
/**
 * this is a constructor of class Location. There are 3 field
 * @param x
 * @param y
 * @param name
 * example:
 * 	new Location(1, 1, "s");
 * 	new Location(1, 5, "t");
 * 	new Location(3, 7, "u");
 * 	new Location(3, 3, "b");
 * 	new Location(5, 5, "a");
 * 	new Location(7, 5, "m");
 */
	public Location(int x, int y, String name) {
		this.x = x;
		this.y = y;
		this.name = name;
	}
/**
* this is method toString()
 */
@Override
public String toString() {
	return "Location("  + x + ", " + y + ")" + ", name: " + name ;
}
	
	

}
