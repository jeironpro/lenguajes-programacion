'''
Adivina el número: Implementa un programa que genere un número aleatorio entre 1 y 10, y que permita al usuario adivinarlo hasta acertar. Usa while para repetir las adivinanzas.

Entrada: 5 (suponiendo que el número aleatorio sea 5).
Salida esperada: ¡Correcto! Has adivinado el número.
'''

import random

numero_aleatorio = random.randint(1, 10)
numero_usuario = int(input("Adivina el número pensado: "))

while numero_usuario != numero_aleatorio:
    print("Incorrecto.")
    numero_usuario = int(input("Vuelva a intentarlo: "))

print("¡Correcto! Has adivinado el número.")