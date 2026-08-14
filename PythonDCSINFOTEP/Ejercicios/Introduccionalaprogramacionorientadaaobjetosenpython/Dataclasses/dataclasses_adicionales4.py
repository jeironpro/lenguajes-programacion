""" Modificar datos con __post_init__

Crea una dataclass llamada Producto que tenga los atributos nombre, precio y cantidad. En el método __post_init__, verifica si la cantidad es 0 y muestra un mensaje indicando que el producto está agotado. Crea un producto con cantidad 0 y otro con cantidad mayor que 0 para probar el código.
"""

from dataclasses import dataclass

@dataclass
class Producto:
    nombre: str
    precio: float
    cantidad: int

    def __post_init__(self):
        if self.cantidad == 0:
            print(f"El producto {self.nombre} está agotando.")
        else:
            print(f"El producto {self.nombre} está disponible.")

producto1 = Producto("Teclado", 50.0, 0)

producto2 = Producto("Ratón", 30.0, 10)