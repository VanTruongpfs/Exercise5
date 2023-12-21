package Exercise514;

public class Confluence extends ARiver {
	private ARiver left;
	private ARiver right;
/**
 * this is a constructor of class Confluence. There are 4 field
 * @param location
 * @param length
 * @param left
 * @param right
 * example:
 * 	ARiver s = new ARiver(new Location(1, 1, "s"), 120;
 * 	ARiver t = new ARiver(new Location(1, 5, "t"), 50;
 *  	Confluence b = new Confluence(new Location(3, 3, "b"), 60, s , t);
 *  ARiver u = new ARiver(new Location(3, 7, "u"), 100);
 * 	ARiver a = new ARiver(new Location(5, 5, "a"), 30;
 * 		Confluence a = new Confluen(new Location(5, 5, "a"), b,u); 
 * 
 */
	public Confluence(Location location, double length, ARiver left, ARiver right) {
		super(location, length);
		this.left = left;
		this.right = right;
	}
/**
 * this is method toString()
 */
@Override
public String toString() {
	return   "\n Confluence " + location  + "\nMade by:" + left + right ;
	}
}
