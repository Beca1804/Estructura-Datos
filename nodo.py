from PyQt6.QtWidgets import (
    QApplication, QWidget, QLabel, QVBoxLayout,
    QHBoxLayout, QLineEdit, QPushButton, QTextEdit, QMessageBox
)
from PyQt6.QtGui import QFont
import sys
import heapq

class DijkstraApp(QWidget):
    def __init__(self):
        super().__init__()
        self.setWindowTitle("Algoritmo de Dijkstra Matematicas Discretas")
        self.setMinimumSize(700, 500)
        self.setStyleSheet("background-color: beige")
        self.setFont(QFont("Times New Roman", 12))

        self.grafo = {}

        self.init_ui()

    def init_ui(self):
        layout = QVBoxLayout()

        # Instrucciones
        instrucciones = QLabel("Agregar conexión (nodo1, nodo2, distancia):")
        layout.addWidget(instrucciones)

        self.nodo1_input = QLineEdit()
        self.nodo1_input.setPlaceholderText("Nodo 1")
        self.nodo2_input = QLineEdit()
        self.nodo2_input.setPlaceholderText("Nodo 2")
        self.distancia_input = QLineEdit()
        self.distancia_input.setPlaceholderText("Distancia")

        fila1 = QHBoxLayout()
        fila1.addWidget(self.nodo1_input)
        fila1.addWidget(self.nodo2_input)
        fila1.addWidget(self.distancia_input)
        layout.addLayout(fila1)

        btn_agregar = QPushButton("Agregar conexión")
        btn_agregar.clicked.connect(self.agregar_conexion)
        layout.addWidget(btn_agregar)

        self.conexiones_text = QTextEdit()
        self.conexiones_text.setReadOnly(True)
        layout.addWidget(self.conexiones_text)

        # Inputs para Dijkstra
        instrucciones2 = QLabel("Calcular camino más corto y largo:")
        layout.addWidget(instrucciones2)

        self.origen_input = QLineEdit()
        self.origen_input.setPlaceholderText("Nodo de inicio")
        self.destino_input = QLineEdit()
        self.destino_input.setPlaceholderText("Nodo de destino")

        fila2 = QHBoxLayout()
        fila2.addWidget(self.origen_input)
        fila2.addWidget(self.destino_input)
        layout.addLayout(fila2)

        btn_dijkstra = QPushButton("Calcular camino más corto y largo")
        btn_dijkstra.clicked.connect(self.calcular_camino)
        layout.addWidget(btn_dijkstra)

        self.resultado_text = QTextEdit()
        self.resultado_text.setReadOnly(True)
        layout.addWidget(self.resultado_text)

        btn_guardar = QPushButton("Guardar resultado en .txt")
        btn_guardar.clicked.connect(self.guardar_resultado)
        layout.addWidget(btn_guardar)

        self.setLayout(layout)

    def agregar_conexion(self):
        nodo1 = self.nodo1_input.text().strip()
        nodo2 = self.nodo2_input.text().strip()
        try:
            distancia = float(self.distancia_input.text().strip())
        except ValueError:
            QMessageBox.warning(self, "Error", "La distancia debe ser un número.")
            return

        if nodo1 and nodo2:
            self.grafo.setdefault(nodo1, []).append((nodo2, distancia))
            self.grafo.setdefault(nodo2, []).append((nodo1, distancia))
            self.conexiones_text.append(f"{nodo1} <--> {nodo2}  |  distancia: {distancia}")
            self.nodo1_input.clear()
            self.nodo2_input.clear()
            self.distancia_input.clear()
        else:
            QMessageBox.warning(self, "Error", "Por favor llena ambos nodos.")

    def calcular_camino(self):
        inicio = self.origen_input.text().strip()
        destino = self.destino_input.text().strip()

        if inicio not in self.grafo or destino not in self.grafo:
            QMessageBox.warning(self, "Error", "Ambos nodos deben existir en el grafo.")
            return

        # Cálculo del camino más corto usando Dijkstra
        distancias = {nodo: float('inf') for nodo in self.grafo}
        distancias[inicio] = 0
        previo = {}
        cola = [(0, inicio)]

        while cola:
            actual_dist, actual_nodo = heapq.heappop(cola)
            for vecino, distancia in self.grafo[actual_nodo]:
                nueva_distancia = actual_dist + distancia
                if nueva_distancia < distancias[vecino]:
                    distancias[vecino] = nueva_distancia
                    previo[vecino] = actual_nodo
                    heapq.heappush(cola, (nueva_distancia, vecino))

        # Reconstrucción del camino más corto
        camino_corto = []
        nodo_actual = destino
        while nodo_actual != inicio:
            if nodo_actual not in previo:
                self.resultado_text.setPlainText("No hay camino disponible entre los nodos.")
                return
            camino_corto.insert(0, nodo_actual)
            nodo_actual = previo[nodo_actual]
        camino_corto.insert(0, inicio)

        resultado_corto = f"Camino más corto: {' -> '.join(camino_corto)}\nDistancia total: {distancias[destino]}"

        # Cálculo del camino más largo usando el mismo algoritmo, pero considerando el camino más largo
        distancias_largas = {nodo: float('-inf') for nodo in self.grafo}
        distancias_largas[inicio] = 0
        previo_largo = {}
        cola_larga = [(0, inicio)]

        while cola_larga:
            actual_dist, actual_nodo = heapq.heappop(cola_larga)
            for vecino, distancia in self.grafo[actual_nodo]:
                nueva_distancia = actual_dist + distancia
                if nueva_distancia > distancias_largas[vecino]:
                    distancias_largas[vecino] = nueva_distancia
                    previo_largo[vecino] = actual_nodo
                    heapq.heappush(cola_larga, (nueva_distancia, vecino))

        # Reconstrucción del camino más largo
        camino_largo = []
        nodo_actual = destino
        while nodo_actual != inicio:
            if nodo_actual not in previo_largo:
                self.resultado_text.setPlainText("No hay camino disponible entre los nodos.")
                return
            camino_largo.insert(0, nodo_actual)
            nodo_actual = previo_largo[nodo_actual]
        camino_largo.insert(0, inicio)

        resultado_largo = f"Camino más largo: {' -> '.join(camino_largo)}\nDistancia total: {distancias_largas[destino]}"

        # Mostrar ambos resultados
        self.resultado_text.setPlainText(f"{resultado_corto}\n\n{resultado_largo}")

    def guardar_resultado(self):
        try:
            with open("resultado_dijkstra.txt", "w", encoding="utf-8") as f:
                f.write(self.resultado_text.toPlainText())
            QMessageBox.information(self, "Guardado", "Resultado guardado en resultado_dijkstra.txt")
        except Exception as e:
            QMessageBox.warning(self, "Error", f"No se pudo guardar el archivo: {e}")

if __name__ == "__main__":
    app = QApplication(sys.argv)
    ventana = DijkstraApp()
    ventana.show()
    sys.exit(app.exec())
