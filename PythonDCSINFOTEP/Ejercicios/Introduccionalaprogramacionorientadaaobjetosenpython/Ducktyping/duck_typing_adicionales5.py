""" Función para medir el área

Crea una función llamada calcular_area que reciba un objeto y calcule el área. El objeto debe tener un método area(). Crea dos clases: Rectángulo (con el método area) y Círculo (con el método area), y prueba la función con ambas. Luego, prueba con una clase Carro que no tenga el método area.
"""

import math

def calcular_area(objeto):
    if hasattr(objeto, 'area'):
        return objeto.area()
    else:
        print("Error: El objeto no tiene el método area.")
        return None

class Rectangulo:
    def __init__(self, largo, ancho):
        self.largo = largo
        self.ancho = ancho

    def area(self):
        return self.largo * self.ancho

class Circulo:
    def __init__(self, radio):
        self.radio = radio

    def area(self):
        return math.pi * self.radio ** 2

class Carro:
    def __init__(self, modelo):
        self.modelo = modelo

rectangulo = Rectangulo(5, 3)
circulo = Circulo(4)
carro = Carro("Toyota")

print(f"Área del rectángulo: {calcular_area(rectangulo)}")
print(f"Área del círculo: {calcular_area(circulo)}")
print(f"Área del carro: {calcular_area(carro)}")