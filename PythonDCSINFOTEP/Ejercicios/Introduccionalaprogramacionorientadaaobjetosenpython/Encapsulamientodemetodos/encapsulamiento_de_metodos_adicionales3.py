""" Control de acceso con setters

Crea una clase Producto con el atributo privado __precio. Implementa un método setter que verifique que el precio no sea negativo y otro getter para obtener el valor del precio. Crea una instancia de la clase y prueba los métodos setter y getter para asegurarte de que el precio no pueda ser negativo.
"""

class Producto:
    def __init__(self, precio=0):
        self.__precio = 0
        self.set_precio(precio)

    def get_precio(self):
        return self.__precio
    
    def set_precio(self, precio):
        if precio > 0:
            self.__precio = precio
            print(f"El precio se ha establecido en {self.__precio}.")
        else:
            print("Error: El precio debe ser mayor a 0")

producto = Producto(100)
print(f"Precio: {producto.get_precio()}.")


producto.set_precio(50)
print(f"Nuevo precio: {producto.get_precio()}.")

producto.set_precio(-10)
print(f"Precio final: {producto.get_precio()}.")