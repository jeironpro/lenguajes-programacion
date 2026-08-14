# Escribir un programa que pida al usuario un número entero y muestre por pantalla si es par o impar.

numero = int(input("Introduzca un número entero: "))

resultado = "El número es par" if numero % 2 == 0 else "El número es impar"
print(resultado)