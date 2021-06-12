
/*
 A través de un Programa desarrolle y muestre el resultado de la siguiente fórmula:
S = (1/2) 1+(2/4)2+(3/6) 3 + ...............+ (N/(N*2) N
 * @author jesus
 */

import java.util.Scanner;

public class Ejercicio_6 {
    
   
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double a, e = 0;
        while (true) {
            System.out.println("Ingrese el numero para calcular la serie: ");
            a = lector.nextInt();
            if (a > 0) {
    System.out.println("Resultado de la serie es:");
                for (int i = 1; i <= a; i++) {
                    double N = i;
                    e += Math.pow((N / (N * 2)), (N));

                    if (N < a) {

                        System.out.print("(" + i + "/" + (i * 2) + ")" + i + " + ");
                    } else {
                        System.out.print("(" + i + "/" + (i * 2) + ")" + i + " = " + e+"\n");
                               
                    }         
                }      

            } 
        }
    }
}