# Define una función que reciba un número variable de argumentos y los imprima.

def argumentos_variables(*args):
    for arg in args:
        print(arg,end="")

argumentos_variables('J', 'e', 'i', 'r', 'o', 'n', 2, 1)