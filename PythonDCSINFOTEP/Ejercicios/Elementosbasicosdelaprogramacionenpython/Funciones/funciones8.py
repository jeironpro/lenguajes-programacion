# Escribir una función que reciba una muestra de números en una lista y devuelva un diccionario con su media, varianza y desviación típica.

import math

def calcular_estadisticas(numeros):
    x = 0
    if not numeros:
        return {"media": None, "varianza": None, "desviación_tipica": None}
    
    num = len(numeros)
    media = sum(numeros) / num

    for i in numeros:
        x += (i - media) ** 2

    varianza = x / num

    desviacion_tipica = math.sqrt(varianza)

    return {
        "media": media,
        "varianza": varianza,
        "desviacion_tipica": desviacion_tipica
    }


muestra = []

numeros_usuario = input("Ingrese una lista de números separados por coma: ")

for i in numeros_usuario.split(","):
    muestra.append(int(i))
    
resultado = calcular_estadisticas(muestra)
print(resultado)