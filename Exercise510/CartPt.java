package Exercise510;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.function.BooleanSupplier;

public class CartPt {
	private int x;
	private int y;
/**
 * this is a constructor of class CartPt. There are 4 field
 * @param x
 * @param y
 * example:
 * 	new CartPt(3,4);
 * 	new CartPt(6,8);
 * 	new CartPt(2,3);
 */
	public CartPt(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
public String toString() {
	return "CartPt (x: " + x + ", y: " + y+ ")";
}

	public int getX() {
		return this.x;
 }
 	public int getY() {
 		return this.y;
 }
//translate this point to deltaX, deltaY distance
 	public CartPt translate(int dX, int dY) {
 		return new CartPt(this.x + dX, this.y + dY);
	
}
 /**
  * this is a method distanceToO() of class CartPt
  * @return
  * example:
 *   new CartPt(3,4);
 * 	 new CartPt(6,8);
 * 	 new CartPt(2,3);
 *  CartPt c1 = new CartPt(3,4); 
 *  CartPt c2 = new CartPt(6,8); 
 *  CartPt c3 = new CartPt(2,3); 
 *  	assertEquals(d1.distanceToO(),5);
*	    assertEquals(d2.distanceToO(),10);
*	    assertEquals(d3.distanceToO(),Math.sqrt(13));
* input:
* output: double
 */
 public double distanceToO() {
		return Math.sqrt(Math.pow( this.x, 2) + Math.pow( this.y, 2));
		
	}
// method equals
@Override
 	public boolean equals(Object obj) {
 		if(obj == null || !(obj instanceof CartPt)) {
 			return false;
 		}else {
 			CartPt that = (CartPt) obj;
 			return this.x == that.x && 
 					this.y == that.y;
 		}
 	}
	}
