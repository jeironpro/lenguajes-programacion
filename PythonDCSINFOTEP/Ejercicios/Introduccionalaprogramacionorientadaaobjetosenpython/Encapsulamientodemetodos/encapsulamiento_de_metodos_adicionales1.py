""" Atributos privados y métodos getter/setter

Crea una clase Coche con el atributo privado __velocidad que representa la velocidad del coche. Implementa un método getter llamado get_velocidad() para obtener el valor de __velocidad y un método setter llamado set_velocidad() para actualizar la velocidad, asegurando que no pueda ser negativa. Luego, crea una instancia de Coche y prueba los métodos getter y setter.
"""

class Coche:
    def __init__(self, velocidad=0):
        self.__velocidad = velocidad

    def get_velocidad(self):
        return self.__velocidad
    
    def set_velocidad(self, velocidad):
        if velocidad >= 0:
            self.__velocidad = velocidad
        else:
            print("La velocidad debe ser mayor o igual a 0")

coche = Coche()

print(f"La velocidad inicial del coche es: {coche.get_velocidad()} km/h")

coche.set_velocidad(100)
print(f"La nueva velocidad del coche es: {coche.get_velocidad()} km/h")

coche.set_velocidad(-10)
print(f"Después de intentar establecer una velocidad negativa, la velocidad es: {coche.get_velocidad()} km/h")
