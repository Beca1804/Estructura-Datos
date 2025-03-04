package FirstParcial;
/**
 * Autor: Rebeca Garcia Rodríguez
 * Matrícula: 14457
 * Fecha: 24-Febrero-2025
 */


// GradeCalculationPartial
// Clase que calcula la calificación parcial de un estudiante
// Se calcula la calificación parcial de un estudiante con base en su calificación de examen y tareas   
// Se calcula la calificación final de un estudiante con base en su calificación de examen y tareas

import java.util.Scanner;

public class GradeCalculationPartial {
  public double calculateParcialGrade(int examScore, int homeworkScore) {
    Scanner num = new Scanner(System.in);
    //crea el objeto num de la clase Scanner
    System.out.println("Ponga su calificacion del examen: ");
    double gradeexam1 = num.nextDouble();
    // pone el mensaje y lee el num decimal, y lo guarda en gradeexam1
    System.out.println("Ponga su calificacion de tareas: ");
    double gradetask = num.nextDouble();
    //vuelve a imprimir un mensaje, lee el decimal y lo guarda en gradetask
    double finalgrade = ((gradeexam1 * 0.7) + (gradetask * 0.3));
    System.out.println("Tu Calificacion final es: " + finalgrade);
    //imprime el mensaje y el resultado de la operacion
    num.close();
    return finalgrade; //devuelve la calificacion final
  }
}

