
/*
Crear un programa que permita calcular el “Dígito Autoverificador” de una cédula de identidad. Considere que
al programa se debe ingresar de forma individual nueve (9) dígitos, los mismos que deben ser positivos/enteros
entre 0 y 9 (ambos inclusive). Investigue el algoritmo de “módulo 10”. 
 * @author jesus
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Ejercicio_20 {
    public static void main(String[] args) throws Exception {
        entradaCedula();
    }

    // Metodo de entrada del numero de cedula
    public static void entradaCedula() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite un numero de cedula (9 digitos): ");
        String numCedula = scanner.nextLine();
        validarCedula(numCedula);
        scanner.close();
    }

  
    public static void validarCedula(String numCedula) {
        if (!numCedula.isEmpty()) { 
            if (esCedula(numCedula)) {
                mostrarResultado(digitoAutoverificador(numCedula));
            } else {
                System.out.println("Numero de cedula incorrecto!\n");
                entradaCedula();
            }
        } else {
            System.out.println("Ingrese nuevamente!\n");
            entradaCedula();
        }
    }

    
    public static boolean esCedula(String numCedula) {
        Pattern cedulaPattern = Pattern.compile("^[0-9]{9}+$");
        Matcher cedulaMatcher = cedulaPattern.matcher(numCedula);
        return cedulaMatcher.find();
    }

    
    public static int digitoAutoverificador(String numCedula) {
        int suma = 0;
        boolean alternar = true;
        for (int i = numCedula.length() - 1; i >= 0; i--) {
            int digito = Integer.parseInt(numCedula.substring(i, i + 1));
            if (alternar) {
                digito *= 2;
                if (digito > 9) {
                    digito = (digito % 10) + 1;
                }
            }
            suma += digito;
            alternar = !alternar;
        }
        int sobrante = suma % 10;
        if (sobrante == 0) {
            return 0;
        }
        return 10 - sobrante;
    }

  
    public static void mostrarResultado(int digitoAutoverificador) {
        
        System.out.println("El digito Autoverificador es: " + digitoAutoverificador);
    }
    
}
