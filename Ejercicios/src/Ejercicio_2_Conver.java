import java.text.DecimalFormat;
import java.util.Scanner;
/*
Escriba un programa que permita ingresar la siguiente información: el primer dato representa un valor numérico
y el segundo un valor de tipo cadena que representa la medida (Metros, Decímetros, Pulgadas y Pies). Dicho
programa deberá transformar y mostrar el valor numérico convertido a centímetros
@author jesus
 */
public class Ejercicio_2_Conver {
    
   public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int metros,decimetros,pulgadas,pies;
        int opcion;
        
        double resultado;
        System.out.println("           MENU          ");
        System.out.println("Digite el numero de la medida a convertir en centimetros:");
        System.out.println("1.- Metros");
        System.out.println("2.- Decimetros");
        System.out.println("3.- Pulgadas");
        System.out.println("4.- Pies");

         System.out.println("Ingrese que desea convertir:");
        
        opcion = leer.nextInt();
        switch (opcion) {
            case 1:
                   System.out.println("Ingrese el valor a convertir");
                metros = leer.nextInt();
                resultado = metros * 100;
                System.out.println("El resultado es: " + resultado + " metros");
                break;
            case 2:
                 System.out.println("Ingrese el valor a convertir");
                decimetros = leer.nextInt();
                resultado = decimetros * 0.1;
                System.out.println("El resultado es: " + resultado + " decimetros");
                break;
            case 3:
                System.out.println("Ingrese el valor a convertir");
                pulgadas = leer.nextInt();
                resultado = pulgadas * 2.54;
                System.out.println("El resultado es: " + resultado + " pulgadas");
                break;
            case 4:
                   System.out.println("Ingrese el valor a convertir");
                pies = leer.nextInt();
                resultado = pies * 30.48;
                System.out.println("El resultado es: " + resultado + " pies");
                break;

        }
    }
}
