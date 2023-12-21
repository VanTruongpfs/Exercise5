package Exercise510;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Circle extends AShape {
	private int radius;
/**
 * this is a constructor of class Circle. There are 2 field
 * @param location
 * @param radius
  * example:
 * 	 new Circle(new CartPt(3,4),1);
 * 	 new Circle(new CartPt(6,8),2);
 * 	 new Circle(new CartPt(2,3),3);
 */
	public Circle(CartPt location, int radius) {
		super(location);
		this.radius = radius;
	}
	
@Override
public String toString() {
	return "Circle radius: " + radius + location + "\n";
}

/**
 * this is a method area() of class Circle
 * @return
 * example:
 * 	 new Circle(new CartPt(3,4),1);
 * 	 new Circle(new CartPt(6,8),2);
 * 	 new Circle(new CartPt(2,3),3);
 * 	  Circle c1 = new Circle(new CartPt(3,4),1);
 * 	  Circle c2 = new Circle(new CartPt(6,8),2);
 * 	  Circle c3 = new Circle(new CartPt(2,3),3);
 * 		assertEquals(c1.area(),Math.PI*1);
 * 		assertEquals(c2.area(),Math.PI*4);
 * 		assertEquals(c3.area(),Math.PI*9);
 * input:
 * output: double
 */

	@Override
	public double area() {
		return Math.PI*Math.pow(this.radius, 2);
}
/**
* this is a method contains() of class Circle
 * @return
 * example:
*  new CartPt(3,4);
*   new CartPt(6,8);
*	new CartPt(2,3);
*		 CartPt cp1 = new CartPt(3,4); 
*		 cartPt cp2 = new CartPt(6,8); 
*		 CartPt cp3 = new CartPt(2,3); 
 *  new Circle(new CartPt(3,4),1);
 * 	new Circle(new CartPt(6,8),2);
 * 	new Circle(new CartPt(2,3),3);
 * 	 Circle s1 = new Circle(new CartPt(3,4),1);
 *   Circle s2 = new Circle(new CartPt(6,8),2);
 * 	 Circle s3 = new Circle(new CartPt(2,3),3);
 * 		assertTrue(s1.contains(cp1));
 * 		assertFalse(s1.contains(cp2));
 * 		assertFalse(s2.contains(cp3));
 * input: CartPt Point
 * output: boolean
 * 
 */
//determine CartPt have contains other CartPt
@Override
	public boolean contains(CartPt Point) {
	if(Point.getX() >= this.location.getX() &&
		Point.getX() <= this.location.getX()+this.radius &&
		Point.getY() >= this.location.getY() &&
		Point.getY() <= this.location.getY()+this.radius) {
	return true;
	}else {
		return false;
	}
}
/**
 * this is a method boundingBox() of class Circle
 * @return
 * example:
 * 	 new Circle(new CartPt(3,4),1);
 * 	 new Circle(new CartPt(6,8),2);
 * 	 new Circle(new CartPt(2,3),3);
 * 	  Circle c1 = new Circle(new CartPt(3,4),1);
 * 	  Circle c2 = new Circle(new CartPt(6,8),2);
 * 	  Circle c3 = new Circle(new CartPt(2,3),3);
 * 		assertEquals(c1.boundingBox(),new Rectangle(new CartPt(2,3),2,2));
*		assertEquals(c2.boundingBox(),new Rectangle(new CartPt(4,6),4,4));
*		assertEquals(c3.boundingBox(),new Rectangle(new CartPt(-1,0),6,6));
* input: 
* output Rectangle
 */
@Override
public Rectangle boundingBox() {
	return new Rectangle(this.location.translate(-this.radius, -this.radius),this.radius*2, this.radius*2);
}
/**
 * this is a method area() of class Circle
 * @return
 * example:
 * 	 new Circle(new CartPt(3,4),1);
 * 	 new Circle(new CartPt(6,8),2);
 * 	 new Circle(new CartPt(2,3),3);
 * 	  Circle c1 = new Circle(new CartPt(3,4),1);
 * 	  Circle c2 = new Circle(new CartPt(6,8),2);
 * 	  Circle c3 = new Circle(new CartPt(2,3),3);
 * 		assertEquals(c1.perimeter(),Math.PI*2);
 * 		assertEquals(c2.perimeter(),Math.PI*4);
 * 		assertEquals(c3.perimeter(),Math.PI*6);
 * input:
 * output: double
 */
@Override
public double perimeter() {
	return Math.PI*2*this.radius;
}

}
