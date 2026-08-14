'''
Crea dos conjuntos con los números del 1 al 5 y del 4 al 8, respectivamente. Imprime:

La unión de los conjuntos.
La intersección de los conjuntos.
La diferencia de ambos conjuntos.
'''

conjunto1 = {1, 2, 3, 4, 5}
conjunto2 = {4, 5, 6, 7, 8}

print(conjunto1 | conjunto2)
print(conjunto1 & conjunto2)
print(conjunto1 - conjunto2)