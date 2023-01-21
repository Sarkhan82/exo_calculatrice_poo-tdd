package model;

import junit.framework.TestCase;

public class OperatorTest extends TestCase {

	// ---------------------------------------------------------------------------
	// CONSTRUCTEUR
	// ---------------------------------------------------------------------------

	/**
	 * Doit créer un objet Operator en donnant le paramètre opérator à l'attribut
	 * value La valeur ne peut pas être null et doit être uniquement plus, moins,
	 * diviser ou multiiplier
	 * 
	 */
	public void testOperator() {
		Operator o = new Operator("+");
		assertTrue("Doit retourner l'attribut valeur", o.getValue().equals("+"));
	}
	
	// ---------------------------------------------------------------------------
	// GETTER & SETTER
	// ---------------------------------------------------------------------------
	/**
	 * Doit retourner l'attribut valeur sous forme de String
	 */
	
	public void testGetValue() {
		Operator o = new Operator("+");
		assertTrue("Doit retourner l'attribut valeur", o.getValue().equals("+"));
	}
	
	/**
	 * Doit modifier la valeur de l'attribut valeur
	 * la valeur ne peut pas être null dois être un char => + / * ou moins
	 */

	public void testSetValue() {
		Operator o = new Operator("+");
		o.setValue("-");
		assertTrue("Doit retourner l'attribut valeur", o.getValue().equals("-"));
		o.setValue("x");
		assertFalse("Doit retourner l'attribut valeur", o.getValue().equals("x"));

		
	}

}
