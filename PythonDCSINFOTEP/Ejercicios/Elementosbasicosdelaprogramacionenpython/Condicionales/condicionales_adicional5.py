# Escribir un programa que pida tres números al usuario y determine cuál es el mayor utilizando condicionales anidadas.

num1 = int(input("Ingresa el primer número: "))
num2 = int(input("Ingresa el segundo número: "))
num3 = int(input("Ingresa el tercer número: "))

if num1 >= num2: 
    if num1 >= num3:
        print("El número mayor es:", num1)
    else:
        print("El número mayor es:", num3)
elif num2 >= num3:
    print("El número mayor es:", num2)
else:
    print("El número mayor es:", num3)