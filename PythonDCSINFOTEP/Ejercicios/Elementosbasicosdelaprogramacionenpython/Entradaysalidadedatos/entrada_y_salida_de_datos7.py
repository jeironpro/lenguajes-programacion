# Escribir un programa que pida al usuario el precio de tres producto y calcule el total a pagar con el ITBIS del 18%.

producto1 = float(input("Precio del producto 1: "))
producto2 = float(input("Precio del producto 2: "))
producto3 = float(input("Precio del producto 3: "))

suma_productos = (producto1 + producto2 + producto3)
total_itbis = suma_productos + (suma_productos * 0.18)
print(f"El total con ITBIS es: {total_itbis:.2f}")