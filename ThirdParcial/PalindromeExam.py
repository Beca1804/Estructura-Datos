#Autor: Rebeca Garcia Rodríguez
#Matrícula: 14457
#Fecha: 23-Abril-2025
class Solution:
    def is_palindrome(self, numero: int) -> bool:
        numero_str = str(numero)
        return numero_str == numero_str[::-1] #

sol = Solution()
print(sol.is_palindrome(181))