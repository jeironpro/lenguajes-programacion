# Usa zip() para combinar tres listas: una de nombres, otra de edades y otra de ciudades.

nombres = ["Maria", "Jose", "Pedro"]
edades = [40, 38, 53]
ciudades = ["San pedro", "San juan", "San francisco"]

combinacion = zip(nombres, edades, ciudades)

print(list(combinacion))