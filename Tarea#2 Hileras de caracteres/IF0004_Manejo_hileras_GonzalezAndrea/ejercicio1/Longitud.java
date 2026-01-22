//Ejercicio 1: Longitud de una hilera

import java.util.Scanner;

public class Longitud{

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        String hilera;

        System.out.println("Digite una hilera de caracteres\n");
        hilera = scanner.nextLine();

        hilera = hilera.replace(" ", "");

        System.out.println("\nCantidad de caracteres en '" + hilera + "': " + hilera.length() + "\n");
    }
}