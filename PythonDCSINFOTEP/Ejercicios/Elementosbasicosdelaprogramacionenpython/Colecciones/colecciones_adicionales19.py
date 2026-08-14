# Dado un conjunto con números del 1 al 10, elimina todos los números pares usando un bucle.

numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}

for i in range(len(numeros), 0, -1):
    if i % 2 == 0:
        numeros.remove(i)
print(numeros)