# Escribir un programa que almacene los vectores (1, 2, 3) y (-1, 0, 2) en dos listas y muestre por pantalla su producto escalar.

vector1 = [1, 2, 3]
vector2 = [-1, 0, 2]

producto_escalar = 0
for i in range(len(vector1)):
    producto_escalar += vector1[i] * vector2[i]

print(f"El producto escalar de los vectores {vector1} y {vector2} es: {producto_escalar}")

print("Comprobación:")
index0 = vector1[0] * vector2[0]
index1 = vector1[1] * vector2[1]
index2 = vector1[2] * vector2[2]

print(f"La multiplicación de la posoción 0 de los vectores {vector1[0]} * {vector2[0]} da como resultado: {index0}")
print(f"La multiplicación de la posoción 1 de los vectores {vector1[1]} * {vector2[1]} da como resultado: {index1}")
print(f"La multiplicación de la posoción 2 de los vectores {vector1[2]} * {vector2[2]} da como resultado: {index2}")

print(f"El resultado de la comprobación es: {index0 + index1 + index2}")