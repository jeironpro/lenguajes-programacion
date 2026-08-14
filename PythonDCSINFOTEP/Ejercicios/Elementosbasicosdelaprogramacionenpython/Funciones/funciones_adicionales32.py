# Crea una lista de cadenas y usa map() para convertirlas todas a mayúsculas.

lista_palabras = []

palabras = input("Ingrese una lista de palabras separadas por coma: ")

for i in palabras.split(","):
    lista_palabras.append(i)

palabra_mayuscula = map(lambda c: c.upper(), lista_palabras)

print(f"Las palabras de la lista en mayúscula: {list(palabra_mayuscula)}")