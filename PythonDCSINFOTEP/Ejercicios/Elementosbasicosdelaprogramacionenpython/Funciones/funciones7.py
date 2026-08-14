# Escribir una función que reciba una muestra de números en una lista y devuelva otra lista con sus cuadrados.

muestra = [45, 33, 68, 2, 4, 16, 5, 3, 8, 9, 200]

cuadrado = map(lambda num: num*num, muestra)

print("Los cuadrados de la muestra son:", list(cuadrado))