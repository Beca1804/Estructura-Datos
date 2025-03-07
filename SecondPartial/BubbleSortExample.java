package SecondPartial;
/**
 * Autor: Rebeca Garcia Rodríguez
 * Matrícula: 14457
 * Fecha: 06-Marzo-2025
 */

    //Creo la clase BubbleSortExample, es clase publica
    // se declara un metodo de tipo entero llamado bubbleSort
    // se le pasa un array de enteros como parametro
    // se crea la variable n donde se recorre el tamano del array
    // se inicializa un contador comparisons en cero
    // se recorre el array desde su primera posicion hasta la penultima
    // se recorre el array no ordenado desde su primera posicion hasta la penultima - i
    // se incrementa el contador comparisons
    // se compara si el elemento actual es mayor al siguiente
    // si es verdadero se intercambian los elementos
    // se retorna el numero de comparaciones realizadas



public class BubbleSortExample {
    public static int bubbleSort(int[] arr) {
        int n = arr.length;
        int comparisons = 0; // cuenta mis comparaciones
       for (int i = 0; i < n - 1; i++) {
            
            for (int j = 0; j < n - 1 - i; j++) {
               comparisons++;
               
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j]; // Intercambio de elementos
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            } 
        }
        return comparisons;
    }
}

/**
 -Bubble Sort BIG O notation
 Si el arreglo está completamente desordenado, 
 Bubble Sort tiene que hacer muchas 
 comparaciones e intercambios. Por eso es O(n²).
 Este es el más sencillo pero no es muy eficiente. 

 */
