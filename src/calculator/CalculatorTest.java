package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

	float a=0,b=0;
	Calculator c = new Calculator();
	
	@Test
public 	void testSum() {
		
		
	    assertEquals(70,c.sum(30,40));
		assertEquals(80,c.sum(20,60));
		assertEquals(-64,c.sum(40,-104));
		// TODO Auto-generated method stub
	}

	@Test
	void testMultiplication() {
		
		assertEquals(100,c.multiplication(25, 4));
		assertEquals(126,c.multiplication(9,14));
		
	}

	@Test
	void testDivision() {
		
		assertEquals(40,c.division(400, 10));
		assertEquals(5,c.division(40,8));
		
		
	}

}
