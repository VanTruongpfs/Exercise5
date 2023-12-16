package Exercise510;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Dot extends AShape{
/**
 * this is a constructor of class Dot. There are 1 field
 * @param location
 * example:
 *  new Dot(new CartPt(3,4));
 *  new Dot(new CartPt(6,8));
 *  new Dot(new CartPt(2,3));
 */
	public Dot(CartPt location) {
		super(location);
	}
/**
* this is method area() of class Dot
* @return
* example:
*  new Dot(new CartPt(3,4));
*  new Dot(new CartPt(6,8));
*  new Dot(new CartPt(2,3));
*   Dot d1 =  new Dot(new CartPt(3,4));
*   Dot d2 =  new Dot(new CartPt(6,8));
*   Dot d3 =  new Dot(new CartPt(2,3));
*    assertEquals(d1.area(),0);
*	 assertEquals(d2.area(),0);
*	 assertEquals(d3.area(),0);
* input: 
* output: double
*/
@Override
	public double area() {
		return 0;
	}
/**
 * @return
 * example:
 *  new CartPt(3,4);
*   new CartPt(6,8);
*	new CartPt(2,3);
*		  CartPt cp1 = new CartPt(3,4); 
*		  CartPt cp2 = new CartPt(6,8); 
*		  CartPt cp3 = new CartPt(2,3); 
 * new Dot(new CartPt(3,4));
*  new Dot(new CartPt(6,8));
*  new Dot(new CartPt(2,3));
*    Dot d1 =  new Dot(new CartPt(3,4));
*    Dot d2 =  new Dot(new CartPt(6,8));
*    Dot d3 =  new Dot(new CartPt(2,3));
*      assertTrue(d1.contains(cp1));
*	   assertFalse(d2.contains(cp1));
*	   assertFalse(d3.contains(cp2));
* input: CartPt Point
* output: boolean
 */
@Override
public boolean contains(CartPt Point) {
	if( this.location.getX() == Point.getX() && this.location.getY() == Point.getY()) {
		return true;
	}else {
		return false;
	}
	
}
/**
 * this is method boundingBox()
 * @return
 * example:
*  new Dot(new CartPt(3,4));
*  new Dot(new CartPt(6,8));
*  new Dot(new CartPt(2,3));
*   Dot d1 =  new Dot(new CartPt(3,4));
*   Dot d2 =  new Dot(new CartPt(6,8));
*   Dot d3 =  new Dot(new CartPt(2,3));
*    assertEquals(d1.boundingBox(),new Rectangle(new CartPt(3,4),0));
*	 assertEquals(d2.boundingBox(),new Rectangle(new CartPt(6,8),0));
*	 assertEquals(d3.boundingBox(),new Rectangle(new CartPt(2,3),0));
* input:
* output: Rectangle
 * 
 */
@Override
public Rectangle boundingBox() {
	return new Rectangle(this.location, 0, 0) ;
}/**
* this is method perimeter() of class Dot
* @return
* example:
*  new Dot(new CartPt(3,4));
*  new Dot(new CartPt(6,8));
*  new Dot(new CartPt(2,3));
*   Dot d1 =  new Dot(new CartPt(3,4));
*   Dot d2 =  new Dot(new CartPt(6,8));
*   Dot d3 =  new Dot(new CartPt(2,3));
*    assertEquals(d1.perimeter(),0);
*	 assertEquals(d2.perimeter(),0);
*	 assertEquals(d3.perimeter(),0);
* input
* output: double
*/
@Override
public double perimeter() {
	return 0;
}


}
