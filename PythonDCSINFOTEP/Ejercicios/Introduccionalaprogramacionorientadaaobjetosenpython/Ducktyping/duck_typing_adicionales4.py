""" Dibujar formas

Crea una función llamada dibujar_forma que reciba un objeto y lo dibuje. Si el objeto tiene un método dibujar(), debe llamarlo. Crea una clase Círculo (con el método dibujar) y una clase Cuadrado (con el método dibujar), y prueba la función con ambas. Además, prueba con una clase Triángulo que no tenga el método dibujar.
"""

def dibujar_forma(objeto):
    if hasattr(objeto, 'dibujar'):
        objeto.dibujar()
    else:
        print("Error: El objeto no tiene el método dibujar.")

class Circulo:
    def dibujar(self):
        print("Dibujando un círculo.")

class Cuadrado:
    def dibujar(self):
        print("Dibujando un cuadrado.")

class Triangulo:
    def __init__(self):
        print("Soy un triángulo, pero no puedo dibujar.")

circulo = Circulo()
cuadrado = Cuadrado()
triangulo = Triangulo()

dibujar_forma(circulo)
dibujar_forma(cuadrado)
dibujar_forma(triangulo)
