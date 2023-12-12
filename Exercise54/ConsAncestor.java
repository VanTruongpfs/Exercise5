package Exercise54;

public class ConsAncestor implements IAncestor {
	private Information father;
	private Information mother;
	private IAncestor rest;
/**
 * this is a constructor of class ConsAncestor. There are 3 field
 * @param father
 * @param mother
 * @param rest
 */
	public ConsAncestor(Information father, Information mother, IAncestor rest) {
		this.father = father;
		this.mother = mother;
		this.rest = rest;
	}
	public boolean isEmty() {
		return false;
	}
	@Override
	public String toString() {
		return this.father.toString() + this.mother.toString()+ this.rest.toString();
	}
	
}
