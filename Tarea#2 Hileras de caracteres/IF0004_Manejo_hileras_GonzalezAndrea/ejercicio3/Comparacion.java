//Ejercicio 3: Comparación de hileras 

import java.util.Scanner;

public class Comparacion {
    
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        String hilera1;
        String hilera2;

        System.out.println("Digite una hilera de caracteres \n");
        hilera1 = scanner.nextLine();

        System.out.println("\nDigite otra hilera de caracteres \n");
        hilera2 = scanner.nextLine();

        if(hilera1.equalsIgnoreCase(hilera2)){

            System.out.println("\nLas hileras son iguales\n");

        }else{

            System.out.println("\nLas hileras no son iguales \n");
        }
        
        
    }
}
