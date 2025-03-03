package PARCIAL1;

 // Autor: Rebeca Garcia
 // Matrícula: 14457
 // Fecha: 29-Enero-2025
 

// Creamos nuestra clase
// Creamos nuestro metodo main
// Creamos un arreglo de nombres
// Creamos un ciclo for para que corra el arreglo
// Imprimimos el arreglo
// Imprimimos el total de nombres

 public class StudentsList {
    public static void main(String[] args) {
        
        String[] nombres = {"Rebeca", "Argel", "Leslie", "Jorge", "Rodrigo", "Carlo", "Cesar", "Oscar", "Justin", "Avitia" , "Camila","Christian", "Mario", "Nevarez"}; 

        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }
        System.out.println("Total Names " + nombres.length);
    }
}
