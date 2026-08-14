""" Inmutabilidad de la dataclass

Crea una dataclass llamada Punto que tenga los atributos x y y. Haz que la clase sea inmutable usando frozen=True. Intenta cambiar el valor de uno de los atributos después de crear la instancia y observa qué sucede.
"""
from dataclasses import dataclass

# Al establecer frozen en True la clase se convierte en inmutable
@dataclass(frozen=True)
class Punto:
    x: int
    y: int

punto1 = Punto(3, 4)

try:
    punto1.x = 5
except AttributeError as e:
    print(f"Error: {e}")