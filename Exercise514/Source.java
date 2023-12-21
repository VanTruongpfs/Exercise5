package Exercise514;

public class Source extends ARiver{
/**
 * this is a constructor of class Source. There are 2 field
 * @param location
 * @param length
 * example:
 * 	new Source(new Location(1, 1, "s"), 120;
 * 	new Source(new Location(1, 5, "t"), 50;
 * 	new Source(new Location(3, 7, "u"), 100;
 * 	new Source(new Location(3, 3, "b"), 60;
 * 	new Source(new Location(5, 5, "a"), 30;
 */
	public Source(Location location, double length) {
		super(location, length);
	}
/**
 * this is method toString()
 */
@Override
public String toString() {
	return "Location: " + location + length;
}
	

}
