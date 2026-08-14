'''
Revertir un texto: Escribe un programa que, usando un bucle for, invierta un texto ingresado por el usuario.

Entrada: hola.
Salida esperada: aloh.
''' 

texto = input("Escriba un texto: ")

for i in range(len(texto), 0, -1):
    print(texto[i-1], end="")