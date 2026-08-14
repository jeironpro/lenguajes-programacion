# Define una función que reciba un número y determine si es un número primo.

def numero_primo(numero):
    contador = 0
    for i in range(1, numero+1):
        if numero % i == 0:
            print(f"{numero} / {i} = {numero / i}")
            contador += 1
    if contador == 2:
        print("El número es primo")
    else:
        print("El número no es primo")

numero = int(input("Ingrese un número: "))
numero_primo(numero)
