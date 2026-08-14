# Escribir una función que calcule el área de un círculo y otra que calcule el volumen de un cilindro usando la primera función.

import math

radio = int(input("Ingrese el radio del círculo: "))

def calcular_area_circulo(radio):
    return round(math.pi * radio**2, 2)
    
def calcular_volumen_cilindro(altura):
    return round(calcular_area_circulo(radio) * altura, 2)

opciones = int(input("(1) para calcular el área de un círculo o (2) para calcular el volumen de un cilindro: "))

if opciones == 1:
    print("El área del círculo es:", calcular_area_circulo(radio))
elif opciones == 2:
    altura = int(input("Ingrese la altura del cilindro: "))
    print(calcular_volumen_cilindro(altura))    