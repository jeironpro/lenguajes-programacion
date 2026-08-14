# Usa zip() para combinar dos listas de nombres y edades en una lista de tuplas.

nombres = ["Maria", "Jose", "Pedro"]
edades = [40, 38, 53]

combinacion = zip(nombres, edades)

print(list(combinacion))