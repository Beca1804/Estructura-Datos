#Autor: Rebeca Garcia Rodríguez
#Matrícula: 14457
#Fecha: 19-Mayo-2025



# Esta clase representa un grafo usando listas de adyacencia
class Graph:
    def __init__(self):
        self.adj_list = {}  # Acá voy a guardar todos los nodos y sus conexiones

    # Método para agregar un nodo al grafo
    def add_node(self, node):
        if node not in self.adj_list:
            self.adj_list[node] = []  # Si el nodo no existe, lo agrego con una lista vacía

    # Método para agregar una conexión (arista) entre dos nodos
    def add_edge(self, node1, node2):
        # Aseguro que los nodos existan (por si acaso)
        self.add_node(node1)
        self.add_node(node2)
        
        # Agrego la conexión de node1 a node2 (y viceversa si es no dirigido)
        self.adj_list[node1].append(node2)
        self.adj_list[node2].append(node1)  # Si lo querés dirigido, podés quitar esta línea

    # Método para mostrar el grafo
    def display(self):
        for node in self.adj_list:
            print(f"{node} -> {self.adj_list[node]}")  # Imprimo el nodo y a quién está conectado



# Creo el grafo
g = Graph()

# Agrego nodos y conexiones
g.add_edge("A", "B")
g.add_edge("A", "C")
g.add_edge("B", "D")
g.add_edge("C", "D")
g.add_edge("D", "E")

# Muestro cómo está el grafo
g.display()
