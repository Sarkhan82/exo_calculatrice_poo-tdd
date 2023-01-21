package model;

import junit.framework.TestCase;

public class NumberTest extends TestCase {

	// ---------------------------------------------------------------------------
	// CONSTRUCTEUR
	// ---------------------------------------------------------------------------
	
	/**
	 * Doit créer un objet Number en donnant le paramètre number à l'attrabut value
	 * la valeur ne peut pas être null et doit être un int
	 */
	
	public void testNumber() {
		Number n = new Number(1);
		assertTrue("Doit retourner l'attribut valeur", n.getValue() == 1);
	}

	// ---------------------------------------------------------------------------
	// GETTER & SETTER
	// ---------------------------------------------------------------------------
	/**
	 * Doit retourner l'attribut valeur sous forme de int
	 */
	public void testGetValue() {
		Number n = new Number(1);
		assertTrue("Doit retourner l'attribut valeur", n.getValue() == 1);
		assertFalse("Doit retourner l'attribut valeur", n.getValue() == 20);
	}

	/**
	 * Doit modifier la valeur de l'attribut valeur
	 * la valeur ne peut pas être null et doit être un int
	 */
	public void testSetValue() {
		Number n = new Number(1);
		n.setValue(3);
		assertTrue("Doit modifier l'attribut valeur par 3", n.getValue() == 3);
	}

}
