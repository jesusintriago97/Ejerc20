import java.util.Scanner;

/*
Escriba un programa que permita calcular la hipotenusa de un triángulo rectángulo conocidas las longitudes de
sus dos catetos.
@author jesus
 */
public class Ejercicio_1_Hipo {

public static void main(String[]args){
        
    double cate_1, cate_2;
    Scanner sc=new Scanner(System.in);
        System.out.print("introduce el valor del primer cateto  ");
        cate_1=sc.nextDouble();
        System.out.print("introduce el valor del segundo cateto ");
        cate_2=sc.nextDouble();
        
        System.out.print("El valor de la hipotenusa es  "+Math.sqrt(Math.pow(cate_1, 2)+ Math.pow(cate_2, 2)));
        
    }
}
