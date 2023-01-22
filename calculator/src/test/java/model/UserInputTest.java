package model;

import junit.framework.TestCase;
import java.io.ByteArrayInputStream;

public class UserInputTest extends TestCase {

	/**
	 * Ne doit accepter que les valeurs +, moins, / et *
	 * pas de valeur null
	 */
	public void testCharInput() {
		UserInput u = new UserInput();
        // Test valid input
        System.setIn(new ByteArrayInputStream("+\n".getBytes()));
        assertEquals('+', u.charInput());

        // Test invalid input
        System.setIn(new ByteArrayInputStream("a\n".getBytes()));
        assertEquals('+', u.charInput());
	}

	/**
	 * Ne doit accepter que les chiffres positif, négatif et/ou à virgule
	 * ne peut pas être null, ne peut pas être un String
	 */
	public void testDoubleInput() {
		UserInput u = new UserInput();
        // Test valid input
        System.setIn(new ByteArrayInputStream("3.14\n".getBytes()));
        assertEquals(3.14, u.doubleInput());

        // Test invalid input
        System.setIn(new ByteArrayInputStream("a\n".getBytes()));
        assertEquals(3.14, u.doubleInput());
	}

}
