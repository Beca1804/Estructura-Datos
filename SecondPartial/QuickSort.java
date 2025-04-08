package SecondPartial;
public class QuickSort {
        // Variables estáticas para contar comparaciones e intercambios
        static int comparaciones = 0;
        static int intercambios = 0;
    
        // Método para intercambiar dos elementos en el arreglo
        public void swap(int[] arr, int i, int j) {
            int temp = arr[i]; // Guarda el valor en una variable temporal
            arr[i] = arr[j];   // Intercambia valores
            arr[j] = temp;
            intercambios++;     // Incrementa el contador de intercambios
        }
    
        // Método de partición utilizando el esquema de Lomuto
        public int partition(int[] a, int start, int end) {
            int pivot = a[end]; // Se elige el último elemento como pivote
            int pIndex = start; // Índice inicial de la partición
    
            // Se comparan los elementos con el pivote
            for (int i = start; i < end; i++) {
                comparaciones++; // Se cuenta la comparación
                if (a[i] <= pivot) { // Si el elemento es menor o igual al pivote
                    swap(a, i, pIndex); // Intercambiar con el índice de partición
                    pIndex++; // Mover el índice de partición a la derecha
                }
            }
    
            // Se intercambia el pivote con el elemento en pIndex para colocarlo en su posición final
            swap(a, end, pIndex);
            return pIndex; // Se devuelve la posición final del pivote
        }
    
        // Método recursivo para aplicar QuickSort
        public void quicksort(int[] a, int start, int end) {
            if (start >= end) { // Caso base: Si el subarreglo tiene un solo elemento o está vacío
                return;
            }
    
            // Particionar el arreglo y obtener la posición del pivote
            int pivot = partition(a, start, end);
    
            // Ordenar recursivamente los elementos menores que el pivote
            quicksort(a, start, pivot - 1);
    
            // Ordenar recursivamente los elementos mayores que el pivote
            quicksort(a, pivot + 1, end);
        }
    
        // Implementación del algoritmo QuickSort
        public static void main(String[] args) {
            int[] a = {9, -3, 5, 2, 6, 8, -6, 1, 3}; // Arreglo de prueba
            QuickSort qs = new QuickSort(); // Crear una instancia de la clase QuickSort
            qs.quicksort(a, 0, a.length - 1); // Llamar al método quicksort para ordenar el arreglo
    
            // Imprimir los resultados
            System.out.println("Arreglo ordenado: " + java.util.Arrays.toString(a));
            System.out.println("Comparaciones: " + comparaciones);
            System.out.println("Intercambios: " + intercambios);
        }
    }
    
    

