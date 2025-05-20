
#Autor: Rebeca Garcia Rodríguez
#Matrícula: 14457
#Fecha: 10-Abril-2025

##Fuerza Bruta TAREA
from typing import List #Uso ,o lista para anotar los numeros enteros
class Solution: #defino mi clase :)
    def twoProduct(self, nums: List[int], target: int) -> List[int]:#Recibe mi lista (nums) y un target, devulve mi lista con los inidces
      for i in range(len(nums)): #i va a recorrer la lista del arreglo (nums)
       for j in range(i + 1, len(nums)): #Es mi segundo ciclo , recorre los indices despues del indice i, y evita mis combinaciones
        if nums[i] * nums[j] == target: # si se multiplican y los dos numeros son igual al target.
         return [i, j] #devuelve los indices


solu = Solution()
print(solu.twoProduct([4, 8, 9, 24, 8], 64))
