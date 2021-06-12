
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jesus
 */
public class Ejercicio_17_Viajero {
    public static void main(String[] args){
        // TODO: 10/6/2021 definir la cantidad de tramos, minutos 
        Integer cantidadTramos;
        int minutos_Tramo, cantidad_Minutos = 0;
        Integer[] tramos;
        System.out.println("Por favor ingrese cantidad de tramos");
        Scanner scanner = new Scanner(System.in);
        cantidadTramos = scanner.nextInt();
        tramos = new Integer[cantidadTramos];
        for (int contador= 0; contador < tramos.length ; contador++){
            // TODO: 10/6/2021 ingresar los resultados de los tramos 
            System.out.println("Por favor ingrese los minutos recorridos en el tramo " + (contador + 1));
            minutos_Tramo = scanner.nextInt();
           tramos[contador] = minutos_Tramo;
        }
        for (Integer minuto: tramos) {
            // TODO: 10/6/2021 sumar los minutos de los tramos 
            cantidad_Minutos += minuto;
        }
        // TODO: 10/6/2021 presentar las horas y minutos
        System.out.println(cantidad_Minutos / 60 + "horas con " + cantidad_Minutos % 60 + " minutos");
    }
    
}
