'''
Escribir un programa que pida un número y determine si es divisible tanto por 3 como por 5, usando condicionales anidadas. Si el número es divisible por ambos, imprime "Divisible por 3 y por 5". Si es divisible solo por uno, imprime el número correspondiente, y si no es divisible por ninguno, imprime "No es divisible ni por 3 ni por 5".
'''

numero = int(input("Ingresa un número? "))

if numero % 3 == 0:
    if numero % 5 == 0:
        print("Divisible por 3 y 5")
    else:
        print("Divisible por 3")
elif numero % 5 == 0:
    print("Divisible por 5")
else:
    print("No es divisible ni por 3 ni por 5")