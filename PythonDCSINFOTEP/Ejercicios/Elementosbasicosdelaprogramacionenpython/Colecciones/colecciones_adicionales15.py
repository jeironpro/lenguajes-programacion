'''
Crea un programa que reciba una lista de nombres y edades del usuario, los guarde en un diccionario y luego permita consultar la edad de cualquier nombre ingresado por el usuario.
'''

personas = {}

while True:
    nombre = input("Ingresa el nombre (o escribe 'fin' para terminar): ")

    if nombre.lower() == "fin":
        break

    edad = input(f"Ingrese la edad de {nombre}: ")

    while not edad.isdigit():
        print("Por favor, ingresar una edad válida.")
        edad = input(f"Ingrese la edad de {nombre}: ")
    
    personas[nombre] = int(edad)

while True:
    consulta = input("Ingresa un nombre para consultar la edad (o escribe 'fin' para terminar): ")

    if consulta.lower() == "fin":
        break

    if consulta in personas:
        print(f"La edad de {consulta} es: {personas[consulta]}")
    else:
        print(f"No se encontró el nombre {consulta}.")