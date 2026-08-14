'''
Escribir un programa que almacene las siguientes matrices:

A = [1, 2, 3]   B = [-1, 0]
    [4, 5, 6]       [0, 1]
                    [1, 1]

En una lista y muestre por pantalla su producto.
Nota: Para representar matrices mediante listas anidadas, representando cada vector fila en una lista.
'''

a = [
    [1, 2, 3],
    [4, 5, 6]
]

b = [
    [-1, 0],
    [0, 1],
    [1, 1]
]

resultado = [
    [0, 0],
    [0, 0]
]

for i in range(len(a)):
   for j in range(len(b[0])):
      for k in range(len(b)):
        resultado[i][j] += a[i][k] * b[k][j]

print("El producto de las matrices A y B es:")
for l in resultado:
    print(l)