package Exercise511;

public class ConsMail implements IMail {
	private Mail first;
	private IMail rest;

	/**
	 * this is a constructor of class ConsMail. There are 2 field
	 * 
	 * @param first
	 * @param rest
	 */
	public ConsMail(Mail first, IMail rest) {
		this.first = first;
		this.rest = rest;
	}

	@Override
	public String toString() {
		return this.first.toString() + this.rest.toString();
	}

	/**
	 * this is a method sortByDate()
	 * 
	 */
	public IMail sortByDate() {
		return (this.rest.sortByDate()).insert(first);
	}

	/**
	 * this is a method insert()
	 */
	public IMail insert(Mail other) {
		if (other.early(first)) {
			return new ConsMail(other, this);
		}
		return new ConsMail(first, this.rest.insert(other));

	}
}
