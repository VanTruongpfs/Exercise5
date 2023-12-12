package Exercise51;

public class ConsList implements IListOfHouse {
	private House first;
	private IListOfHouse rest;
/**
 * this is a constructor of class ConsList. There are 2 field.
 * @param first
 * @param rest
 */
	public ConsList(House first, IListOfHouse rest) {
		this.first = first;
		this.rest = rest;
	}
	public boolean isEmty() {
		return false;
	}
	public String toString() {
		return this.first.toString()+this.rest.toString();
	}
	
}
