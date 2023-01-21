package model;

public class Calculate {

	// ---------------------------------------------------------------------------
	// ATTRIBUTS
	// ---------------------------------------------------------------------------

	private double result = 0;

	// ---------------------------------------------------------------------------
	// METHODES
	// ---------------------------------------------------------------------------

	/**
	 * Permet de réaliser un calcul avec 2 nombres
	 * @param number1 => number.getValue()
	 * @param operator => operator.getValue
	 * @param number2
	 */
	public void withTwoNumber(double number1, char operator, double number2) {
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
	public void withOneNumber(double number, char operator) {
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
	
	public long getResult() {
		return result;
	}

	public void setResult(long result) {
		this.result = result;
	}
	
}
