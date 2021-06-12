

/*
Programa que permita el ingreso de dos valores numéricos: El primero representa el MES (validar) y el segundo
el DÍA del mes (validar el DÍA en base al Mes ingresado. Asuma que se trata de un año No Bisiesto). Muestre a
que “día del año” corresponde la fecha ingresada. Ejemplos:
Fecha: Enero 25 Corresponde al “día del año” 25
Fecha: Febrero 9 Corresponde al “día del año” 40
Fecha: Marzo 1 Corresponde al “día del año” 59
Fecha: Diciembre 25 Corresponde al “día del año” 359
 * @author jesus
 */


import java.time.LocalDate;
import java.util.Scanner;



public class Ejercicio_15 {
    public static void main(String[] args) {
                
        while (true) {  
                  try
         {
            Scanner input=new Scanner(System.in);
            int num;
            int mes;
            System.out.println("ingrese un numero del 1 al 365");
            num=input.nextInt();
            
                if(num<1||num>365){
                System.out.println("numero fuera del año");
                }else{
                    
                    if(num>=1&&num<=31){
                            System.out.println("Corresponde al mes de Enero:" +num);


                        }else if(num<=59){
                            System.out.println("corresponde al mes defebrero:" +(num-31));
                        }else if(num<=90){
                            System.out.println("corresponde al mes de Marzo:" +(num-59));
                        }else if(num<=120){
                            System.out.println("corresponde al mes de Abril:" +(num-90));
                        }else if(num<=151){
                            System.out.println("Corresponde al mes de Mayo :" +(num-120));
                        }else if(num<=181){
                            System.out.println("Corresponde al mes de Junio: "+(num-151) );
                        } else if(num<=212){
                            System.out.println("Corresponde al mes de Julio: " +(num-181));
                        }else if(num<=243){
                            System.out.println("Corresponde al mes de Agosto: "+(num-212));
                        }else if(num<=273){
                            System.out.println("Corresponde al mes de Septiembre: " +(num-243));
                        }else if(num<=304){
                            System.out.println("Corresponde al mes de Octubre: " +(num-273));
                        }else if(num<=334){
                            System.out.println("correspondeal mes de Noviembre: "+(num-304));
                        }else if(num<=365){
                            System.out.println("Corresponde al mes de Diciembre: "+(num-334));
                        }
                        break;           
                     } 
                
                }             
            catch(Exception excepcionE)
         {
	         System.out.println("Error no es un numero");

         } 
         }
     
    }
}