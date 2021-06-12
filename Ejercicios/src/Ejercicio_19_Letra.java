


/*
. Escriba un programa que determine si un carácter ingresado es letra, número, o ninguno de los dos. En caso que
sea letra, determine si es mayúscula o minúscula. (consultar tabla ASCII).

 * @author Jesus
 */

import java.util.Scanner;

public class Ejercicio_19_Letra {
    public static void main(String[] args) {
        char c;
      
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese cualquier letra : ");
        c=teclado.next().charAt(0);
        
        if (Character.isDigit(c)){
            System.out.println("El dato ingresado es un dato es un numero");
        }else if(Character.isUpperCase(c)){
            System.out.println("La letra es  mayuscula");
        }else if (Character.isLowerCase(c)){
            System.out.println("La letra es minuscula");

        }else{
            System.out.println("El dato ingresado es un simbolo");

        }
    }

}