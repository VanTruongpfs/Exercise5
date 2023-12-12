package Exercise51;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ListTest {

	@Test
	public void test() {
		House h1 =  new House("Ranch", 7 , 375000, new Address(23 , "Maple Street", "Brookline"));
		House h2 =  new House("Colonial", 9, 450000, new Address(5 ,"Joye Road", "Newton"));
		House h3 =  new House("Cape", 6, 235000, new Address(83 ,"Winslow Road", "Waltham"));
		
		EmtyList mt = new EmtyList();
		ConsList l3 = new ConsList(h3, mt);
		ConsList l2 = new ConsList(h2, l3);
		ConsList l1 = new ConsList(h1, l2);
		
		System.out.println("List house: \n" + l1);
	}

}
