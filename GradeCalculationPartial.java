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
       
        System.out.println("Ponga su calificacion del examen: ");
        double gradeexam1 = num.nextDouble();
        System.out.println("Ponga su calificacion de tareas: ");
        double gradetask = num.nextDouble();
        double finalgrade = ((gradeexam1 * 0.7) + (gradetask * 0.3));
        System.out.println("Tu Calificacion final es: " + finalgrade);
        return (double) finalgrade;
    }
}
