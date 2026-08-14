""" Polimorfismo en figuras geométricas

· Crea una clase base llamada Figura con el método area(). Este método debe ser sobrescrito en las clases hijas.
    
·Crea dos clases hijas: Cuadrado y Círculo. La clase Cuadrado debe tener un atributo lado y la clase Círculo debe tener un atributo radio.

· Sobrescribe el método area() en ambas clases:
    · Para el cuadrado, el área es lado * lado.
    · Para el círculo, el área es π * radio^2.
    
· Crea una función mostrar_area() que reciba un objeto Figura y llame al método area(), mostrando el área correspondiente según la clase.
"""

import math

class Figura:
    def area(self):
        pass

class Cuadrado(Figura):
    def __init__(self, lado):
        self.lado = lado

    def area(self):
        return self.lado * self.lado

class Circulo(Figura):
    def __init__(self, radio):
        self.radio = radio

    def area(self):
        return math.pi * self.radio ** 2
    
def mostrar_area(figura):
    print(f"El área es: {figura.area()}")

cuadrado = Cuadrado(7)
circulo = Circulo(5)

mostrar_area(cuadrado)
mostrar_area(circulo)