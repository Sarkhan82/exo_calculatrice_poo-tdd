package model;

import junit.framework.TestCase;

public class CalculateTest extends TestCase {

	public void testWithTwoNumber() {
		Calculate c = new Calculate();
		Number n1 = new Number(1);
		Number n2 = new Number(4);
		Operator o = new Operator("+");
		c.withTwoNumber(n1.getValue(), o.getValue(), n2.getValue());
		assertEquals(5, c.getResult());
	}

	public void testWithOneNumber() {
		fail("Not yet implemented");
	}

	public void testGetResult() {
		fail("Not yet implemented");
	}

	public void testSetResult() {
		fail("Not yet implemented");
	}

}
