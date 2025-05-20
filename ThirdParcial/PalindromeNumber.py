#Autor: Rebeca Garcia Rodríguez
#Matrícula: 14457
#Fecha: 9-Mayo-2025

class Solution:
    def isPalindrome(self, x):
        if x < 0 or (x % 10 == 0 and x != 0):
            return False

        half = 0
        while x > half:
            half = (half * 10) + (x % 10)
            x //= 10 #aqui le quito el último dígito a x 
        # Compara la primera mitad con la segunda mitad
        # Si la longitud es impar, se puede descartar el dígito del medio
        # (por ejemplo, 121 se convierte en 12 y 1)
        # Si la longitud es par, se compara directamente
        # (por ejemplo, 1221 se convierte en 12 y 12)
        # En ambos casos, la comparación es válida

        return x == half or x == half // 10


print(Solution().isPalindrome(121))


#x % 10" me da el número de la derecha, como si le arrancara el último dígito.
# "x // 10" me quita ese último dígito para ir al siguiente.

