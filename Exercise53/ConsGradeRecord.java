package Exercise53;

public class ConsGradeRecord implements IGradeRecord{
	private GradeRecord first;
	private IGradeRecord rest;
/**
 * this is a constructor of class ConsGradeRecord. There are 2 field
 * @param first
 * @param rest
 */
	public ConsGradeRecord(GradeRecord first, IGradeRecord rest) {
		this.first = first;
		this.rest = rest;
	}
/**
 * this is a method isEmty()
 * @return
 */
	public boolean isEmty() {
		return false;
	}
/**
 * this is a method toString()
*/
@Override
	public String toString() {
		return this.first.toString()+this.rest.toString();
		}
}
