import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class VoterTest {

	@Before
	public void setUp() throws Exception {
	}
	Voter v;
	BU c1;
	@Test
	public void testVoter() {
		
		v=new Voter (103,c1);
		assertEquals(103,v.getId());
	}


}
