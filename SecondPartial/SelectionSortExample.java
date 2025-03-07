package SecondPartial;
/**
 * Autor: Rebeca Garcia Rodríguez
 * Matrícula: 14457
 * Fecha: 04-Marzo-2025
 */


//Creo la clase SelectionSortExample, es clase publica
// Se declara un metodo de tipo entero llamado selectionSort
// Se le pasa un array de enteros como parametro
// Se crea la variable n donde se recorre el tamano del array
// Se inicializa un contador comparisons en cero
// Se recorre el array desde su primera posicion hasta la penultima
// Se inicializa una variable minIndex con el valor de i
// Se recorre el array no ordenado desde su primera posicion hasta la penultima
// Se incrementa el contador comparisons
// Se compara si el elemento actual es menor al siguiente
// Si es verdadero se asigna el valor de j en minIndex
// Intercambio de elementos
// Se asigna el valor de arr[i] en temp
// Se asigna el valor de arr[minIndex] en arr[i]
// Se asigna el valor de temp en arr[minIndex]
// Se retorna el total de comparaciones


public class SelectionSortExample {
    public static int selectionSort(int arr[]) {
        int n = arr.length;
        int comparisons = 0;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                comparisons++;
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Intercambio de los elementos
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return comparisons; // me  devuelve el total de comparaciones
    }
}

/**
 -Selection Sort BIG O notation
 Este algoritmo siempre hace O(n²) comparaciones, 
 incluso si el arreglo ya está ordenado. 
 No importa cómo esté el arreglo, siempre va a 
 recorrer todo el 
 subarreglo restante para buscar el mínimo.
 */