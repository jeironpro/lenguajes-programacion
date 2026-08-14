# Escribir un programa que pida al usuario un número entero y muestre por pantalla si es un número primo o no. 

numero = int(input("Introduzca un número entero: "))
contador = 0

for i in range(1, numero+1):
    if numero % i == 0:
        print(f"{numero} / {i} = {numero / i}")
        contador += 1

if contador == 2:
    print("El número es primo")
else:
    print("El número no es primo")
