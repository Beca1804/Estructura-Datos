#Autor: Rebeca Garcia Rodríguez
#Matrícula: 14457
#Fecha: 22-Abril-2025
#HASHMAP MULTIPLICACION TAREA 
from typing import List

class Solution:
    def twoProduct(self, nums: List[int], target: int) -> List[int]:
        mapa = {}  # valor -> índice
        mejor_par = None

        for i, num in enumerate(nums):
            if num == 0 and target == 0:
                return [i, i]
            if num != 0 and target % num == 0:
                complemento = target // num
                if complemento in mapa:
                    # si aún no hay un mejor par o este es menor, lo guardamos
                    if mejor_par is None or [mapa[complemento], i] < mejor_par:
                        mejor_par = [mapa[complemento], i]
            mapa[num] = i

        return mejor_par

# Ejemplo de uso
solu = Solution()
resultado = solu.twoProduct([2, 4, 5, 10, 7], 20)
print("Indices encontrados:", resultado)