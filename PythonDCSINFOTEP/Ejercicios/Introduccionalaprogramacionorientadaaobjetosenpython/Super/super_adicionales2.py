""" Constructor con super()

Crea dos clases:

    · Empleado: tiene un método __init__ que inicializa nombre y edad y lo imprime.
    
    · Gerente: hereda de Empleado y añade un atributo departamento. Usa super() para llamar al constructor de Empleado y luego inicializa el atributo departamento.

Objetivo: Al crear un objeto de la clase Gerente, debe imprimir los valores de nombre, edad y departamento.
"""

class Empleado:
    def __init__(self, nombre, edad):
        self.nombre = nombre
        self.edad = edad
        print(f"Empleado: Nombre: {self.nombre} - Edad: {self.edad}")

class Gerente(Empleado):
    def __init__(self, nombre, edad, departamento):
        super().__init__(nombre, edad)
        self.departamento = departamento
        print(f"Gerente: Departamento = {self.departamento}")

gerente = Gerente("Jeiron", 45, "Ventas")