# Usa filter() para obtener todos los números pares de una lista.

lista_numeros = []

numeros = input("Ingrese una lista de números separados por coma: ")

for i in numeros.split(","):
    lista_numeros.append(int(i))

def numero_par(numero):
    if numero % 2 == 0:
        return numero
    
resultado = filter(numero_par, lista_numeros)
print(f"Los números pares de la lista son: {list(resultado)}")