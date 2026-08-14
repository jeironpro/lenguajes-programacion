# Crea una función que reciba tanto *args como **kwargs y los imprima.

def mostrar_argumentos(*args, **kwargs):
    print("(*args):")
    for arg in args:
        print(arg)

    print("\n(**kwargs):")
    for clave, valor in kwargs.items():
        print(f"{clave}: {valor}")

mostrar_argumentos(1, 2, 3, nombre="Juan", edad=30)