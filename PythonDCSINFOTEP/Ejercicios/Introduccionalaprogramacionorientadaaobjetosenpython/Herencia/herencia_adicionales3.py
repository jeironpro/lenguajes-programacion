""" Herencia con el método super()

· Crea una clase base Forma con el método area() que retorne 0 (esto será sobrescrito en las clases hijas).

· Crea dos clases hijas: Cuadrado y Círculo. La clase Cuadrado debe tener un atributo lado y la clase Círculo debe tener un atributo radio.
    
· En el método area() de ambas clases hijas, calcula el área correspondiente:
    · Para el cuadrado: lado * lado
    · Para el círculo: π * radio^2

· Utiliza el método super() para llamar al constructor de la clase base Forma y asignar valores comunes.
"""

import math

class Forma:
    def __init__(self):
        pass

    def area(self):
        return 0
    
class Cuadrado(Forma):
    def __init__(self, lado):
        super().__init__()
        self.lado = lado

    def area(self):
        return self.lado * self.lado

class Circulo(Forma):
    def __init__(self, radio):
        super().__init__()
        self.radio = radio

    def area(self):
        return math.pi * self.radio ** 2
    
cuadrado = Cuadrado(8)
circulo = Circulo(10)

print(f"El área del cuadrado es: {cuadrado.area()}")
print(f"El área del círculo es: {circulo.area()}")   