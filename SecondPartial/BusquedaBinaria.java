package SecondPartial;

public class BusquedaBinaria {
    public static int buscar(int[] arreglo, int objetivo) {
        int izquierda = 0, derecha = arreglo.length - 1;
        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;
            if (arreglo[medio] == objetivo) {
                return medio; // Elemento encontrado
            }
            if (arreglo[medio] < objetivo) {
                izquierda = medio + 1;
            } else {
                derecha = medio - 1;
            }
        }
        return -1; // Elemento no encontrado
    }
    public static void main(String[] args) {
        int[] datos = {10, 20, 30, 40, 50};
        int resultado = buscar(datos, 30);
        System.out.println("El número 30 está en la posición: " + resultado);
    }
}
    
