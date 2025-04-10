package ThirdParcial;
/**
 * Author: Rebeca Garcia Rodríguez
 * Student ID: 14457
 * Date: April 8th, 2025
 */
 
// Clase Nodo que representa cada elemento con enlaces al anterior y al siguiente
// Puntero a la cabeza de la lista doblemente enlazada circular
// Inserta un nuevo nodo al final de la lista
// Muestra todos los nodos desde la cabeza hasta la cola (hacia adelante)
// Muestra todos los nodos desde la cola hasta la cabeza (hacia atrás)
// Busca si un valor existe en la lista
// Elimina un nodo con un valor específico
// Método main para probar insertar, mostrar, buscar y eliminar


public class DoublyLinkedList {

    
    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int value) {
            data = value;
            next = prev = null;
        }
    }

    Node head = null;

   
    public void insert(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            head.next = head;
            head.prev = head;
        } else {
            Node tail = head.prev;

            tail.next = newNode;
            newNode.prev = tail;
            newNode.next = head;
            head.prev = newNode;
        }
    }

   
    public void displayForward() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        do {
            System.out.print(current.data + " <-> ");
            current = current.next;
        } while (current != head);
        System.out.println("(start)");
    }

    
    public void displayBackward() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node tail = head.prev;
        Node current = tail;
        do {
            System.out.print(current.data + " <-> ");
            current = current.prev;
        } while (current != tail);
        System.out.println("(end)");
    }

    
    public boolean search(int value) {
        if (head == null) return false;
        Node current = head;
        do {
            if (current.data == value) return true;
            current = current.next;
        } while (current != head);
        return false;
    }

    
    public void delete(int value) {
        if (head == null) return;

        Node current = head;

        do {
            if (current.data == value) {
                if (current.next == current) { // only one node
                    head = null;
                } else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                    if (current == head) {
                        head = current.next;
                    }
                }
                return;
            }
            current = current.next;
        } while (current != head);
    }

   
    }

