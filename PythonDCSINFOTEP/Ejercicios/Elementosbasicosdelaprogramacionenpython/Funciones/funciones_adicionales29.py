# Crea una lista de números y usa lambda y sorted() para ordenarla de menor a mayor.

lista_numeros = []

numeros = input("Ingrese una lista de números separados por coma: ")

for i in numeros.split(","):
    lista_numeros.append(int(i))

menor_a_mayor = sorted(lista_numeros, key=lambda num: num)

print(menor_a_mayor)