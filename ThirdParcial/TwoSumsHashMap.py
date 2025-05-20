#Autor: Rebeca Garcia Rodríguez
#Matrícula: 14457
#Fecha: 15-Mayo-2025

#Hashmap
class Solution: ##clase creada
        def twoSum(nums, target): ##num (es el array) target (es el numero entero que ellos me pasan)
            seen = {} #creo un diccionario 
            for i in range (len(nums)): ##inicializo mi loop en cero
             diff = target -nums[i] ##aqui ve si es el numero ya lo hemos visto en nuestro diccionario y lo checa 
            if diff in seen: #volvemos a apreguntar si lo hemos visto?
               return [seen[diff], i]
            else: #La respuesta es no entonces
             seen[nums[i]]= i
             