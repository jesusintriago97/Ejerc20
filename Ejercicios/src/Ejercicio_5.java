



/*
Ingresar un valor N (mayor a 10) y calcular la serie: S = 1^2+2^2+3^2…+N^2
 * @author jesus   
 */


import java.util.Scanner;
public class Ejercicio_5 {
        public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int num, resultado = 0;
        while (true) {
            System.out.println("Ingrese un numero mayor a 10 para calcular la serie: ");
            num = lector.nextInt();
            if (num > 10) {
                for (int i = 1; i <= num; i++) {
                    resultado += Math.pow(i, (i));
               
               if (i < num) {

                        System.out.print("(" + i + ")" + 2 + " + ");
                    } else {
                        System.out.print("(" + i + ")" + 2 + " = " + resultado+"\n");
                               
                    }         
                }   break;   

            } else {
                System.out.println("Error el numero debe ser mayor a 10");
            }
        }
    }
    
}
    

   
    

