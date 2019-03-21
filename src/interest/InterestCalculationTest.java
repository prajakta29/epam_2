package interest;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InterestCalculationTest {

	
	InterestCalculation i = new InterestCalculation();
	
	
	@Test
	void testSimpleinterest() {
		assertEquals(9.6,i.simpleinterest(80,3,4),0.0);
		assertEquals(360,i.simpleinterest(1500,6,4),0.0);
			
	}

	@Test
	void testCompoundinterest() {
		
	
	assertEquals(1641.1740000000002,i.compoundinterest(1500,2,4.6),0.0);
	assertEquals(16679.01984,i.compoundinterest(15000,3,3.6),0.0);
	
	}
	

}
