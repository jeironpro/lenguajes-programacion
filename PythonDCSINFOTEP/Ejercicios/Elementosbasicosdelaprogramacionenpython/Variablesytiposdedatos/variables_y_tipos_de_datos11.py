'''
Imagina que acabas de abrir una nueva cuenta de ahorros que te ofrece el 4% de interés al año. Estos ahorros, debido a intereses, que no se cobran hasta finales de año, se te añaden al balance final de tu cuenta de ahorros. Escribir un programa que comience leyendo la cantidad de dinero depositada en la cuenta de ahorros, introducida por el usuario. Después, el programa debe calcular y mostrar por pantalla la cantidad de ahorros tras el primer, segundo y tercer año. Redondear cada cantidad a dos decimales.
'''

depositos = float(input("Cantidad de dinero a depositar: RD$ "))

interes_anual1 = depositos / 100 * 4
#interes_anual1 = round(depositos / 100 * 4, 2)
interes_anual2 = interes_anual1 * 2
#interes_anual2 = round(interes_anual1 * 2, 2)
interes_anual3 = interes_anual1 * 3
#interes_anual3 = round(interes_anual1 * 3, 2)

print(f"cantidad primer año RD${interes_anual1:.2f}\nCantidad segundo año RD${interes_anual2:.2f}\nCantidad tercer año RD${interes_anual3:.2f}")
#print("cantidad primer año RD$" + str(interes_anual1) + "Cantidad segundo año RD$" + str(interes_anual2) + "Cantidad tercer año RD$" + str(interes_anual3))