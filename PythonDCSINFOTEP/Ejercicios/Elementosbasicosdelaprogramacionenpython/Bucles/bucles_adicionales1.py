'''
Suma de números pares: Escribe un programa que calcule la suma de todos los números pares entre 1 y 100 usando un bucle for.

Entrada esperada: Ninguna.
Salida esperada: La suma de los números pares es: 2550.
'''

suma = 0
for i in range(1, 101):
    if i % 2 == 0:
        suma += i
print("La suma de los núemros pares es:", suma)