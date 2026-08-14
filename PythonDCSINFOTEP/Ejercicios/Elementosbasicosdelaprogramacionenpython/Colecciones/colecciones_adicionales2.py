# Solicita al usuario que ingrese 5 palabras y guárdalas en una lista. Al final, imprime la lista ordenada alfabéticamente.

lista_palabras = []

for i in range(5):
    palabra = input(f"Ingrese la palabra {i + 1}: ")
    lista_palabras.append(palabra)

lista_palabras.sort()
print(lista_palabras)