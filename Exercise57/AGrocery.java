package Exercise57;

public class AGrocery{
	protected String brandName;
	protected double weight;
	protected double price;
/**
 * this is a constructor of class AGrocery. There are 3 field
 * @param brandName
 * @param weight
 * @param price
 */
	public AGrocery(String brandName, double weight, double price) {
		this.brandName = brandName;
		this.weight = weight;
		price = price;
	}
/**
 * this is method toString()
 */
	public String toString() {
		return "AGrocery brandName: " + brandName + "\nweight: " + weight + "\nprice: " + price ;
}
/**
 * this is method getBrandName()
 * @return
 */
	public String getBrandName() {
		return this.brandName;
	}
/**
 * this is method equals()
 */
	public boolean equals(Object obj) {
		if(obj == null || !(obj instanceof AGrocery)) {
			return false;
		}else {
			AGrocery that = (AGrocery) obj;
			return this.brandName.equals(that.brandName)&&
					this.weight == that.weight &&
					this.price == that.price;
		}
	}
}
