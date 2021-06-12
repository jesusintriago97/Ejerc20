/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jesus
 */

import java.util.Scanner;
import java.util.Stack;

public class Ejercicio_12 {
    public static void main (String[] args){
       
        int limite_Num, suma = 0;
        boolean verificarImpar;
        Stack<Integer> impar = new Stack<>();

        Scanner leer = new Scanner(System.in);
        System.out.println("ingresar numero limite");
        limite_Num = leer.nextInt();

        System.out.print("multiplos de 5:");
        for (int a= 5; a < limite_Num; a = a + 5){
            System.out.print(" " + a);
           
            verificarImpar = (a%2 != 0)? true : false;
            if (verificarImpar)
                impar.push(a);
        }
        System.out.printf("%n" + "numeros impares:");
        for (int valor: impar) {
            
            suma += valor;
            System.out.print(" " + valor);
        }
        System.out.printf( "%n" + "suma total de los impares :  " + suma    );
    }
}
    

