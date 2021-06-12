
/*
El colegio ABC mundo ha instaurado un nuevo reglamento de evaluaciones. Todas las asignaturas deben tener
tres certámenes y un examen. Las notas van entre 0 y 10, con un decimal.

 * @author jesus
 */

import java.util.Scanner;

public class Ejercicio_9 {public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        float   nota1, nota2, nota3, nota4;
 
        while (true) {
         
            System.out.println("Ingrese la calificacion de la nota 1: ");
            nota1 = lector.nextFloat();
            System.out.printf("Ingrese la calificacion de la nota 2: ");
            nota2 = lector.nextFloat();

            if (nota1 > 0 && nota1 <= 10 && nota2 > 0 && nota2 <= 10) {
               if (nota1 < 2 && nota2 < 2) {
                    System.out.println("Estudiante Reprobado por notas ");
                    break;
                }      if (nota1 > 9 && nota2 > 9) {
                    System.out.println("Estudiante Aprobado por notas");
                    break;
                } 
                    System.out.println("Ingrese la calificacion de la nota 3: ");
                    nota3 = lector.nextFloat();
                    System.out.println("Ingrese la calificacion del examen: ");
                    nota4 = lector.nextFloat();
                    if (nota3 > 0 && nota3 <= 10 && nota4 > 0 && nota4 <= 10) {
                        float total = (nota1 + nota2 + nota3 + nota4) / 4;
                        System.out.println("El promedio es:  " + total);
                        break;
                    } else {
                        System.out.println("La nota debe estar entre  0 y 10 con 1 decimal");
                }

            } else {
                System.out.println("La nota debe estar entre  0 y 10 con 1 decimal");

            }

        }

    }
}
