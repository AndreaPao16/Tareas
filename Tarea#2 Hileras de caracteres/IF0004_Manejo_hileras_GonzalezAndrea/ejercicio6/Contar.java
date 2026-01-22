//Ejercicio 6: Contar vocales

import java.util.Scanner;

public class Contar {
    
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        String hilera;
        int totalVocales = 0;
        String vocales = "aeiou";

        System.out.println("Digite una hilera de caracteres\n");
        hilera = scanner.nextLine();

        for(int i = 0; i< hilera.length(); i++){

            if(vocales.indexOf(hilera.charAt(i)) != -1){

                totalVocales ++;
            }
        }

        System.out.println("\nTotal de vocales: " + totalVocales + "\n");

    }
}
