package FirstParcial;
public class MultidimensionalArrays {

      public void printbidemensionalArray() {
    //Forma de inicializar un arreglo bidimensional o matriz
    int[] [] matrix = {
        {1, 2, }, // [0][0], = 1 [0][1]= 2
        {3, 4, }, // [1][0], = 3 [1][1] = 4
       
    };

    //Recorrer la matriz
    for (int i = 0; i < matrix.length; i++) {
        System.out.println("Longitud de la fila " + matrix[i].length);
        for (int j = 0; j < matrix[i].length; j++) {
            System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
    }
}
} 