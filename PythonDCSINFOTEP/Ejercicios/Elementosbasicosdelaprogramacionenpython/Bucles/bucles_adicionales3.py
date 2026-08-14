'''
Contar vocales en una palabra: Escribe un programa que pida una palabra al usuario y cuente cuántas vocales tiene.

Entrada: Python.
Salida esperada: La palabra contiene 1 vocal(es).
''' 

vocales = ["a", "e", "i", "o", "u"]
palabra = input("Ingrese una palabra: ")

contador = 0
for vocal in vocales:
    for j in range(len(palabra)):
        if palabra[j] == vocal:
            contador += 1
print(f"La palabra contiene {contador} vocal(es).")