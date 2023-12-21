package Exercise510;

public class CompositeShape implements IShape{
	private IShape top;
	private IShape bottom;
/**
 * this is a constructor of class CompositeShape. There are 2 field
 * @param top
 * @param bottom
 */
	public CompositeShape(IShape top, IShape bottom) {
		this.top = top;
		this.bottom = bottom;
	}
/**
 * this is a method toString()
 */
	public String toString() {
		return this.top.toString()+this.bottom.toString();
	}
/**
 * this is a method distanceToO()
 */
	public double distanceToO() {
		return this.top.distanceToO();
	}
/**
 * this is a method contains()
 */
	public boolean contains(CartPt Point) {
		if( this.top.contains(Point)||this.bottom.contains(Point)) {
			return true;
		}else {
			return false;
		}
	}
}
