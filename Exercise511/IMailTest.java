package Exercise511;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IMailTest {
/**
 * this is testing for constructor
 */
	@Test
	public void testConstructor() {
		 new Mail("levantruong@gmail.com",new Date(16, 12, 2023));
		 new Mail("levantruong123@gmail.com",new Date(17, 12, 2023));
		 new Mail("levantruong456@gmail.com",new Date(20, 11, 2023));
		 new Mail("levantruong789@gmail.com",new Date(19, 12, 2023));
		 
		 Mail m1 = new Mail("levantruong@gmail.com",new Date(16, 12, 2023));
		 Mail m2 = new Mail("levantruong123@gmail.com",new Date(17, 12, 2023));
		 Mail m3 = new Mail("levantruong456@gmail.com",new Date(20, 11, 2023));
		 Mail m4 = new Mail("levantruong789@gmail.com",new Date(19, 12, 2023));
		 
		 MTMail mt = new MTMail();
		 ConsMail l1 = new ConsMail(m4, mt);
		 ConsMail l2 = new ConsMail(m3, l1);
		 ConsMail l3 = new ConsMail(m2, l2);
		 ConsMail l4 = new ConsMail(m1, l3);
		  System.out.println(l4.sortByDate());
		  
		 
	}

}
