/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jesus
 */

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Stack;

public class Ejercicio_18_Dados {public static  void main (String[] args){
       
        int dad1 , dad2, resulDado;
        Scanner leer = new Scanner(System.in);
        System.out.println("ingreesar el valor del primer dado ");
        dad1 = leer.nextInt();
        System.out.println("ingresar el  valor del segundo dado ");
        dad2 = leer.nextInt();
        resulDado = dad1 + dad2;

        if (dad1 >= 1 && dad2 <= 6){
            for (int contador = 1; contador < resulDado ; contador++){
                for (int contadorB = resulDado ; contadorB >= 1 ; contadorB -- ){
                
                    if ((contadorB + contador) == resulDado){
                        System.out.printf("" + contador + " + " + contadorB + " = " + resulDado + "%n"  );
                    }
                }
            }
        }

    }
}