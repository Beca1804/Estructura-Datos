/**
 * Autor: Rebeca Garcia
 * Matrícula: 14457
 * Fecha: 30-Enero-2025
 */

public class EstructuraDatos {
    public static void main (String[] args) {
        NewGame newGame = new NewGame();
        newGame.lol();

        Average average1 = new Average();
        average1.pop();

        UserData userData = new UserData();

        // Se declara la variable fullName y se le asigna el valor que retorna el método fullName
        //Se le pasa como parametro el nombre y apellido
        
        String fullName = userData.fullName("Rebeca", "Garcia");
        System.out.println(fullName);
        
        
    }
    }

