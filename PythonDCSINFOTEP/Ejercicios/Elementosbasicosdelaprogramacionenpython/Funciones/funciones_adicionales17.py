# Escribe una función que intente convertir un valor a entero y maneje la excepción si no es posible.

def convertir_a_int(valor):
    try:
        valor = int(valor)
        print(f"El valor convertido a entero es: {valor}")
    except ValueError:
        print(f"No se pudo convertir '{valor}' a entero.")

valor = input("Ingrese un valor: ")
convertir_a_int(valor)