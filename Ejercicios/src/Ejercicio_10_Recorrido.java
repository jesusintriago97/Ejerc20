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

public class Ejercicio_10_Recorrido {public static void main(String[] args) {
        
    
        double kilometrosRecorridos;
        double precioGasolina;
        double dineroGasolina;
        double tiempo;
        double gasolina;
        double consumoA1;
        double consumoA2;
        double consumoB1;
        double consumoB2;
        double velocidad;
        double velocidadMetros;
        
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el total de kilometros recorridos:");
        kilometrosRecorridos = scanner.nextDouble();
        System.out.println("Cual es el precio de la gasolina por galón: "); 
        precioGasolina = scanner.nextDouble();
        System.out.println("Ingrese el dinero de gasolina gastado en el viaje: ");
        dineroGasolina = scanner.nextDouble();
        System.out.println("Ingrese el tiempo tardado en horas y minutos:  ");
        tiempo=scanner.nextDouble();
        
        
        gasolina = dineroGasolina/precioGasolina;
        consumoB1=gasolina/kilometrosRecorridos;
        consumoB2=dineroGasolina/kilometrosRecorridos;
        consumoA1=consumoB1*30;
        consumoA2=consumoB2*1;
        
        velocidad=kilometrosRecorridos/tiempo;
        velocidadMetros=(velocidad*1000)/3600;
        
       
        System.out.println("El consumo de gasolina por cada 30 kilometros es: "+String.format("%.2f", consumoA1)+" galon de gasolina y  "+String.format("%.2f", consumoA2)+"  dolares ");
        System.out.println("El consumo de gasolina por cada kilometros es : "+String.format("%.2f", consumoB1)+" galon de gasolina y  "+String.format("%.2f", consumoB2)+"  dolares ");
        System.out.println("La velocidad media en km/h es : "+String.format("%.2f", velocidad)+" km/h y en m/s es de: "+String.format("%.2f", velocidadMetros)+" m/s");
        
        
    }

}