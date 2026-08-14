""" Empleados y Estudiantes

Crea tres clases:

    · Persona: tiene un atributo nombre y un método presentarse que imprime "Hola, soy {nombre}".
    
    · Empleado: tiene un método trabajar que imprime "Estoy trabajando".
    
    · Estudiante: hereda de ambas clases y puede presentarse, trabajar y estudiar.
"""

class Persona:
    def __init__(self, nombre):
        self.nombre = nombre

    def presentarse(self):
        print(f"Hola, soy {self.nombre}")
    
class Empleado:
    def trabajar(self):
        print("Estoy trabajando")

class Estudiante(Persona, Empleado):
    def estudiar(self):
        print("Estoy estudiando")

estudiante = Estudiante("Jeiron")

estudiante.presentarse()

estudiante.trabajar()

estudiante.estudiar()