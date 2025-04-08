package SecondPartial;

public class BusquedaSequencial {
        public static int buscar(int[] arreglo, int objetivo) {
            for (int i = 0; i < arreglo.length; i++) {
                if (arreglo[i] == objetivo) {
                    return i; // Retorna la posición del elemento encontrado
                }
            }
            return -1; // Retorna -1 si el elemento no está en el arreglo
        }
        public static void main(String[] args) {
            int[] datos = {10, 20, 30, 40, 50};
            int resultado = buscar(datos, 30);
            System.out.println("El número 30 está en la posición: " + resultado);
        }
    }
    

