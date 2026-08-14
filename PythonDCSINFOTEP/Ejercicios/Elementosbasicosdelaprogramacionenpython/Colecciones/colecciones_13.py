'''
Escribir un programa que pregunte por una muestra de números, separados por comas, los guarde en una lista y muestre por pantalla su media y desviación típica.
'''

import math

lista_muestras = []
suma_numeros = 0
x = 0
numeros = input("Introduce una muestra de números separados por comas: ")

for i in numeros.split(","):
    lista_muestras.append(float(i))

for j in lista_muestras:
    suma_numeros += j

media = suma_numeros / len(lista_muestras)

for k in lista_muestras:
    x += (k - media) ** 2

varianza = x / len(lista_muestras)

desviacion_tipica = math.sqrt(varianza)

print(f"La media de la muestra es: {media}")  
print(f"La desviación típica de la muestra es: {desviacion_tipica}")