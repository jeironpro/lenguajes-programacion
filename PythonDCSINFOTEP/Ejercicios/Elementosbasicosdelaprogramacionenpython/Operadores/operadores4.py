'''
Escribir un programa que pida al usuario una cantidad de días y calcule cuántas semanas completa y días sobran.

Fórmula:
semanas = dias // 7
dias_restantes = dias % 7
'''

dias = int(input("Ingresa una cantidad de días: "))

semanas = dias // 7
dias_restantes = dias % 7

print(f"{dias} días son {semanas} semana(s) y {dias_restantes} día(s)")