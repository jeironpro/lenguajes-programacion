'''
Crea una tupla con números enteros e imprime el mayor y el menor número de la tupla sin usar funciones predefinidas como max() o min().
'''

numeros = (10, 43, 21, 98, 4, 76, 14, 18)
menor = mayor = numeros[0]

for num in numeros:
    if num < menor:
        menor = num
    elif num > mayor:
        mayor = num

print("El menor de los números es:", menor)
print("El mayor de los números es:", mayor)