'''
Sumar hasta que el usuario ingrese 0: Pide al usuario que ingrese números y suma todos los valores. Termina el programa cuando el usuario ingrese 0.

Entrada: 10, 5, 0.
Salida esperada: La suma total es: 15.
''' 

numero = int(input("Escriba un numero: (o para acabar escriba 0): "))

suma = 0
while numero > 0:
    suma += numero
    numero = int(input("Escriba un numero: (o para acabar escriba 0): "))
print(f"La suma total es: {suma}")