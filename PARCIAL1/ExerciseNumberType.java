package PARCIAL1;
/**
 * Autor: Rebeca Garcia Rodríguez
 * Matrícula: 14457
 * Fecha: 18-Febrero-2025
 */




public class ExerciseNumberType {
// ponemos un arreglo de enteros con los numeros
    int[] numeros = {
        0, 2, 5, 8, 11, 14, 17, 20, 23, 26, 
        29, 32, 35, 38, 41, 44, 47, 50, 53, 56, 
        59, 62, 65, 68, 71, 74, 77, 80, 83, 86, 
        89, 92, 95, 98, 0, 3, 6, 9, 12, 15, 
        18, 21, 24, 27, 30, 33, 36, 39, 42, 45
    };
   
    public void calculateNumberType() {
        int even = 0;
        int odd = 0;
        int zero = 0;
// creamos un ciclo for para recorrer el arreglo de numeros  (lo hago con for)
        for (int number : numeros) {
            if (number == 0) {
                zero++;
            } else if (number % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Total de numeros pares " + even);
        System.out.println("Total de numeros impares " + odd);
        System.out.println("Total de ceros " + zero);
    }
}
