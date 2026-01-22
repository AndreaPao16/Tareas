//Ejercicio 4: Conversión de mayúsculas y minúsculas 

import java.util.Scanner;

public class Conversion {
    
    public static void main (String args[]){

        Scanner scanner = new Scanner(System.in);

        String frase;

        System.out.println("Digite una frase\n");
        frase = scanner.nextLine();

        System.out.println("\nFrase original: " + frase + "\nFrase en mayúsculas: " + frase.toUpperCase() + "\nFrase en minúsculas: " + frase.toLowerCase() + "\n");
    }
}
