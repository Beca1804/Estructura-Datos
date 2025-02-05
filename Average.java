/**
 * Autor: Rebeca Garcia Rodríguez
 * Matrícula: 14457
 * Fecha: 31-Enero-2025
 */

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
