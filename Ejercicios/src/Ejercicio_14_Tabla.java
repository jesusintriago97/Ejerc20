


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

public class Ejercicio_14_Tabla {
    public static void main(String[] args) {
        
        while (true) {  
                  try
         {
            int i;
            Scanner input=new Scanner(System.in);
            //ingresar numeros
            System.out.println("ingrese un numero");
            int x = input.nextInt();
            System.out.println("ingrese un numero inicial");
            int ini = input.nextInt();
            System.out.println("ingrese un numero final");
            int fin = input.nextInt();

            if(fin<0){
            for(i=ini; i>=fin; i--){
                System.out.println(""+i+"x" +x+"=" +(i*x));//resultado de la multiplicacion
            }    
            }else{
            for(i=ini; i<=fin; i++){
                System.out.println(""+i+"x" +x+"=" +(i*x));//resultado de multiplicacion
            }}break;
          }            
            catch(Exception excepcionE)
         {
	         System.out.println("Error no es un numero");

         } 
       
           } 
       
   } 
          } 
       