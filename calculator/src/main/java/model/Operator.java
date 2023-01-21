package model;

public class Operator {
	// ---------------------------------------------------------------------------
	// ATTRIBUTS
	// ---------------------------------------------------------------------------
	private char value;
	
	// ---------------------------------------------------------------------------
	// CONSTRUCTEUR
	// ---------------------------------------------------------------------------
	
	public Operator(String operator) {
		this.setValue(operator);
	}
	
	// ---------------------------------------------------------------------------
    // GETTER & SETTER
    // ---------------------------------------------------------------------------

	public char getValue() {
		return value;
	}

	public void setValue(String value) {
		if (value.matches("^[+\\-*/]$")) {
		this.value = value.charAt(0);
		}
		else {
			System.err.println("Mauvais caractère");
		}
	}
	
	
	
	
	
	

}
