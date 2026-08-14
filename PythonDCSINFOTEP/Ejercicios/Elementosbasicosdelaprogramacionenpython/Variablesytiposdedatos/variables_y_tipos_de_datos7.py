'''
Escribir un programa que pida al usuario su peso en kg y estatura en metros, calcule el índice de masa corporal (IMC), lo almacene en una variable y muestre por pantalla la frase: "Tu índice de masa corporal es <IMC>", donde <IMC> es el índice de masa corporal calculado, redondeado a dos decimales.
'''

peso_kg = int(input("Introduce tu peso en kg: "))
estatura_mt = float(input("Introduce tu estatura en metros: "))

# Otra forma de redondear usando la función round()
# imc = round(peso_kg/estatura_mt**2)
# print(f"Tu indice de masa corporal es {imc}")

imc = peso_kg/estatura_mt**2

'''
La formula estándar para calcular el Índice de Masa Corporal (IMC), que se utiliza para evaluar la cantidad de tejido corporal en una persona, en función de su peso y altura. Se expresa de la siguiente forma:

Fórmula del IMC:
    imc = peso (kg) / estatura (m)²

¿Cómo funciona esta fórmula?
· peso (kg): el peso de la persona en kilogramos.
· estatura (m): la altura de la persona en metros. En esta fórmula, se debe elevar al cuadrado (esto significa multiplicar la estatura por sí misma).

¿Qué significa el IMC?
El IMC es una medida estándar que clasifica el peso de una persona en categorías, según el valor obtenido:

· IMC < 18.5: Bajo peso
· IMC entre 18.5 y 24.9: peso normal
· IMC entre 25 y 29.9: sobrepeso
· IMC >= 30: obesidad

¿Por qué se usa esta fórmula?
El IMC es útil porque proporciona una estimación general de la cantidad de tejido corporal en relación con la altura y peso. Sin embargo tener en cuenta que el IMC no distingue entre masa muscular y grasa corporal, por lo que una persona con mucha mosculatura (como un atleta) podría tener un IMC alto pero estar en buena forma física.
'''
print(f"Tu índice de masa corporal es {imc:.2f}")