""" Clase Abstracta para Forma Geométrica

· Crea una clase abstracta llamada Forma con un método abstracto area() y un método no abstracto perimetro() que calcule el perímetro de la forma.

· Define dos clases hijas, Círculo y Rectángulo, que implementen el método area() de manera correspondiente.

· La clase Rectángulo debe tener atributos largo y ancho, y la clase Círculo debe tener un atributo radio.
"""

from abc import ABC, abstractmethod
import math

class Forma(ABC):
    @abstractmethod
    def area(self):
        pass

    def perimetro(self):
        pass

class Circulo(Forma):
    def __init__(self, radio):
        self.radio = radio

    def area(self):
        return math.pi * (self.radio ** 2)
    
    def perimetro(self):
        return 2 * math.pi * self.radio
    
class Rectangulo(Forma):
    def __init__(self, largo, ancho):
        self.largo = largo
        self.ancho = ancho

    def area(self):
        return self.largo * self.ancho
    
    def perimetro(self):
        return 2 * (self.largo + self.ancho)
    
circulo = Circulo(5)

rectangulo = Rectangulo(7, 4)

print(f"El área del círculo es: {circulo.area():.2f}")
print(f"El perímetro del círculo es: {circulo.perimetro():.2f}")

print(f"El área del rectángulo es: {rectangulo.area()}")
print(f"El perímetro del rectángulo es: {rectangulo.perimetro()}")