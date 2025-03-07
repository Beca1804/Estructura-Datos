package SecondPartial;
/**
  Autor: Rebeca Garcia Rodríguez
 * Matrícula: 14457
 * Fecha: 04-Marzo-2025
 */

//Creo la clase InsertionSort, es clase publica
// se declara un array de enteros
// se declara un metodo de tipo entero llamado insertionSort
// se le pasa un array de enteros como parametro
// se crea la variable n donde se recorre el tamano del array
// se inicializa un contador operaciones en cero
// se recorre el array desde su primera posicion hasta la penultima
// se inicializa una variable key con el valor del elemento actual
// se inicializa una variable j con el valor de i - 1
// se recorre el array no ordenado desde su primera posicion hasta la penultima
// se incrementa el contador operaciones
// se compara si el elemento actual es mayor al siguiente
// si es verdadero se intercambian los elementos
// se decrementa el valor de j
// se incrementa el contador operaciones
// se asigna el valor de key en la posicion j + 1
// se retorna el numero de operaciones realizadas

public class InsertionSortExample {

    public static int insertionSort(int arr[]) {
        int n = arr.length; // mi longitud
        int operaciones = 0; // cuenta mis operaciones
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
                operaciones++;
            }
            arr[j + 1] = key;
        }
        return operaciones;
    }
}


/**
 -Insertion Sort BIG O notation
 Si el arreglo está en orden inverso (de mayor a menor), 
 el algoritmo tiene que comparar 
 y mover cada elemento hasta su lugar correcto, 
 lo que genera muchas comparaciones (n(n-1)/2*).
  Por eso es O(n²).
 
 */