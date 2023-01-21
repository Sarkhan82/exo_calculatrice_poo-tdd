package model;

public class Calculate {

	// ---------------------------------------------------------------------------
	// ATTRIBUTS
	// ---------------------------------------------------------------------------

	private float result = 0;

	// ---------------------------------------------------------------------------
	// METHODES
	// ---------------------------------------------------------------------------

	/**
	 * Permet de réaliser un calcul avec 2 nombres
	 * @param number1 => number.getValue()
	 * @param operator => operator.getValue
	 * @param number2
	 */
	public void withTwoNumber(float number1, char operator, float number2) {
		  switch (operator) {
	        case '+':
	            result = number1 + number2;
	        case '-':
	        	result = number1 - number2;
	        case '*':
	        	result = number1 * number2;
	        case '/':
	        	result = number1 / number2;
	        default:
	            throw new IllegalArgumentException("Invalid operator: " + operator);
		  }
	}

	/**
	 * permet de réaliser un calcul avec un nombre en partant du dernier résultat
	 * @param number
	 * @param operator
	 */
	public void withOneNumber(float number, char operator) {
		  switch (operator) {
	        case '+':
	            result += number;
	        case '-':
	        	result -= number;
	        case '*':
	        	result *= number;
	        case '/':
	        	result /= number;
	        default:
	            throw new IllegalArgumentException("Invalid operator: " + operator);
		  }

	}

	// ---------------------------------------------------------------------------
	// GETTER & SETTER
	// ---------------------------------------------------------------------------
	
	public float getResult() {
		return result;
	}

	public void setResult(float result) {
		this.result = result;
	}
	
}
