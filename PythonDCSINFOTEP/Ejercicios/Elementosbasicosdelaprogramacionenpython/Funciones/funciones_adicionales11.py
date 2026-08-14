# Crea una función que acepte un número indefinido de argumentos (usando *args) y los sume.

lista_numeros = []

numeros = input("Ingrese una lista de números separados por coma: ")

for i in numeros.split(","):
    lista_numeros.append(int(i))

def sumar_args(*args):
    return sum(args)

resultado = sumar_args(*lista_numeros)
print(f"La suma de todos los argumentos es: {resultado}")