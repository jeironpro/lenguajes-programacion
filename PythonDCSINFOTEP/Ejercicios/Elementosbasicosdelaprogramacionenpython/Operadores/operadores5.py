'''
Escribir un programa que pida al usuario el radio de un círculo y calcula su perimetro.

Fórmula:
perimetro = 2 * PI * radio
PI = 3.1416
'''

radio = int(input("Ingresa el radio: "))
PI = 3.1416
perimetro = 2 * PI * radio

print("El perímetro del círculo es:", perimetro)