'''
Escribir un programa que pregunte al usuario una cantidad a invertir, la tasa de interés anual y el número de años, y muestre por pantalla el capital obtenido en la inversión.
'''

cantidad_invertir = float(input("Cuál és la cantidad a invertir? RD$ "))
interes_anual = float(input("Cuál és el interés anual que desea? % "))
numero_años = float(input("Cuál és la cantidad de años?: "))

capital_obtenido = cantidad_invertir / 100 * interes_anual
ganancia_total = capital_obtenido * numero_años
# gananciaTotal = round(capital_obtenido * numero_años, 2) # Otra forma de redondear usando la función round()

print(f"El capital obtenido es: RD${ganancia_total:.2f}")
# print(f"El capital obtenido es: RD$", gananciaTotal) # Imprimir sin decimales