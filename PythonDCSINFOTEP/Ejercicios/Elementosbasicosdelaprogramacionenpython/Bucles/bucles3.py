'''
Escribir un programa que pida al usuario un número positivo y muestre por pantalla todos los números impares desde 1 hasta ese número separados por comas.
'''

numero = int(input("Introduzca un número positivo: "))

for i in range(numero):
    if i % 2 != 0:
        if i < numero-1:
            print(i, end=", ")
        else:
            print(i)