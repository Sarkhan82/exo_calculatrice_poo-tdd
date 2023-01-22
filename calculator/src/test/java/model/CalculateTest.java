package model;

import junit.framework.TestCase;

public class CalculateTest extends TestCase {

	public void testWithTwoNumber() {
		Calculate c = new Calculate();
		Number n1 = new Number(1);
		Number n2 = new Number(4);
		Operator o = new Operator("+");
		c.withTwoNumber(n1.getValue(), o.getValue(), n2.getValue());
		assertEquals(5.0, c.getResult());
	}

	public void testWithOneNumber() {
		Calculate c = new Calculate();
		Number n = new Number(4);
		Operator o = new Operator("+");
		c.withOneNumber(n.getValue(), o.getValue());
		assertEquals(4.0, c.getResult());
		n.setValue(2);
		o.setValue("-");
		c.withOneNumber(n.getValue(), o.getValue());
		assertEquals(2.0, c.getResult());
		n.setValue(4);
		o.setValue("*");
		c.withOneNumber(n.getValue(), o.getValue());
		assertEquals(8.0, c.getResult());
		o.setValue("/");
		c.withOneNumber(n.getValue(), o.getValue());
		assertEquals(2.0, c.getResult());
	}

	public void testGetResult() {
		fail("Not yet implemented");
	}

	public void testSetResult() {
		fail("Not yet implemented");
	}

}
