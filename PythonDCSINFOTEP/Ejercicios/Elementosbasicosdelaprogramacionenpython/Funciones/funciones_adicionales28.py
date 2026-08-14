# Usa una función lambda dentro de filter() para obtener los números mayores que 10 en una lista.

lista_numeros = []

numeros = input("Ingrese una lista de números separados por coma: ")

for i in numeros.split(","):
    lista_numeros.append(int(i))
    
mayor_que_10 = filter(lambda num: num > 10, lista_numeros)

print(f"Los números de la lista mayores a 10 son: {list(mayor_que_10)}")