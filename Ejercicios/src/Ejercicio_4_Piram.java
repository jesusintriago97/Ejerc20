
/*
Realice un programa que dibuje un triángulo de n filas, empleando el carácter asterisco (*). Por ejemplo para n = 4
@author jesus
 */

import java.util.Scanner;

public class Ejercicio_4_Piram {
    
    public static void main(String[] args){
        
        Scanner piramide=new Scanner(System.in);
        System.out.print("Ingresa Numero de fila para la piramide:    ");
        int nun_filas = piramide.nextInt();
        piramide.close();
        
        System.out.println();
        for (int alto=1; alto <= nun_filas; alto++){
        
            for(int espacio = 1; espacio <= nun_filas-alto; espacio++){
                System.out.print(" ");
            }
            
            for(int asteriscos=1; asteriscos <=(alto*1); asteriscos++){
                System.out.print("*");
                
            }
            System.out.println();
        }
   }    
    
}
