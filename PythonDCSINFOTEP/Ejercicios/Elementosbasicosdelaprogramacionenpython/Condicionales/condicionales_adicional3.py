'''
Escribir un programa que pida la hora del día (en formato de 24 horas) y muestre el mensaje correspondiente:

- Si es antes de las 12: "Buenos días".
- Si es de 12 a 18: "Buenas tardes".
- Si es después de las 18: "Buenas noches".
'''

hora_del_dia = int(input("¿Qué hora es? "))

if hora_del_dia < 12:
    print("Buenos días")
elif hora_del_dia >= 12 and hora_del_dia <= 18:
    print("Buenas tardes")
else:
    print("Buenas noches")