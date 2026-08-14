""" Herencia y super() con Métodos

Crea dos clases:

    · Figura: tiene un método area que imprime "Calculando el área".
    
    · Cuadrado: hereda de Figura y redefine el método area para calcular el área del cuadrado. Usa super() para llamar al método de la clase base.

Objetivo: Al crear un objeto de la clase Cuadrado, el método area debe llamar al método de la clase base y luego calcular el área de un cuadrado.
"""

class Figura:
    def area(self):
        print("Calculando el área")
    
class Cuadrado(Figura):
    def __init__(self, lado):
        self.lado = lado

    def area(self):
        super().area()
        return self.lado * self.lado

cuadrado = Cuadrado(5)

print(f"El área del cuadrado es: {cuadrado.area()}")