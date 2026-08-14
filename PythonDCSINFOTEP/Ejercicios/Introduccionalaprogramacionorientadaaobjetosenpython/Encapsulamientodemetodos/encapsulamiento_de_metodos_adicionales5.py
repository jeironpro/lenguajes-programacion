""" Encapsulamiento con métodos especiales

Crea una clase Producto con el atributo privado __precio. Implementa el método especial __str__() para que, al imprimir un objeto de tipo Producto, se muestre el precio en un formato adecuado. Asegúrate de que el precio sea privado y no se acceda directamente desde fuera de la clase.
"""

class Producto:
    def __init__(self, precio):
        if precio < 0:
            raise ValueError("El precio no puede ser negativo.")
        self.__precio = precio
    
    def get_precio(self):
        return self.__precio
    
    def set_precio(self, precio):
        if precio < 0:
            raise ValueError("El precio no puede ser negativo.")
        self.__precio = precio

    def __str__(self):
        return f"Precio del producto: ${self.__precio:.2f}"

producto = Producto(199.99)

print(producto)

producto.set_precio(249.99)

print(producto)