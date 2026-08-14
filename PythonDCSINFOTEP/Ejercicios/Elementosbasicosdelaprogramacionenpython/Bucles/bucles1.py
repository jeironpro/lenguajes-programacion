# Escribir un programa que pida al usuario una palabra y la muestre por pantalla 10 veces.

palabra = input("Escribe una palabra: ")

for i in range(1, 11):
    print(f"{i}- {palabra}")