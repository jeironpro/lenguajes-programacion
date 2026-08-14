# Dado el diccionario calificaciones = {"Juan": 8, "Ana": 9, "Luis": 7}, calcula el promedio de todas las calificaciones.

calificaciones = {"Juan": 8, "Ana": 9, "Luis": 7}

suma = sum(calificaciones.values());
longitud = len(calificaciones)

print(suma/longitud)