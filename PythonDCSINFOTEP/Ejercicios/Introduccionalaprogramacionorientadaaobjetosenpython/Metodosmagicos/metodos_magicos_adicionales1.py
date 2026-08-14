""" Representación de objetos (__str__ y __repr__)

Crea una clase Persona con los atributos nombre, edad y profesion.

· Implementa el método __str__ para mostrar la información de la persona en un formato amigable.

· Implementa el método __repr__ para devolver una representación técnica del objeto.
"""

class Persona:
    def __init__(self, nombre, edad, profesion):
        self.nombre = nombre
        self.edad = edad
        self.profesion = profesion

    def __str__(self):
        return f"{self.nombre}, {self.edad} años, {self.profesion}"
    
    def __repr__(self):
        return f"Persona(nombre='{self.nombre}', edad={self.edad}, profesion='{self.profesion}')"

persona = Persona("Jeiron", 30, "Ingeniera de Software")

print(str(persona))

print(persona)

print(repr(persona))