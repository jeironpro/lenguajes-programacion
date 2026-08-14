'''
Crea una lista que contenga los números del 1 al 10. Luego, imprime solo los números pares de la lista. (Pista: Usa un bucle y condicionales)
'''

numeros = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

for i in numeros:
    if i % 2 == 0:
        print(i)