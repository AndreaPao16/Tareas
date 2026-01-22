//Ejercicio 7: Invertir una hilera 

import java.util.Scanner;

public class Invertir {
    
    public static void main (String args[]){

        Scanner scanner = new Scanner(System.in);

        String palabra;
        String invertida = "";

        System.out.println("Digite una palabra\n");
        palabra = scanner.next();

        for(int i = palabra.length()-1; i >= 0; i--){

            invertida += palabra.charAt(i);

        }

        System.out.println("\n" + invertida + "\n");
    }
}
