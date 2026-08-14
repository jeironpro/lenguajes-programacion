'''
Escribe un programa que reciba una lista de números enteros del usuario y calcule la suma y el promedio de los números de la lista.
'''

numeros = input("Introduce una lista de numeros separados por coma: ")
lista_numeros = []
suma_numeros = 0;

for i in numeros.split(","):
    suma_numeros += int(i)
    lista_numeros.append(int(i))

promedio_numeros = suma_numeros / len(lista_numeros)
print(f"La suma de todos los números de la lista es: {suma_numeros}")
print(f"El promedio de los números de la lista es: {promedio_numeros}")