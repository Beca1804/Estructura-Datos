#Autor: Rebeca Garcia Rodríguez
#Matrícula: 14457
#Fecha: 5-Mayo-2025

class Solution:
    def isPalindrome(self, x):
        x_str = str(x)              # Convierte el número a texto, por ejemplo: 121 -> "121"
        return x_str == x_str[::-1] # Compara el texto original con su reverso  [::-1] es un truco para invertir un string.
                                       #¿El texto original es igual al texto invertido?”
    

# Prueba
print(Solution().isPalindrome(121))   # True
print(Solution().isPalindrome(123))   # False
print(Solution().isPalindrome(-121))  # False
