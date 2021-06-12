/*
Hacer un programa que pida una letra por teclado y luego un número. Si la letra digitada es “C” entonces significa
que el número representa grados centígrados, así que lo convierte a grados Fahrenheit, si la letra digitada es “F”
entonces significa que el número representa grados Fahrenheit, así que lo convierte a grados centígrados. Si
digitó una letra distinta entonces saque un mensaje de error diciendo que solo puede digitar C o F.

 * @author ronald
 */

import java.util.Scanner;

public class Ejercicio_3_Grados {
    
     public static void main(String[] args) {
        char opcion;
        int o;
        int P;
        Scanner leer = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("Escriba una letra C O K ");
        System.out.println("C CELSIUS");
        System.out.println("K FAHRENHEIT");
        System.out.println("Ingrese su  letra:");
        opcion = (char) leer.next().charAt(0);
        P = Character.toUpperCase(opcion);
        Ejercicio_3_Grados conversion = new Ejercicio_3_Grados();
        switch (P) {
            case 75:
                System.out.println("Ingrese el valor en Fahrenheit");
                o = leer.nextInt();
                double resultado = conversion.convertirFahrenheitACelsius(o);
                System.out.println("El resultado en celsius es " + resultado);
                break;
            case 67:
                System.out.println("Ingrese el valor en celsius");
                o = leer.nextInt();
                resultado = conversion.convertirCelsiusAFahrenheit(o);
                System.out.println( "El resultado en fahrenheit es" + resultado);
                break;
            default:
                System.out.println("Ingrese un dato valido ya sea K - C ");
        }
    }

    //    C = 5((F-32)/9)
    public double convertirFahrenheitACelsius(double fahrenheit) {
        double celsius = 0;
        celsius = 5 * ((fahrenheit - 32) / 9);
        return celsius;
    }

    //    F = 32 + ( 9 * C / 5)
    public double convertirCelsiusAFahrenheit(double celsius) {
        double fahrenheit = 0;
        fahrenheit = 32 + ((9 * celsius) / 5);
        return fahrenheit;
    }
}