# Crea una función lambda que calcule el cuadrado de un número.

numero = int(input("Ingrese un número: "))

cuadrado = lambda num: num * num

print(f"El cuadrado del número es: {cuadrado(numero)}")