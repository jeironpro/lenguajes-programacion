'''
Escribir un programa que pida al usuario un número entero positivo y muestre por pantalla la cuenta atrás desde ese número hasta cero, separados por comas.
'''

numero = int(input("Introduzca un numero positivo: "))

print("Inicio de la cuenta regresiva: ")
for i in range(numero, -1, -1):
    print(i)