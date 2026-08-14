'''
Escribir un programa que pida al usuario su edad y muestre por pantalla:

Si es menor de 18 años, imprime "Eres menor de edad".
Si tiene 18 años o más, imprime "Eres mayor de edad".
'''

edad = int(input("Introduzca su edad: "))

if edad >=18:
    print("Eres mayor de edad")
else:
    print("Eres menor de edad")