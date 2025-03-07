package SecondPartial;
/**
 * Autor: Rebeca Garcia Rodríguez
 * Matrícula: 14457
 * Fecha: 06-Marzo-2025
 */

 public class SecondParcialMain {
     public static void main(String args[]) {
         int peorCaso[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1}; //creo un arreglo de enteros llamado peorCaso
 
         //Insertion Sort
         System.out.println("Peor Caso");
         int operacionesPeor = InsertionSortExample.insertionSort(peorCaso); //llamo al metodo insertionSort de la clase InsertionSortExample 
         for (int num : peorCaso) {
             System.out.print(num + " ");
         }
         System.out.println("\nOperaciones realizadas: " + operacionesPeor);
 
         //Selection Sort
         System.out.println("Peor Caso");
         int worstComparisons = SelectionSortExample.selectionSort(peorCaso); // Llamo al metodo selectionSort de la clase SelectionSortExample 
         for (int num : peorCaso) {
            System.out.print(num + " ");
        }
         System.out.println("\nTotal de comparaciones: " + worstComparisons);
 
         //Bubble Sort
         System.out.println("Peor Caso ");
         int bubbleWorstComparisons = BubbleSortExample.bubbleSort(peorCaso); //vuelvo a llamar al metodo bubbleSort de la clase BubbleSortExample
         for (int num : peorCaso) {
            System.out.print(num + " ");
        }
         System.out.println("\nTotal de Comparaciones " + bubbleWorstComparisons);
 
     }
 }
 