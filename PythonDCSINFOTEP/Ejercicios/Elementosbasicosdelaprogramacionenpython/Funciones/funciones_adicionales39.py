# Combina dos listas de números y usa zip() para sumar los elementos correspondientes.

lista1 = [1, 2, 3, 4, 5]
lista2 = [10, 20, 30, 40, 50]

sumar_elementos =  [a + b for a, b in zip(lista1, lista2)]

print(f"La suma correspondiente a cada elemento de las listas: {list(sumar_elementos)}")