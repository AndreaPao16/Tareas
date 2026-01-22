//Ejercicio 8: Validación simple de contraseña 

import java.util.Scanner;

public class Validacion {
    
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        String password;

        System.out.println("Digite una contraseña que contenga al menos 8 caracteres y una letra mayúscula\n");
        password = scanner.next();

        if(password.length() >= 8 & !password.equals(password.toLowerCase())){

            System.out.println("\nContraseña válida\n");

        }else{

            System.out.println("\nContraseña inválida\n");
        }

    }
}
