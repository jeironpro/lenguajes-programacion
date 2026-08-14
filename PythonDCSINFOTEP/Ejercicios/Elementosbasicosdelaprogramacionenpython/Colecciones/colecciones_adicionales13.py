'''
Crea un programa que permita al usuario ingresar un número indefinido de pares clave-valor (por ejemplo, nombres y edades). Detén la entrada cuando el usuario escriba "fin" como clave.
'''

diccionario = {}

while True:
    clave = input("Ingresa la clave (escribe 'fin' para terminar): ")

    if clave == "fin":
        break

    valor = input(f"Ingresa el valor de la clave {clave}: ")
    
    diccionario[clave] = valor

print("Los pares clave-valor ingresados son:")
for clave, valor in diccionario.items():
    print(f"{clave}: {valor}")