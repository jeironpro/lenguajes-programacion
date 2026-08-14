# Crea una función que reciba un número y si es negativo, lance una excepción personalizada.

def verificar_numero():
    numero = int(input("Ingrese un número entero: "))
    if numero < 0:
        raise ValueError(f"El número {numero} es negativo.")
    else:
        print(f"EL número {numero} es positivo.")

verificar_numero()  