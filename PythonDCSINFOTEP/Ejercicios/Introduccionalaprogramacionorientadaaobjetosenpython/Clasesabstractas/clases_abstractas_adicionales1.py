""" Crear una clase abstracta Vehículo

· Define una clase abstracta llamada Vehículo con un método abstracto moverse() y un método no abstracto detalles().

· Crea dos clases hijas, Coche y Bicicleta, que implementen el método moverse() de manera diferente (el coche puede "conducir" y la bicicleta puede "pedalear").

· La clase Vehículo debe tener un método detalles() que imprima la marca y el modelo del vehículo.
"""

from abc import ABC, abstractmethod

class Vehiculo(ABC):
    def __init__(self, marca, modelo):
        self.marca = marca
        self.modelo = modelo

    @abstractmethod
    def moverse(self):
        pass

    def detalle(self):
        return f"La marca del vehículo es {self.marca} y el modelo es {self.modelo}"

class Coche(Vehiculo):
    def moverse(self):
        return "El coche puede conducir"
    
class Bicicleta(Vehiculo):
    def moverse(self):
        return "La bicicleta puede pedalear"
    
coche = Coche("Toyota", "Corolla")
bicicleta = Bicicleta("Giant", "Escape 3")

print(coche.moverse())
print(coche.detalle())

print(bicicleta.moverse())
print(bicicleta.detalle())