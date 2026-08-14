'''
Imprimir números impares: Usando un bucle while, imprime todos los números impares del 1 al 20.

Salida esperada: 1, 3, 5, ..., 19.
'''

impares = 1

while True:
    if impares < 19:
        print(impares, end=", ")
    else:
        print(impares)
    impares += 2

    if (impares > 20):
        break