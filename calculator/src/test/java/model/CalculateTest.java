package model;

import junit.framework.TestCase;

public class CalculateTest extends TestCase {

	/**
	 * Doit retourner une le bon résultat en fonction de l'opérateur
	 * la valeur de Result et de number ne peuvent pas être null
	 */
	public void testWithTwoNumber() {
		Calculate c = new Calculate();
		Number n1 = new Number(1);
		Number n2 = new Number(4);
		Operator o = new Operator("+");
		c.withTwoNumber(n1.getValue(), o.getValue(), n2.getValue());
		assertEquals(5.0, c.getResult());
	}

	/**
	 * Doit retourner une le bon résultat en fonction de l'opérateur
	 * la valeur de Result et de number ne peuvent pas être null
	 */
	public void testWithOneNumber() {
		Calculate c = new Calculate();
		Number n = new Number(4);
		Operator o = new Operator("+");
		assertNotNull("La valeur ne peut pas être null", n.getValue());
		assertNotNull("La valeur ne peut pas être null", c.getResult());
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

	/**
	 * Doit retourner la valeur de l'attribut result
	 * Ne peut pas être null
	 */
	public void testGetResult() {
		Calculate c = new Calculate();
		assertTrue("Doit retourner l'attribut valeur soit 0", c.getResult() == 0);
		assertFalse("Doit retourner l'attribut valeur soit 0", c.getResult() == 20);
		assertNotNull("La valeur ne peut pas être null", c.getResult());
	}

	/**
	 * Doit modifier la valeur de l'attribut result
	 * Ne peut pas être null, peut être négatif
	 */
	public void testSetResult() {
		Calculate c = new Calculate();
		assertNotNull("La valeur ne peut pas être null", c.getResult());
		c.setResult(4.5);
		assertTrue("Doit retourner l'attribut valeur soit 4.5", c.getResult() == 4.5);
		c.setResult(-5.5);
		assertTrue("Doit retourner l'attribut valeur soit -5.5", c.getResult() == -5.5);
		c.setResult(1500);
		assertTrue("Doit retourner l'attribut valeur soit 1500", c.getResult() == 1500);
		
	}

}
