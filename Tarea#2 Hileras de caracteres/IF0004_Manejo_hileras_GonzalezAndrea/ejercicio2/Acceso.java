//Ejercicio 2: Acceso a caracteres 

import java.util.Scanner;

public class Acceso {
    
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        String hilera;

        System.out.println("Digite una hilera de caracteres\n");
        hilera = scanner.nextLine();
        hilera = hilera.replace(" ", "");


      
        System.out.println("\nPrimer caracter: " + hilera.charAt(0) + "\nÚltimo caracter: " + hilera.charAt(hilera.length()-1) + "\n");

    }
}
