# Define una función que reciba un número y determine si es par o impar.

def numero_par_impar(numero):
    if numero % 2 == 0:
        return f"El número {numero} es par"
    else:
        return f"El número {numero} es impar"
    
numero = int(input("Ingrese un número entero positivo: "))
print(numero_par_impar(numero))