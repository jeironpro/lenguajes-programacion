'''
Escribir un programa que lea un entero positivo, n, introducido por el usuario y, después, muestre por pantalla la suma de todos los enteros desde 1 hasta n.
'''

numero = int(input("Introduzca un número entero positivo: "))

suma = int((numero * (numero + 1) / 2))

'''
Esta fórmula es una manera compacta de calcular la suma de los primeros n números enteros, donde n es el valor de numero en este caso.

La fórmula general para la suma de los primeros n números naturales es:
    Sn = n · (n + 1) / 2

· n es el número hasta el que deseas sumar (en este caso, numero).

· La multiplicación n · (n + 1) corresponde a la multiplicación de un número por su siguente número.

· El divisor 2 es para "dividir" la cantidad total, ya que se trata de la suma de una secuencia simétrica (es una progresión aritmética con una diferencia constante de 1).

¿Por qué funciona esta fórmula?
Esta formula se deriva de la propiedad de la serie aritmética. Si tienes una secuencia de números que comienza en 1 y aumenta en 1 de forma constante, puedes agrupar el primer número con el último, el segundo con el penúltimo, y así sucesivamente. Esto siempre te dará un total de n pares, y cada par suma n + 1.

Por ejemplo, si n = 5, la secuencia es:
    1 + 2 + 3 + 4 + 5

Agrupándolos en pares:
    (1 + 5), (2 + 4), 3

Cada uno de los pares da como resultado 6, y hay 2 pares completos, más el número 3 que queda sin pareja. Entonces la suma es 5 · 6/2 = 15, que es el resultado correcto.

Este método es mucho más eficiente que sumar los números de uno en uno, y también es la forma estándar de obtener la suma de los primeros n números naturales.
'''

print("La suma es:",suma)