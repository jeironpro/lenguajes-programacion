'''
Escribir un programa que pida al usuario un numero entero y muestre por pantalla un triangulo rectagulo 
como el de mas abajo 

1
3 1
5 3 1
7 5 3 1
9 7 5 3 1
'''

numero = int(input("Introduce un número entero: "))

for i in range(1, numero, 2):
    for j in range(i, 0, -2):
        print(j, end=" ")
    print("\n") 