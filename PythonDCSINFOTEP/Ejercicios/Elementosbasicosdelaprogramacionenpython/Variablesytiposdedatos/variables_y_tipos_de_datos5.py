'''
Escribir un programa que pregunte al usuario el número de horas trabajadas y el coste por hora. Después, debe mostrar por pantalla la paga que le corresponde.
'''

horas = int(input("Introduzca el número de hora trabajadas: "))
coste_hora = int(input("Introduzca el coste de la hora: $"))

paga = horas * coste_hora

print("RD$", paga)