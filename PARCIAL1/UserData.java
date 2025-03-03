package PARCIAL1;
/**
 * Autor: Rebeca Garcia
 * Matrícula: 14457
 * Fecha: 8-Febrero-2025
 */


// ponemos la clase publica para que se pueda acceder desde cualquier clase
// luego creamos un metodo publico para que se pueda acceder desde cualquier clase
// creamos una variable de tipo string para guardar el nombre completo
// retornamos el nombre completo con interpolacion (profe)



public class UserData {

    public  String fullName(String firstName, String lastName) {
        return String.format("El nombre completo es: %s %s", firstName, lastName);

        //return firstName + " " + lastName; Concatencacion
    }

}