/**
 * Autor: Rebeca Garcia
 * Matrícula: 14457
 * Fecha: 05-Feb-2025
 */



 // primero importamos la clase Random
 // creamos un arreglo de opciones
 // creamos un objeto de la clase Random
 // creamos un ciclo for para que corra el arreglo
 // creamos una variable que genere un numero aleatorio
 // imprimimos el arreglo
 // Que es el bound?  Es el numero de opciones que tenemos en el arreglo 
// Que es el nextInt? Es el metodo que nos regresa un numero aleatorio 

import java.util.Random;

public class NewGame {
    public  void lol() {
        String[] opciones = {"Rock", "Paper", "Scissors"};
        Random pop = new Random();

        for (int i = 0; i < 1; i++) { 
            int numeroAleatorio = pop.nextInt(3);
            System.out.println(opciones[numeroAleatorio]); 
        }
    }
}
