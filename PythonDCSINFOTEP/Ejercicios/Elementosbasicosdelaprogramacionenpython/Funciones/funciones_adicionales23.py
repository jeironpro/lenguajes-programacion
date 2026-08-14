# Filtra una lista de números y devuelve solo aquellos que sean mayores que 10.

lista_numeros = []

numeros = input("Ingrese una lista de números separados por coma: ")

for i in numeros.split(","):
    lista_numeros.append(int(i))

def mayor_que_10(numero):
    return numero > 10

resultado = filter(mayor_que_10, lista_numeros)
print(f"Los números de las lista mayor a 10 son: {list(resultado)}")