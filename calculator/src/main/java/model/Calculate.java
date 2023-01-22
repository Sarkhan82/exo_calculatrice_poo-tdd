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
	            break;
	        case '-':
	        	result = number1 - number2;
	        	break;
	        case '*':
	        	result = number1 * number2;
	        	break;
	        case '/':
	        	result = number1 / number2;
	        	break;
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
	            break;
	        case '-':
	        	result -= number;
	        	break;
	        case '*':
	        	result *= number;
	        	break;
	        case '/':
	        	result /= number;
	        	break;
	        default:
	            throw new IllegalArgumentException("Invalid operator: " + operator);
		  }

	}

	// ---------------------------------------------------------------------------
	// GETTER & SETTER
	// ---------------------------------------------------------------------------
	
	/**
	 * Retorune la valeur de l'attribut result
	 * permet d'afficher le résultat des calculs
	 * @return
	 */
	public double getResult() {
		return result;
	}

	/**
	 * Permet de modifier la valeur de l'attribut résult
	 * @param result
	 */
	public void setResult(double result) {
		this.result = result;
	}
	
}
