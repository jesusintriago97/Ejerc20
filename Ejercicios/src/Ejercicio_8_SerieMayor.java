
import java.util.Scanner;

/*
 Haga un programa que muestre los números naturales menores o iguales a un valor N (validar que sea positivo
y mayor a 10), previamente ingresado. Considere que no se deben mostrar aquellos que no sean múltiplos ni de
3 ni de 5
 * @author jesus
 */



import java.util.Scanner;

public class Ejercicio_8_SerieMayor {public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int num, resultado = 0;
        while (true) {
            System.out.println("Ingrese el numero de la serie mayor a 10: ");
            num = lector.nextInt();
            if (num > 0 && num > 10) {
                System.out.println("Correcto ");
                for (int i = 1; i <= num; i++) {

                    if (i % 3 != 0 && i % 5 != 0) {
                        System.out.println("" + i);
                    }

                }

                {
                    break;
                }
            } else {
                System.out.println("El numero debe ser mayor a 10");

            }

        }
    }
    
}