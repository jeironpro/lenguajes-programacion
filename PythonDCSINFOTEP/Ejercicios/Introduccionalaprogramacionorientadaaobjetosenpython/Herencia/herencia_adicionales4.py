""" Herencia múltiple

· Crea dos clases base: Animal y Domestico. La clase Animal tiene un atributo especie y un método hacer_sonido(), mientras que la clase Domestico tiene un atributo nombre y un método jugar().

· Crea una clase hija llamada Perro que herede de ambas clases base (Animal y Domestico).

· En la clase Perro, sobrescribe el método hacer_sonido() y agrega una implementación propia para jugar().
"""

class Animal:
    def __init__(self, especie):
        self.especie = especie

    def hacer_sonido(self):
        return "El animal hace un sonido"

class Domestico:
    def __init__(self, nombre):
        self.nombre = nombre
    
    def jugar(self):
        return "El animal juega"

class Perro(Animal, Domestico):
    def __init__(self, especie, nombre):
        Animal.__init__(self, especie)
        Domestico.__init__(self, nombre)

    def hacer_sonido(self):
        return "¡Guau!"

    def jugar(self):
        return f"{self.nombre} está jugando con una pelota."

perro = Perro("Ladradora", "Coral")

print(f"{perro.nombre} de especie '{perro.especie}' dice: {perro.hacer_sonido()}")
print(f"{perro.jugar()}")