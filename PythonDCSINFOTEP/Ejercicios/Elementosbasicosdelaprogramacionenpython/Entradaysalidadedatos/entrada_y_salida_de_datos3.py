'''
Escribir un programa qye convierta una temperatura de grados Celsius a Fahrenheit. 

Formula:
f = c * 9 / 5 + 32
'''

temperatura_celsius = int(input("Ingresa la temperatura en Celsius: "))

temperatura_fahrenheit = temperatura_celsius * 9 / 5 + 32

print(f"{temperatura_celsius}°C son {int(temperatura_fahrenheit)}°F")