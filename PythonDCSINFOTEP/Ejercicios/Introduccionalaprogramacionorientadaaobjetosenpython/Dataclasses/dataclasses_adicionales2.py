""" Comparar objetos

Crea dos instancias de la clase Persona con el mismo nombre y edad. Luego, compara los objetos usando == para verificar si son iguales. Haz lo mismo con dos objetos que tengan valores diferentes.
"""

from dataclasses import dataclass

@dataclass
class Persona:
    nombre: str
    edad: int

persona1 = Persona("Jeiron", 21)
persona2 = Persona("Junior", 22)

print(persona1 == persona2)

persona3 = Persona("JeyJey", 21)
persona4 = Persona("JeyJey", 21)

print(persona3 == persona4)