import java.util.Scanner;

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


       // StudentsGrades 
        StudentGrades objStudentsGrades = new StudentGrades();
        int partialGrade = objStudentsGrades.calculateFirstParcialGrade(85, 90);
        System.out.println("Calificacion del Parcial " + partialGrade);

        int result = objStudentsGrades.calculateFinalGrade(80, 75, 90, 85);
        System.out.println("La calificacion del semestre es " + result);

        String resultFinal = objStudentsGrades.checkFailureByAbsences(64, 60);
        System.out.println(resultFinal);
        


        // TrianguleArea 
        //Scanner objScanner = new Scanner(System.in);

        //System.out.print("Ingrese la base del triangulo: ");
        //double base = objScanner.nextDouble();

        //System.out.print("Ingrese la altura del triangulo: ");
        //double height = objScanner.nextDouble();

        //TrianguleArea objTrianguleArea = new TrianguleArea();
        //double area = objTrianguleArea.calculateArea(base, height);

        //System.out.println("El area del triangulo es: " + area, "y altura" + height);

        //System.out.printf("El area del triangulo es: %.4f y altura %.4f es", base, height, area);
        //objScanner.close();



        //CircleArea

        //Scanner objScanner = new Scanner(System.in);

        //System.out.print("Ingrese el radio del circulo: ");
        //double radio = objScanner.nextDouble();


        //CircleArea objCircleArea = new CircleArea();
        //double area = objCircleArea.calculateArea(radio);

        //System.out.printf("El area del Circulo es: %.2f ", area);
        //objScanner.close();


    

        //MultidimensionalArrays
        MultidimensionalArrays objMultidimensionalArrays = new MultidimensionalArrays();
        objMultidimensionalArrays.printbidemensionalArray();




    }
}
