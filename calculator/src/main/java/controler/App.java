package controler;

import model.Calculate;
import model.UserInput;
import model.Number;
import model.Operator;

/**
 * Lance l'application
 *
 */
public class App {
	
	
	
	public static void main(String[] args) {
		Calculate c = new Calculate();
		UserInput u = new UserInput();
		System.out.println("Choisisez un nombre");
		Number n1 = new Number(u.doubleInput());
		System.out.println("Choisisez un opérateur");
		Operator op = new Operator(u.stringInput());
		System.out.println("Choisisez un autre nombre nombre");
		Number n2 = new Number(u.doubleInput());
		c.withTwoNumber(n1.getValue(), op.getValue(), n2.getValue());
		System.out.println(c.getResult());
	}
}
