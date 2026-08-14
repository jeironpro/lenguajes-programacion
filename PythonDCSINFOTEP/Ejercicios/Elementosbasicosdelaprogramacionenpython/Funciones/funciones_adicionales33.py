# Usa map() para sumar dos listas elemento por elemento.

lista_numeros1 = []
lista_numeros2 = []


for i in range(2):
    numeros = input("Ingrese una lista de números separados por coma: ")

    for k in numeros.split(","):
        if i == 0:
            lista_numeros1.append(int(k))
        else:
            lista_numeros2.append(int(k))

sumar_elementos = map(lambda a, b: a + b, lista_numeros1, lista_numeros2)
print(f"La suma de los numeros de las listas: {list(sumar_elementos)}")