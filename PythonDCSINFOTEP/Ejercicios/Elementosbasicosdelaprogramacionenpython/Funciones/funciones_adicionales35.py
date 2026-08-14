# Crea una lista de números y usa map() para calcular su raíz cuadrada.

import math

numeros = [4, 16, 25, 36, 49, 64, 81, 100]

raiz_cuadrada = map(math.sqrt, numeros)

print(f"La raiz cuadrada de los números de la lista: {list(raiz_cuadrada)}")