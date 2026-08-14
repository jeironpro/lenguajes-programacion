# Escribir un programa que pida un número al usuario y, usando el operador ternario, determine si es positivo o negativo.

numero = int(input("Ingresa un número: "))

positivo_negativo = "El número es positivo" if numero >= 0 else "El número es negativo"

print(positivo_negativo)