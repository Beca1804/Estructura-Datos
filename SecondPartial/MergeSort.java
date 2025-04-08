package SecondPartial;
public class MergeSort {
        public int operationCount = 0;
        public void mergeSort(int[] arr, int left, int right) {
            //int[] array = {38, 27, 43, 10}; // Arreglo a ordenar
            
            if (left < right) {
                System.out.println(right); // 3
                int mid = left + (right - left) / 2;
                System.out.println("mid " + mid); // 1
                //operationCount++; // Contar la división del arreglo
    
                mergeSort(arr, left, mid);  // Ordenar la primera mitad
                mergeSort(arr, mid + 1, right);  // Ordenar la segunda mitad
    
                merge(arr, left, mid, right);  // Combinar las mitades
            }
            System.out.println("Cantidad total de operaciones realizadas: " + operationCount);
        }
    
        // Función para fusionar dos subarreglos ordenados
        public void merge(int[] arr, int left, int mid, int right) {
            int n1 = mid - left + 1;
            int n2 = right - mid;
    
            int[] leftArray = new int[n1];
            int[] rightArray = new int[n2];
    
            // Copiamos los datos en arreglos temporales
            for (int i = 0; i < n1; i++) {
                leftArray[i] = arr[left + i];
                operationCount++; // Contar copia de elementos
            }
            for (int j = 0; j < n2; j++) {
                rightArray[j] = arr[mid + 1 + j];
                //operationCount++;
            }
    
            // Fusionamos las dos mitades ordenadas
            int i = 0, j = 0, k = left;
            while (i < n1 && j < n2) {
                //operationCount++; // Contar comparación en el merge
                if (leftArray[i] <= rightArray[j]) {
                    arr[k] = leftArray[i];
                    i++;
                } else {
                    arr[k] = rightArray[j];
                    j++;
                }
                k++;
                //operationCount++; // Contar asignación en el merge
            }
    
            // Copiar los elementos restantes de leftArray[], si hay alguno
            while (i < n1) {
                arr[k] = leftArray[i];
                i++;
                k++;
                //operationCount++; // Contar asignaciones restantes
            }
    
            // Copiar los elementos restantes de rightArray[], si hay alguno
            while (j < n2) {
                arr[k] = rightArray[j];
                j++;
                k++;
                //operationCount++;
            }
            operationCount++;
      
            //System.out.println("Arreglo ordenado: " + Arrays.toString(arr));
            
        }
        
    }
    
