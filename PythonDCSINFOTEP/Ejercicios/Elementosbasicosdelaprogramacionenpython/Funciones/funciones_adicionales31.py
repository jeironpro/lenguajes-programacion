# Usa map() para convertir una lista de números a su cuadrado.

lista_numeros = []

numeros = input("Ingrese una lista de números separados por coma: ")

for i in numeros.split(","):
    lista_numeros.append(int(i))

cuadrado = map(lambda num: num * num, lista_numeros)

print(f"El cuadrado de los números de la lista son: {list(cuadrado)}")