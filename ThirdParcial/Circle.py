#Autor: Rebeca Garcia Rodríguez
#Matrícula: 14457
#Fecha: 19-Mayo-2025

  # Esta clase representa un nodo de la lista
class Node:
    def __init__(self, data):
        self.data = data        # Acá guardo el valor que quiero meter en el nodo
        self.next = None        # Y este va a apuntar al siguiente nodo (por ahora, a nada)

# Esta es la clase de la lista circular enlazada
class CircularLinkedList:
    def __init__(self):
        self.last = None        # Guardo solo el último nodo, porque desde ahí puedo recorrer todo el círculo

    # Método para agregar un nuevo nodo a la lista
    def add(self, data):
        new_node = Node(data)   # Creo un nuevo nodo con el dato que me pasaron

        if self.last is None:
            # Si la lista está vacía, este va a ser el único nodo,
            # así que apunto al mismo (cierra el círculo solo)
            self.last = new_node
            self.last.next = self.last
        else:
            # Si ya hay nodos:
            # El nuevo nodo va a apuntar al primero (que es last.next)
            new_node.next = self.last.next
            # El último nodo actual ahora apunta al nuevo nodo
            self.last.next = new_node
            # Y como agregamos al final, actualizo el 'last' para que apunte al nuevo
            self.last = new_node

    # Método para mostrar los elementos de la lista
    def display(self):
        if self.last is None:
            print("La lista está vacía.")
            return

        current = self.last.next  # Empiezo desde el primero (el que sigue del último)
        while True:
            print(current.data, end=" -> ")  # Imprimo el valor del nodo
            current = current.next           # Me muevo al siguiente
            if current == self.last.next:    # Si volví al primero, ya recorrí todo el círculo
                break

lista = CircularLinkedList()
lista.add(10)
lista.add(20)
lista.add(30)
lista.display()
