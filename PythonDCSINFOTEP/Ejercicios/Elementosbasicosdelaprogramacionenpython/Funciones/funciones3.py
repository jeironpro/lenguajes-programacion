# Escribir una función que reciba un número entero positivo y devuelva su factorial.

def factorial(numero):
    multiplicacion = 1
    for i in range(numero):
        multiplicacion *= i + 1
    print(f"El factorial de {numero} es: {multiplicacion}")

numero = int(input("Ingrese el número entero positivo del cual quiere obtener el factorial: "))
if numero < 0:
    print("No se permiten números negativos")
else:
    factorial(numero)