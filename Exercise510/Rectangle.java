package Exercise510;

public class Rectangle extends AShape {
	private int width;
	private int height;
/**
 * this is a constructor of class Rectangle. There are 3 field
 * @param location
 * @param width
 * @param height
 * example:
 * 	new Rectangle(new CartPt(3,4),2,4);
 * 	new Rectangle(new CartPt(6,8),2,3);
 * 	new Rectangle(new CartPt(2,3),3,1);
 */
	public Rectangle(CartPt location, int width, int height) {
		super(location);
		this.width = width;
		this.height = height;
	}
/**
 * this is method area() of class Rectangle
 * @return
 * example:
 * 	new Rectangle(new CartPt(3,4),2,4);
 * 	new Rectangle(new CartPt(6,8),2,3);
 * 	new Rectangle(new CartPt(2,3),3,1);
 * 	 Rectangle r1 = new Rectangle(new CartPt(3,4),2,4);
 * 	 Rectangle r2 = new Rectangle(new CartPt(6,8),2,3);
 * 	 Rectangle r3 = new Rectangle(new CartPt(2,3),3,1);
 * 		assertEquals(r1.area(),8);
 * 		assertEquals(r2.area(),6);
 * 		assertEquals(r3.area(),3);
 * input:
 * output: double
 */
@Override
public double area() {
	return this.width*this.height;
}
/**
 * this is method contains() of class Rectangle
 * @return
 * example:
*   new CartPt(3,4);
*   new CartPt(6,8);
*	new CartPt(2,3);
*	  CartPt cp1 = new CartPt(3,4); 
*	  CartPt cp2 = new CartPt(6,8); 
*	  CartPt cp3 = new CartPt(2,3); 
 * 	new Rectangle(new CartPt(3,4),2,4);
 * 	new Rectangle(new CartPt(6,8),2,3);
 * 	new Rectangle(new CartPt(2,3),3,1);
 * 	 Rectangle r1 = new Rectangle(new CartPt(3,4),2,4);
 * 	 Rectangle r2 = new Rectangle(new CartPt(6,8),2,3);
 * 	 Rectangle r3 = new Rectangle(new CartPt(2,3),3,1);
 * 		assertTrue(r1.contains(cp1));
 * 		assertFalse(r1.contains(cp2));
 * 		assertFalse(r2.contains(cp3));
 * input: CartPt Point
 * output: boolean
 */
@Override
public boolean contains(CartPt Point) {
	if(Point.getX() >= this.location.getX() &&
		Point.getX() <= this.location.getX() + this.width &&
		Point.getY() >= this.location.getY() &&
		Point.getY() <= this.location.getY() + this.height) {
			return true;
	}else {
			return false;
	}
}
/**
 * this is a method boundingBox() of class Rectangle
 * @return
 * example:
 * 	new Rectangle(new CartPt(3,4),2,4);
 * 	new Rectangle(new CartPt(6,8),2,3);
 * 	new Rectangle(new CartPt(2,3),3,1);
 * 	 Rectangle r1 = new Rectangle(new CartPt(3,4),2,4);
 * 	 Rectangle r2 = new Rectangle(new CartPt(6,8),2,3);
 * 	 Rectangle r3 = new Rectangle(new CartPt(2,3),3,1);
 * 		assertEquals(r1.boundingBox(),new Rectangle(new CartPt(3,4), 4, 4));
*		assertEquals(r2.boundingBox(),new Rectangle(new CartPt(6,8), 3, 4));
*		assertEquals(r3.boundingBox(),new Rectangle(new CartPt(2,3), 3, 3));
*input:
*output: Rectangle
 */
@Override
public Rectangle boundingBox() {
	return new Rectangle(this.location, this.width, this.height);
}
/**
 * this is method perimeter() of class Rectangle
 * @return
 * example:
 * 	new Rectangle(new CartPt(3,4),2,4);
 * 	new Rectangle(new CartPt(6,8),2,3);
 * 	new Rectangle(new CartPt(2,3),3,1);
 * 	 Rectangle r1 = new Rectangle(new CartPt(3,4),2,4);
 * 	 Rectangle r2 = new Rectangle(new CartPt(6,8),2,3);
 * 	 Rectangle r3 = new Rectangle(new CartPt(2,3),3,1);
 * 		assertEquals(r1.perimeter(),12);
 * 		assertEquals(r2.perimeter(),10);
 * 		assertEquals(r3.perimeter(),8);
 * input:
 * output: double
 */

@Override
public double perimeter() {
	return (this.width + this.height) * 2;
}
/**
 * this is method equals()
 */
	public boolean equals(Object obj) {
		if(obj == null || !(obj instanceof Rectangle)) {
			return false;
		}else {
			Rectangle that = (Rectangle) obj;
			return this.location.equals(that.location)&&
					this.width == that.width &&
					this.height == that.height;
		}
	}
	
}
