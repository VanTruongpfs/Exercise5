package Exercise514;

public class Mouth {
	private Location location;
	private ARiver river;
/**
 * this is a constructor of class Mouth. There are 2 field
 * @param location
 * @param river
 *  example:
 *  ARiver s = new ARiver(new Location(1, 1, "s"), 120;
 * 	ARiver t = new ARiver(new Location(1, 5, "t"), 50;
 *  	Confluence b = new Confluence(new Location(3, 3, "b"), 60, s , t);
 *  ARiver u = new ARiver(new Location(3, 7, "u"), 100);
 * 		Confluence a = new Confluen(new Location(5, 5, "a"), 30, b, u); 
 *  Mouth m = new Mouth(new Location(7, 5, "m"), a);
 */
	public Mouth(Location location, ARiver river) {
		this.location = location;
		this.river = river;
	}
/**
 * this is method toString()
 */
	public String toString() {
		return "Mouth: "  + location  + river ;
}
	
	
}
