'''
Dada la tupla colores = ("rojo", "verde", "azul"), convierte la tupla en una lista, agrega el color "amarillo" y vuelve a convertirla en tupla.
'''

colores = ("rojo", "verde", "azul")
print(colores)
colores = list(colores)
print(colores)
colores.append("amarrillo")
print(colores)
colores = tuple(colores)
print(colores)