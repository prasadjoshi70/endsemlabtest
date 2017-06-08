import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EvmTest {

	Evm a,b;
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetConstinuency() {
		a=new Evm(1,"Thivim");
		assertEquals("Thivim",a.getConstinuency());
		
		b=new Evm(2,"Mapusa");
		assertEquals("Mapusa",b.getConstinuency());
	}


}
