# Escribe un código que intente acceder a un índice fuera de rango en una lista y maneje la excepción.

def index(lista, indice):
    try:
        elemento = lista[indice]
        print(f"El elemento en el indice {indice} es: {elemento}.")
    except IndexError:
        print(f"Error. El indice {indice} está fuera del rango de la lista.")

lista = []

numeros = input("Ingrese una lista de números separados por coma: ")

for i in numeros.split(","):
    lista.append(int(i))

indice = int(input("Ingrese el indice de la lista al que quiere acceder: "))

index(lista, indice)