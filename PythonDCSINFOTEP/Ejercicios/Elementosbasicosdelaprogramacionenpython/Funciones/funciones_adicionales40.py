# Usa zip() para combinar varias listas y luego imprime las tuplas resultantes.

lista1 = [1, 2, 3]
lista2 = [4, 5, 6]
lista3 = [7, 8, 9]

combinacion = zip(lista1, lista2, lista3)

for tupla in combinacion:
    print(tupla)