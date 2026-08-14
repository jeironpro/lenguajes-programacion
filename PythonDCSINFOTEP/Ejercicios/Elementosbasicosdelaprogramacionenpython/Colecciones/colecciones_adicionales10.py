'''
Escribe un programa que reciba tres valores del usuario, cree una tupla con ellos y determine si todos los valores son iguales, diferentes o si hay al menos un duplicado.
'''

valor1 = input("Ingresa el primer valor: ")
valor2 = input("Ingresa el segundo valor: ")
valor3 = input("Ingresa el tercer valor: ")
tupla_valores = (valor1, valor2, valor3)

if valor1 == valor2 == valor3:
    print("Todos los valores son iguales")
elif valor1 == valor2 or valor1 == valor3 or valor2 == valor3:
    print("Hay al menos un duplicado")
else:
    print("Todos los valores son diferentes") 
    
tupla_valores = tuple(tupla_valores)
print(tupla_valores)