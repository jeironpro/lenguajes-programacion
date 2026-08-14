'''
Escribir un programa que pida al usuario dos números y muestre por pantalla su división. Si el divisor es cero, el programa debe mostrar un error.
'''

n1 = int(input("Introduzca el primer número: "))
n2 = int(input("Introduzca el segundo número: "))

if n2 == 0:
    print("No se puede dividir entre 0")
else:
    print(n1 / n2)