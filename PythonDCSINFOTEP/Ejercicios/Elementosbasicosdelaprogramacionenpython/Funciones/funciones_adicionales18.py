# Crea un programa que pida un número al usuario. Si el usuario ingresa un valor no numérico, maneja la excepción y muestra un mensaje.

def numerico():
    try:
        numero = int(input("Ingrese un valor numérico: "))
        print(f"Has ingresado el número {numero}.")
    except ValueError:
        print(f"El valor ingresado no es numérico")

numerico()