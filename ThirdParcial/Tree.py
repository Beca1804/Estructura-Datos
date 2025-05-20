#Autor: Rebeca Garcia Rodríguez
#Matrícula: 14457
#Fecha: 19-Mayo-2025


# Esta clase representa un nodo del árbol
class Node:
    def __init__(self, data):
        self.data = data         # Guardo el valor del nodo
        self.left = None         # Apunta al hijo izquierdo (menores)
        self.right = None        # Apunta al hijo derecho (mayores)

# Esta clase representa el árbol binario completo
class BinarySearchTree:
    def __init__(self):
        self.root = None         # Acá guardo la raíz del árbol, o sea, el primer nodo

    # Método para insertar un valor en el árbol
    def insert(self, data):
        if self.root is None:
            # Si el árbol está vacío, el nuevo nodo se convierte en la raíz
            self.root = Node(data)
        else:
            # Si ya hay raíz, llamo a una función recursiva para buscar dónde ponerlo
            self._insert_recursive(self.root, data)

    # Esta función es la que realmente se mueve por el árbol buscando dónde insertar
    def _insert_recursive(self, current, data):
        if data < current.data:
            # Si el dato es menor, va a la izquierda
            if current.left is None:
                current.left = Node(data)  # Si no hay hijo izquierdo, lo pongo ahí
            else:
                self._insert_recursive(current.left, data)  # Si ya hay, sigo bajando
        elif data > current.data:
            # Si el dato es mayor, va a la derecha
            if current.right is None:
                current.right = Node(data)  # Si no hay hijo derecho, lo pongo ahí
            else:
                self._insert_recursive(current.right, data)  # Si ya hay, sigo bajando
        # Si es igual, no hago nada (no repetimos valores en este árbol)

    # Método para mostrar los valores en orden (de menor a mayor)
    def inorder(self):
        self._inorder_recursive(self.root)

    # Recorre el árbol en inorden (izquierda - nodo - derecha)
    def _inorder_recursive(self, current):
        if current is not None:
            self._inorder_recursive(current.left)   # Voy a la izquierda
            print(current.data, end=" ")            # Imprimo el nodo actual
            self._inorder_recursive(current.right)  # Voy a la derecha

tree = BinarySearchTree()
tree.insert(50)
tree.insert(30)
tree.insert(70)
tree.insert(20)
tree.insert(40)
tree.insert(60)
tree.insert(80)

tree.inorder()  # Esto imprime: 20 30 40 50 60 70 80
# Esto significa que los números están ordenados de menor a mayor