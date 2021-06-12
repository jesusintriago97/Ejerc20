/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jesus
 */
public class Ejercicio_13_Numero { static boolean validar (int n )
    
    {
        int suma=0;
        for (int i=1; i < n; i++){
        if(n%i==0)
            suma= suma+i;
        }
        if(suma == n)
            return true;
        return false;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        System.out.println("Escriba un numero");  
        int numero = new java.util.Scanner(System.in).nextInt();
        if(validar(numero)==true)
            System.out.println("Este es un numero perfecto");
            else
                System.out.println("Este es un numero primo");
    }
    
}
