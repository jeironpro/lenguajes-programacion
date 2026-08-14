# Escribir una función que reciba una muestra de números en una lista y devuelva su media.

muestra = []

numeros = input("Ingrese una lista de números separados por coma: ")

for i in numeros.split(","):
    muestra.append(int(i))

def media(muestra):
    return sum(muestra) / len(muestra)

print(f"La media de la muestra es: {media(muestra)}")