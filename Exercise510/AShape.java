package Exercise510;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.function.BooleanSupplier;

public abstract class AShape implements IShape {
	protected CartPt location;
/**
 * this is a constructor of class. There are 1 field
 * @param location
 */
	public AShape(CartPt location) {
		this.location = location;
	}
/**
 * this is method area()
 * example:
 * this is testing for Area of Dot
*		AShape d1 = new Dot(new CartPt(3,4));
*		AShape d2 = new Dot(new CartPt(6,8));
*		AShape d3 = new Dot(new CartPt(2,3));
*			assertEquals(d1.area(),0);
*			assertEquals(d2.area(),0);
*			assertEquals(d3.area(),0);
* this is testing for Area of Square
*		AShape s1 = new Square(new CartPt(3,4),2);
*		AShape s2 = new Square(new CartPt(6,8),3);
*		AShape s3 = new Square(new CartPt(2,3),4);
*			assertEquals(s1.area(),4);
*			assertEquals(s2.area(),9);
*			assertEquals(s3.area(),16);
* this is testing for Area of Circle
*		AShape c1 = new Circle(new CartPt(3,4),1);
*		AShape c2 = new Circle(new CartPt(6,8),2);
*		AShape c3 = new Circle(new CartPt(2,3),3);
*			assertEquals(c1.area(),Math.PI*1);
*			assertEquals(c2.area(),Math.PI*4);
*			assertEquals(c3.area(),Math.PI*9);
* input:
* output: double
*/
	public abstract double area();
/**
 * this is a method distanceToO() of class AShape
 * @return
 * example:
 * 	 this is testing for distance to O of Dot
*		AShape d1 = new Dot(new CartPt(3,4));
*		AShape d2 = new Dot(new CartPt(6,8));
*		AShape d3 = new Dot(new CartPt(2,3));
*			assertEquals(d1.distanceToO(),5);
*			assertEquals(d2.distanceToO(),10);
*			assertEquals(d3.distanceToO(),Math.sqrt(13));
* this is testing for distance to O of Square
*		AShape s1 = new Square(new CartPt(3,4),2);
*		AShape s2 = new Square(new CartPt(6,8),3);
*		AShape s3 = new Square(new CartPt(2,3),4);
*			assertEquals(d1.distanceToO(),5);
*			assertEquals(d2.distanceToO(),10);
*			assertEquals(d3.distanceToO(),Math.sqrt(13));
* this is testing for distance to O of Circle
*		AShape c1 = new Circle(new CartPt(3,4),1);
*		AShape c2 = new Circle(new CartPt(6,8),2);
*		AShape c3 = new Circle(new CartPt(2,3),3);
*			assertEquals(d1.distanceToO(),5);
*			assertEquals(d2.distanceToO(),10);
*			assertEquals(d3.distanceToO(),Math.sqrt(13));
*input:
* output: double
 */
	public double distanceToO() {
		return this.location.distanceToO();
		
	}
/**
 * this is a method contains() 
 * @return
 *  new CartPt(3,4);
*	new CartPt(6,8);
*	new CartPt(2,3);
*		  CartPt cp1 = new CartPt(3,4); 
*		  CartPt cp2 = new CartPt(6,8); 
*		  CartPt cp3 = new CartPt(2,3); 
* // this is testing for distance to O of Dot
*	AShape d1 = new Dot(new CartPt(3,4));
*	AShape d2 = new Dot(new CartPt(6,8));
*	AShape d3 = new Dot(new CartPt(2,3));
*		 assertTrue(d1.contains(cp1));
*		 assertFalse(d2.contains(cp1));
*		 assertFalse(d3.contains(cp2));
* // this is testing for distance to O of Square
*		AShape s1 = new Square(new CartPt(3,4),2);
*		AShape s2 = new Square(new CartPt(6,8),3);
*		AShape s3 = new Square(new CartPt(2,3),4);
*			assertTrue(s1.contains(cp1));
*			assertFalse(s1.contains(cp2));
*			assertFalse(s2.contains(cp3));
* // this is testing for distance to O of Circle
*		AShape c1 = new Circle(new CartPt(3,4),1);
*		AShape c2 = new Circle(new CartPt(6,8),2);
*		AShape c3 = new Circle(new CartPt(2,3),3);
*			assertTrue(c1.contains(cp1));
*			assertFalse(c1.contains(cp2));
*			assertFalse(c2.contains(cp3));
*input: CartPt Point
*output: boolean 
 */
	public abstract boolean contains(CartPt Point);
/**
 * this is a method boundingBox()
 * example:
 * 	// this is testing for boundingBox of Dot
		AShape d1 = new Dot(new CartPt(3,4));
		AShape d2 = new Dot(new CartPt(6,8));
		AShape d3 = new Dot(new CartPt(2,3));
			assertEquals(d1.boundingBox(),new Rectangle(new CartPt(3,4),0,0));
			assertEquals(d2.boundingBox(),new Rectangle(new CartPt(6,8),0,0));
			assertEquals(d3.boundingBox(),new Rectangle(new CartPt(2,3),0,0));
// this is testing for boundingBox of Square
		AShape s1 = new Square(new CartPt(3,4),2);
		AShape s2 = new Square(new CartPt(6,8),3);
		AShape s3 = new Square(new CartPt(2,3),4);
			assertEquals(s1.boundingBox(),new Rectangle(new CartPt(3,4), 2, 2));
			assertEquals(s2.boundingBox(),new Rectangle(new CartPt(6,8), 3 ,3));
			assertEquals(s3.boundingBox(),new Rectangle(new CartPt(2,3), 4, 4));
// this is testing for boundingBox of Circle
		AShape c1 = new Circle(new CartPt(3,4),1);
		AShape c2 = new Circle(new CartPt(6,8),2);
		AShape c3 = new Circle(new CartPt(2,3),3);
			assertEquals(c1.boundingBox(),new Rectangle(new CartPt(2,3), 2, 2));
			assertEquals(c2.boundingBox(),new Rectangle(new CartPt(4,6), 4, 4));
			assertEquals(c3.boundingBox(),new Rectangle(new CartPt(-1,0), 6, 6));
// this is testing for boundingBox of Rectangle
		AShape r1 = new Rectangle(new CartPt(3,4),4,4);
		AShape r2 = new Rectangle(new CartPt(6,8),3,3);
		AShape r3 = new Rectangle(new CartPt(2,3),3,3);
			assertEquals(r1.boundingBox(),new Rectangle(new CartPt(3,4), 4, 4));
			assertEquals(r2.boundingBox(),new Rectangle(new CartPt(6,8), 3, 3));
			assertEquals(r3.boundingBox(),new Rectangle(new CartPt(2,3), 3, 3));
* input:
* output: Rectangle
 */
	public abstract Rectangle boundingBox();
/**
 * this is a method perimeter 
 * example:
 * //this is testing for perimeter of Dot
*		AShape d1 = new Dot(new CartPt(3,4));
*		AShape d2 = new Dot(new CartPt(6,8));
*		AShape d3 = new Dot(new CartPt(2,3));
*			assertEquals(d1.perimeter(),0);
*			assertEquals(d2.perimeter(),0);
*			assertEquals(d3.perimeter(),0);
*	// this is testing for perimeter of Square
*		AShape s1 = new Square(new CartPt(3,4),2);
*		AShape s2 = new Square(new CartPt(6,8),3);
*		AShape s3 = new Square(new CartPt(2,3),4);
*			assertEquals(s1.perimeter(),8);
*		 	assertEquals(s2.perimeter(),12);
*		 	assertEquals(s3.perimeter(),16);
*	// this is testing for perimeter of Square
*		AShape c1 = new Circle(new CartPt(3,4),1);
*		AShape c2 = new Circle(new CartPt(6,8),2);
*		AShape c3 = new Circle(new CartPt(2,3),3);
*			assertEquals(c1.perimeter(),Math.PI*2);
*		 	assertEquals(c2.perimeter(),Math.PI*4);
*		 	assertEquals(c3.perimeter(),Math.PI*6);
*	// this is testing for perimeter of Square
*		AShape r1 = new Rectangle(new CartPt(3,4),2,4);
*		AShape r2 = new Rectangle(new CartPt(6,8),2,3);
*		AShape r3 = new Rectangle(new CartPt(2,3),3,1);
*		 	assertEquals(r1.perimeter(),12);
*		 	assertEquals(r2.perimeter(),10);
*		 	assertEquals(r3.perimeter(),8);		 
* input:
* output: double
 */
	public abstract double perimeter();
	}


