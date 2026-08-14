# Escribir un programa que pida al usuario una palabra y muestre por pantalla si es un palíndromo.

palabra = input("Escribe una palabra: ")

palabra_reves = palabra
palabra = list(palabra)
palabra_reves = list(palabra_reves)
palabra_reves.reverse()

if palabra == palabra_reves:
    print("La palabra es un palindromo")
else:
    print("La palabra no es un palindromo")
