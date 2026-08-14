# Escribe una función que reciba un número de argumentos de palabra clave (usando **kwargs) y los imprima en formato clave:valor.

def clave_valor(**kwargs):
    for clave, valor in kwargs.items():
        print(f"{clave}: {valor}")

clave_valor(nombre = "Jeiron", edad = 21)