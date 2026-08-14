'''
Escribir un programa que pregunte al usuario una cantidad a invertir, el interés anual y el número de años, y muestre por pantalla el capital obtenido en la inversión cada año que dura la inversión.
'''

cantidad_invertir = int(input("Introduzca la cantidad a invertir: "))
interes_anual = int(input("Introduzca el interés anual: "))
numero_anios = int(input("Introduzca el número de año de la inversión: "))

contador = 1
while (contador <= numero_anios):
    anio = contador
    ganancias = (cantidad_invertir / 100) * interes_anual * anio

    if contador == 1:
        print(f"En {anio} año, tus ganancias seran de {ganancias}")
    else:
        print(f"En {anio} años, tus ganancias seran de {ganancias}")

    contador += 1