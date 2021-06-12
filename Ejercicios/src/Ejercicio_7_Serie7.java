/*
 Construya un programa que genere como salida los N términos (mayor a 10) de la siguiente serie:  2; 5; 7; 10; 12; 15; 17;……..
 * @author jesus
 */

import java.util.Scanner;

public class Ejercicio_7_Serie7 {

       
    public static void main (String[] args){
        Scanner lector = new Scanner(System.in);
        int i = 2, n, o = 2;
        System.out.println("Ingrese el numero para realizar la serie. " + "\n" + "el numero debe ser mayor a 10:");
        n=lector.nextInt();
                
        if(n>=10){
            System.out.print(o);
            while(i<=n){
                if(i%2==0){
                    System.out.print("\t" +(o+3));
                    o=o+3;
                }
                else{
                    System.out.print("\t" +(o+2));
                    o=o+2;
                }
                i++;
            }
        }
        else{
            System.out.println("El numero ingresado en menor a 10");
        }
    }    
}