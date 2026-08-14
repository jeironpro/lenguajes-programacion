# Crea una lista que contenga los números del 1 al 20 y elimina todos los números múltiplos de 3.

numeros = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]

for i in range(len(numeros), 0, -1):
    if i % 3 == 0:
        numeros.pop(i-1)
print(numeros)