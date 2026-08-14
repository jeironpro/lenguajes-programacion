# Crea una función que divida dos números. Asegúrate de que maneje el error si el divisor es cero.

def division(num1, num2):
    try:
        print(f"El resultado de la división es: {num1 / num2}")
    except ZeroDivisionError:
        print("No se puede dividir por cero.")

num1 = int(input("Ingrese el primer numero: "))
num2 = int(input("Ingrese el segundo numero: "))
division(num1, num2)