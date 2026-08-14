'''
Escribir un programa que pregunte al usuario los números ganadores de la lotería primitiva, los almacene en una lista y los muestre por pantalla ordenados de menor a mayor.
'''

lista_numeros = []

for i in range(3):
    numeros_loteria = int(input("Introduzca el número ganador de la lotería primitiva: "))
    lista_numeros.append(numeros_loteria)
    
lista_numeros.sort()
print(lista_numeros)