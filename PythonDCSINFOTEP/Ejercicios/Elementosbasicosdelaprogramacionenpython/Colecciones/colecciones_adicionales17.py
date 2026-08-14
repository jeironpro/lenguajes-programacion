'''
Dado el conjunto colores = {"rojo", "verde", "azul"}, permite al usuario agregar un color al conjunto. Si el color ya está, muestra un mensaje indicando que ya existe.
'''

colores = {"rojo", "verde", "azul"}
color = input("Agregar el color: ")

if color in colores:
    print("El color ya existe")
else:
    colores.add(color)
print(colores)