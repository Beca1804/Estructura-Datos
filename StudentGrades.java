/**
 * Autor: Rebeca Garcia
 * Matrícula: 14457
 * Fecha: 11-Febrero-2025
 */

// Guardamos la clase en un paquete
// Creammos la clase StudentGrades
// Creamos el metodo calculateFirstParcialGrade
// Creamos una variable double para guardar la calificacion del primer parcial
// Retornamos la calificacion del primer parcial
// Creamos el metodo calculateFinalGrade, con los parametros de las calificaciones de los parciales y el final
// Creamos una variable double para guardar la calificacion final
// Retornamos la calificacion final
// Creamos el metodo checkFailureByAbsences, con los parametros de las horas totales y las faltas
// Creamos una variable double para guardar el porcentaje de faltas
// Creamos un if para verificar si el porcentaje de faltas es menor a 10
// Retornamos un mensaje si cumple con las asistencias minimas
// Retornamos un mensaje si no cumple con las asistencias minimas


public class StudentGrades {
    public int calculateFirstParcialGrade(int examScore, int homeworkScore) {
        double firstParcialGrade = (examScore * 0.7) + (homeworkScore * 0.3);
        return (int) firstParcialGrade;
    }

    public int calculateFinalGrade(int firstParcial, int secondParcial, int thirdParcial, int finalParcial) {
        double finalGrade = (((firstParcial + secondParcial + thirdParcial) / 3) * 0.5) + (finalParcial * 0.5);
        return (int) finalGrade;
    }

    public String checkFailureByAbsences(int totalHours, int absences) {
        double absencesPercentage = (((double)absences / (double) totalHours) * 100);
        if (absencesPercentage < 10) {
            return "Alumno cumple con las asistencias mínimas";
        } else {
            return "Alumno no cumple con las asistencias mínimas";
        }
    }
}
