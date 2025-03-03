package PARCIAL1;
/**
 * Autor: Rebeca Garcia Rodríguez
 * Matrícula: 14457
 * Fecha: 31-Enero-2025
 */

 // puse una clase publica para que se pueda acceder desde cualquier clase
 // luego un metodo publico para que se pueda acceder desde cualquier clase
 // cree un arreglo de enteros con las calificaciones de los estudiantes
 // cree una variable para guardar la suma de las calificaciones
// cree un ciclo for para recorrer el arreglo de calificaciones
// imprimi las calificaciones
// sume las calificaciones
// calcule el promedio de las calificaciones

class Average {
    public  void pop() {
        int [] grades  = {70, 80, 90};
 
        int students = 0;

       for (int i = 0; i < grades.length; i++) {
            System.out.println(grades[i]);
            students += grades[i];

        }

        int total = students / grades.length;

        System.out.println("average: " + total);
    }
}
