""" Comparación de objetos (__eq__ y __lt__)

Crea una clase Producto con los atributos nombre y precio.

· Implementa el método __eq__ para comparar dos productos por su nombre.

· Implementa el método __lt__ para comparar dos productos por su precio (menor precio).
"""

class Producto:
    def __init__(self, nombre, precio):
        self.nombre = nombre
        self.precio = precio

    def __eq__(self, otro):
        if isinstance(otro, Producto):
            return self.nombre == otro.nombre
        return False
    
    def __lt__(self, otro):
        if isinstance(otro, Producto):
            return self.precio < otro.precio
        return NotImplemented
    
    def __str__(self):
        return f"{self.nombre} - RD${self.precio:.2f}"
    
producto1 = Producto("Manzana", 15)
producto2 = Producto("Manzana", 20)
producto3 = Producto("Banana", 10)

print(producto1 == producto2)
print(producto1 == producto3)

print(producto3 < producto1)
print(producto1 < producto2) 

print(producto1)
print(producto2)
print(producto3)