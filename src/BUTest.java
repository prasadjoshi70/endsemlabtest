import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BUTest {

	@Before
	public void setUp() throws Exception {
	}

	BU a,b,c;
	Evm t;
	
	@Test
	public void testGetName() {
		
		a=new BU(t,"Prasad");
		assertEquals("Prasad",a.getName());
		
		b=new BU(t,"Vinod");
		assertEquals("Vinod",b.getName());
		
	}

	@Test
	public void testGetNumberOfVotes() {
		c=new BU(t,"Vinod");
		assertEquals(0,c.getNumberOfVotes());
	}

}
