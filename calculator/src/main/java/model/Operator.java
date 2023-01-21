package model;

public class Operator {
	// ---------------------------------------------------------------------------
	// ATTRIBUTS
	// ---------------------------------------------------------------------------
	private String value = "";
	
	// ---------------------------------------------------------------------------
	// CONSTRUCTEUR
	// ---------------------------------------------------------------------------
	
	public Operator(String operator) {
		this.setValue(operator);
	}
	
	// ---------------------------------------------------------------------------
    // GETTER & SETTER
    // ---------------------------------------------------------------------------

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		if (value.matches("^[+\\-=*/]$")) {
		this.value = value;
		}
		else {
			System.err.println("Mauvais caractère");
		}
	}
	
	
	
	
	
	

}
