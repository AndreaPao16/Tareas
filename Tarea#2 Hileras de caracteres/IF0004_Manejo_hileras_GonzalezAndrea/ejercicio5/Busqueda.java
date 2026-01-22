//Ejercicio 5: Búsqueda dentro de una hilera 

import java.util.Scanner;

public class Busqueda {
    
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        String frase;
        String palabra;

        System.out.println("Digite una frase\n");
        frase = scanner.nextLine();

        System.out.println("\nDigite una palabra\n");
        palabra = scanner.next();

        if(frase.contains(palabra)){
            
            System.out.println("\n'"+ frase + "' contiene la palabra '" + palabra + "'\n");

        }else{

            System.out.println("\n'"+ frase + "' no contiene la palabra '" + palabra + "'\n");

        }
        
    }
}
