package Exercise510;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Square extends AShape{
	private int size;
/**
 * this is a constructor of class Square. There are 2 field
 * @param location
 * @param size
 * example:
 * 	new Square(new CartPt(3,4),2);
 * 	new Square(new CartPt(6,8),3);
 * 	new Square(new CartPt(2,3),4);
 */
	public Square(CartPt location, int size) {
		super(location);
		this.size = size;
	}
	
@Override
public String toString() {
	return "Square: " + location + "size: " + size + "\n";
}

/**
 * this is a method area() of class Square
 * @return
 * example:
 * 	new Square(new CartPt(3,4),2);
 * 	new Square(new CartPt(6,8),3);
 * 	new Square(new CartPt(2,3),4);
 * 	Square s1 = new Square(new CartPt(3,4),2);
 * 	Square s2 = new Square(new CartPt(6,8),3);
 * 	Square s3 = new Square(new CartPt(2,3),4);
 * 		assertEquals(s1.area(),4);
 * 		assertEquals(s2.area(),9);
 * 		assertEquals(s3.area(),16);
 * input:
 * output: double
 */
@Override
	public double area() {
		return Math.pow(this.size,2);
}
/**
 * this is a method contains() of class Square
 * @return
 * example:
 *  new CartPt(3,4);
*   new CartPt(6,8);
*	new CartPt(2,3);
*		 CartPt cp1 = new CartPt(3,4); 
*		 cartPt cp2 = new CartPt(6,8); 
*		 CartPt cp3 = new CartPt(2,3); 
 *  new Square(new CartPt(3,4),2);
 * 	new Square(new CartPt(6,8),3);
 * 	new Square(new CartPt(2,3),4);
 * 	 Square s1 = new Square(new CartPt(3,4),2);
 *   Square s2 = new Square(new CartPt(6,8),3);
 * 	 Square s3 = new Square(new CartPt(2,3),4);
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
			Point.getX() <= this.location.getX()+this.size &&
			Point.getY() >= this.location.getY() &&
			Point.getY() <= this.location.getY()+this.size) {
		return true;
		}else {
			return false;
		}
}
// method equals
@Override
	public boolean equals(Object obj) {
		if (null==obj || !(obj instanceof Square)) {
			return false;
		}else {
			Square that = (Square) obj;
			return (this.location.equals(that.location)
					&& this.size == that.size);
		}
	}
/**
 * this is a method boundingBox() of class Square
 * @return
 * example:
 * 	new Square(new CartPt(3,4),2);
 * 	new Square(new CartPt(6,8),3);
 * 	new Square(new CartPt(2,3),4);
 * 	Square s1 = new Square(new CartPt(3,4),2);
 * 	Square s2 = new Square(new CartPt(6,8),3);
 * 	Square s3 = new Square(new CartPt(2,3),4);
 * 		assertEquals(s1.boundingBox(),new Rectangle(new CartPt(3,4), 2, 2));
*		assertEquals(s2.boundingBox(),new Rectangle(new CartPt(6,8), 3, 3));
*		assertEquals(s3.boundingBox(),new Rectangle(new CartPt(2,3), 4, 4));
* input:
* output: Square
 */
@Override
public Rectangle boundingBox() {
	return new Rectangle(this.location,this.size, this.size);
}
/**
 * this is a method area() of class Square
 * @return
 * example:
 * 	new Square(new CartPt(3,4),2);
 * 	new Square(new CartPt(6,8),3);
 * 	new Square(new CartPt(2,3),4);
 * 	Square s1 = new Square(new CartPt(3,4),2);
 * 	Square s2 = new Square(new CartPt(6,8),3);
 * 	Square s3 = new Square(new CartPt(2,3),4);
 * 		assertEquals(s1.perimeter(),8);
 * 		assertEquals(s2.perimeter(),12);
 * 		assertEquals(s3.perimeter(),16);
 * input:
 * output: double
 */
@Override
public double perimeter() {
	return (this.size+this.size)*2;
}
}


	
	

