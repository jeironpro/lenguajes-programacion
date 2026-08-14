""" Atributos privados con métodos getter y setter

· Crea una clase Coche con los siguientes atributos privados:
    · marca
    · modelo
    · año

· Implementa los métodos getter y setter para cada uno de estos atributos.

· Agrega una validación en el setter para el atributo año, asegurando que solo se pueda establecer un valor mayor que 1900.
"""

class Coche:
    def __init__(self, marca, modelo, anio):
        self.__marca = marca
        self.__modelo = modelo
        self.__anio = None
        self.set_anio(anio)

    def get_marca(self):
        return self.__marca
    
    def set_marca(self, marca):
        self.__marca = marca

    def get_modelo(self):
        return self.__modelo
    
    def set_modelo(self, modelo):
        self.__modelo = modelo
    
    def get_anio(self):
        return self.__anio
    
    def set_anio(self, anio):
        if anio > 1900:
            self.__anio = anio
        else:
            print("Error: El año debe ser mayor que 1900.")

mi_coche = Coche("Toyota", "Corolla", 2022)
print(f"Marca: {mi_coche.get_marca()}")
print(f"Modelo: {mi_coche.get_modelo()}")
print(f"Año: {mi_coche.get_anio()}")

mi_coche.set_anio(1900)

print(f"Año después del intento de cambio: {mi_coche.get_anio()}")