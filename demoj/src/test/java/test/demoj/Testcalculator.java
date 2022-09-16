package test.demoj;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Testcalculator {
	Calculator c = new Calculator();
	@Test
	public void testadd() {
		assertEquals(5,c.add(2, 3));
		
	}

}
