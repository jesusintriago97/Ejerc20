


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

public class Ejercicio_16 {
     public static void main (String[] args){
        int mesUsuario, diaUsuario;
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el numero del mes");
        mesUsuario = leer.nextInt();
        System.out.println("ingrese el numero del dia");
        diaUsuario = leer.nextInt();
        if (mesUsuario == 2){
            if (diaUsuario == 29) {
                System.out.println("es bisiesto este dia");
                validarMes(mesUsuario, 29, diaUsuario);
            }
        }else {
            System.out.println("no es bisiesto este dia");
            validarMes(mesUsuario, 28, diaUsuario);
        }
    }

    static  void validarMes(int mes,int diaBisiesto, int diaUsuario){
        
        int diasTotales = 0, navidad = 0;
      
        switch (mes){
            case 1:diasTotales=0;
                break;

            case 2:diasTotales=31;
                break;

            case 3:diasTotales=31+diaBisiesto;
                break;

            case 4:diasTotales=31+diaBisiesto+31;
                break;

            case 5:diasTotales=31+diaBisiesto+31+30;
                break;

            case 6:diasTotales=31+diaBisiesto+31+30+31;
                break;

            case 7:diasTotales=31+diaBisiesto+31+30+31+30;
                break;

            case 8:diasTotales=31+diaBisiesto+31+30+31+30+31;
                break;

            case 9:diasTotales=31+diaBisiesto+31+30+31+30+31+31;
                break;

            case 10:diasTotales=31+diaBisiesto+31+30+31+30+31+31+30;
                break;

            case 11:diasTotales=31+diaBisiesto+31+30+31+30+31+31+30+31;
                break;

            case 12:diasTotales=31+diaBisiesto+31+30+31+30+31+31+30+31+30;
                break;
        }

  
        navidad = ((331 + diaBisiesto) - (diaUsuario + diasTotales));
        System.out.println("Para navidad faltan  " + navidad + " dia");
    }

}