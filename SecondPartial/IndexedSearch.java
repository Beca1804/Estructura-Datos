package SecondPartial;

public class IndexedSearch {
    public static void main(String[] args) {
        int[] datos = {10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80}; 
        int[] indices = {0, 4, 8, 12}; // Índices auxiliares // son los numeros que da la raiz cuadrada de la longitud del arreglo
        int buscar = 45;
        
        int comparaciones = 0;
        int bloque = -1;
        
        // Búsqueda en el índice
        for (int i = 0; i < indices.length - 1; i++) {
            comparaciones++;
            if (datos[indices[i]] <= buscar && datos[indices[i + 1]] >= buscar) {
                bloque = i;
                break;
            }
        }
        
        if (bloque == -1) {
            System.out.println("Elemento no encontrado.");
            System.out.println("Comparaciones realizadas: " + comparaciones);
            return;
        }
        
        // Búsqueda secuencial dentro del bloque identificado
        for (int i = indices[bloque]; i <= indices[bloque + 1]; i++) {
            comparaciones++;
            if (datos[i] == buscar) {
                System.out.println("Elemento encontrado en la posición: " + i);
                System.out.println("Comparaciones realizadas: " + comparaciones);
                return;
            }
        }
        
        System.out.println("Elemento no encontrado.");
        System.out.println("Comparaciones realizadas: " + comparaciones);
    }
}