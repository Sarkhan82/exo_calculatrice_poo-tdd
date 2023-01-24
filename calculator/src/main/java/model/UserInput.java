package model;

import java.util.Scanner;

/**
 * La classe UserInput permet de récuperer les valeurs saisie par l'utilisateur
 * @author sarkhan
 *
 */
public class UserInput {
	
	// ---------------------------------------------------------------------------
	// ATTRIBUTS
	// ---------------------------------------------------------------------------
	
    private Scanner scanner;

	// ---------------------------------------------------------------------------
	// CONSTRUCTEUR
	// ---------------------------------------------------------------------------
    
    /**
     * Le constructeur créer un scanner automatiquement
     */
    public UserInput() {
        scanner = new Scanner(System.in);
    }
    
	// ---------------------------------------------------------------------------
	// METHODE
	// ---------------------------------------------------------------------------

    /**
     * Récupère les valeur des type char pour que l'utilisateur puisse choisir l'opérateur de son choix
     * N'accepte que des opérateurs ou indique à l'utilisateur une erreur
     * @return
     */
    public String stringInput() {
        while (true) {
            try {
                String input = scanner.nextLine();
                if (input.matches("[+\\-/*]")) {
                    return input;
                } else {
                    System.out.println("La valeur saisie n'est pas une opération valide (+, -, /, *), veuillez saisir une opération valide");
                }
            } catch (IllegalStateException e) {
                System.err.println("Scanner fermé, veuillez le réouvrir");
                scanner = new Scanner(System.in);
            }
        }
    }

    /**
     * Récupère les valeurs des types double pour que l'utilisateurs puisse rentrer les nombre des son choix
     * N'accepte que les nombres négatif, positif et a virgule 
     * Indique à l'utilisateur si sa saisie n'est pas valide
     * @return
     */
    public Double doubleInput() {
        while (true) {
            try {
                String input = scanner.nextLine();
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println("La valeur saisie n'est pas un nombre, veuillez saisir un nombre valide");
            } catch (IllegalStateException e) {
                System.err.println("Scanner fermé, veuillez le réouvrir");
                scanner = new Scanner(System.in);
            }
        }
    }
}
