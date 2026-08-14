# Usa una función lambda para multiplicar un número por 3.

numero = int(input("Ingrese un número: "))

multiplicar_por_3 = lambda num: num * 3

print(f"El número multiplicado por 3 es igual a: {multiplicar_por_3(numero)}")