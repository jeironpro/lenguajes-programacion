# Escribir un programa que pida al usuario una palabra y muestre por pantalla el número de veces que contiene cada vocal.

vocales = ["a", "e", "i", "o", "u"]
palabra = input("Escribe una palabra: ")

for vocal in vocales:
    contador = 0
    for letra in palabra:
        if vocal == letra:
            contador += 1
    print(f"La palabra: {palabra} tiene: {contador} {vocal}")