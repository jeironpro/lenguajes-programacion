'''
Una panadería vende barras de pan a 3.49$ cada una. El pan que no es del día tiene un descuento del 60%. Escribir un programa que comience leyendo el número de barras vendidas que no son del día. Después, el programa debe mostrar el precio habitual de una barra de pan, el descuento que se le hace por no ser fresca y el costo final total.
'''

pan = int(input("Por favor, introduzca el número de barras vendidas que no son del día: "))

print("precio habitual: 3.49$")
descuento = 3.49 / 100 * 60
print(f"El descuento es:{descuento:.2f}")
precio_final = 3.49 - descuento
total =  pan * precio_final
print(f"El precio total es:{total:.2f}")