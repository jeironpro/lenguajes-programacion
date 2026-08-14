'''
Escribir un programa que pida al usuario dos números enteros y muestre por pantalla: "<n> entre <m> da un cociente de <c> y un resto <r>", donde <n> y <m> son los números introducidos por el usuario, y <c> y <r> son el cociente y el resto de la división entera respectivamente.
'''

n = int(input("Escriba el primer número: "))
m = int(input("Escriba el segundo número: "))

cociente = n / m
resto = n % m

print("{0} entre {1} da un cociente de {2} y un resto {3}".format(n, m, cociente, resto))