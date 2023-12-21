package Exercise514;

public class ARiver {
	protected Location location;
	protected double length;
/**
 * this is a constructor of class ARiver. There are 2 field
 * @param location
 * @param length
 * example:
 * 	new ARiver(new Location(1, 1, s), 120;
 * 	new ARiver(new Location(1, 5, t); 50;
 * 	new ARiver(new Location(3, 7, u), 100;
 * 	new ARiver(new Location(3, 3, b), 60;
 * 	new ARiver(new Location(5, 5, a), 30;
 */
	public ARiver(Location location, double length) {
		this.location = location;
		this.length = length;
	}
/**
 * this is method toString()
 */
@Override
	public String toString() {
		return "\n  ARiver: " + location + ", length: " + length ;
}
public double maxLength() {
	if(this.length > this.maxLength()) {
		return this.length;
	}else {
		return this.maxLength();
	}
} 
	
	

}
