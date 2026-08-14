""" Clase Abstracta para Producto

· Crea una clase abstracta llamada Producto con un método abstracto precio_final().

· Crea dos clases hijas, Electrodoméstico y Ropa, que implementen el método precio_final(). Los electrodomésticos deben agregar un 18% del ITBIS al precio base y la ropa debe aplicar un descuento del 5%.

· Define los precios base en cada clase y calcula el precio final después de aplicar los ajustes.
"""

from abc import ABC, abstractmethod

class Producto(ABC):
    @abstractmethod
    def precio_final(self):
        pass

class Electrodoméstico(Producto):
    def __init__(self, precio, itbis=18):
        self.precio = precio
        self.itbis = itbis

    def precio_final(self):
        return self.precio + (self.precio * (self.itbis / 100))

class Ropa(Producto):
    def __init__(self, precio, descuento=5):
        self.precio = precio
        self.descuento = descuento

    def precio_final(self):
        return self.precio * (1 - self.descuento / 100)
    
mueble = Electrodoméstico(100)
abrigo = Ropa(50)

print(f"EL precio final del electrodoméstico es: ${mueble.precio_final():.2f}")
print(f"El precio final de la ropa es: ${abrigo.precio_final():.2f}")