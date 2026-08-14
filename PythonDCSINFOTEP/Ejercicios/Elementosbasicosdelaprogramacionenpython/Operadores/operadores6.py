'''
Escribir un programa que pida al usuario dos números y muestre los valores intercambiados.

* No usar estructuras de control, usar una asignación múltiple. *
'''

num1 = int(input("Ingresa el primer número: "))
num2 = int(input("Ingresa el segundo número: "))

print("Antes del intercambio:")
print("Primer número:", num1)
print("Segundo número:", num2)

num1, num2 = num2, num1
print("Después del intercambio:")
print("Primer número:", num1)
print("Segundo número:", num2)