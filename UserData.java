/**
 * Autor: Rebeca Garcia
 * Matrícula: 14457
 * Fecha: 8-Febrero-2025
 */

//Crear una nueva clase llamada UserData.java
//Dentro de esta clase, definir un método llamado fullName.
//La función debe recibir como parámetros:
//String firstName (nombre).
//String lastName (apellido).
//La función debe retornar un String con el nombre completo usando interpolación.
//Implementación en la clase principal
//Crear una instancia de la clase UserData.
//Llamar a la función fullName y pasarle los parámetros correspondientes.
//Imprimir el resultado en la consola.



public class UserData {

    public  String fullName(String firstName, String lastName) {
        return String.format("El nombre completo es: %s %s", firstName, lastName);

        //return firstName + " " + lastName; Concatencacion
    }

}