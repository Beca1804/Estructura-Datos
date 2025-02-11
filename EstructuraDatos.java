/**
 * Autor: Rebeca Garcia
 * Matrícula: 14457
 * Fecha: 30-Enero-2025
 */

 //lol es un metodo que imprime un mensaje y pop es un metodo que imprime un mensaje que se encuentra en otra clase
public class EstructuraDatos {
    public static void main(String[] args) {
        NewGame newGame = new NewGame();
        newGame.lol();

        Average average1 = new Average();
        average1.pop();

        UserData userData = new UserData();

        // Se declara la variable fullName y se le asigna el valor que retorna el método fullName
        // Se le pasa como parametro el nombre y apellido
        String fullName = userData.fullName("Rebeca", "Garcia");
        System.out.println(fullName);

        
        StudentGrades objStudentsGrades = new StudentGrades();
        int partialGrade = objStudentsGrades.calculateFirstParcialGrade(85, 90);
        System.out.println("Calificacion del Parcial " + partialGrade);

        int result = objStudentsGrades.calculateFinalGrade(80, 75, 90, 85);
        System.out.println("La calificacion del semestre es " + result);

        String resultFinal = objStudentsGrades.checkFailureByAbsences(64, 60);
        System.out.println(resultFinal);
    }
}
