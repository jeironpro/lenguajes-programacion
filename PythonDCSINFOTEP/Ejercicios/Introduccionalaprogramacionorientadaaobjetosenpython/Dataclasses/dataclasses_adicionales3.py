""" Campos con valor predeterminado

Crea una dataclass llamada Empleado con los siguientes atributos: nombre, salario (con valor predeterminado de 3000) y cargo. Crea dos objetos de la clase, uno especificando el salario y otro sin especificarlo (usando el valor predeterminado).
"""

from dataclasses import dataclass

@dataclass
class Empleado:
    nombre: str
    cargo: str
    salario: float = 3000

empleado1 = Empleado("Jeiron", "Programador", 50000)

empleado2 = Empleado("Junior", cargo="Gerente")

print(empleado1)

print(empleado2)