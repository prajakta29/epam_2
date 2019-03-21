package house;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HouseCostTest {

	HouseCost h = new HouseCost();
	
	@Test
	void testConstructcost() {
		assertEquals(720000,h.constructcost(1,600));//standard house
		assertEquals(900000,h.constructcost(2,600));//above standard
		assertEquals(1080000,h.constructcost(3,600));//high standard
		assertEquals(1500000,h.constructcost(4,600));//high standard and fully automated
		
	}

}
