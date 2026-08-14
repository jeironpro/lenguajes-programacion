# Usa map() para convertir una lista de grados Celsius a Fahrenheit.

grados_celsius = [-10, 0, 15, 20, 25, 30, 35, 40, 50, 100]

grados_fahrenheit = map(lambda gc: gc * (9 / 5) + 32, grados_celsius)

print(f"La conversión de los grados celsius de la lista a fahrenheit: {list(grados_fahrenheit)}")