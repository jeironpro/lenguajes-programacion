# Usa filter() para encontrar todos los elementos en una lista que sean mayores a 50.

lista_numeros = []

numeros = input("Ingrese una lista de números separados por coma: ")

for i in numeros.split(","):
    lista_numeros.append(int(i))

mayores_a_50 = filter(lambda num: num > 50, lista_numeros)

print(f"Los números de la lista mayores a 50 son: {list(mayores_a_50)}")