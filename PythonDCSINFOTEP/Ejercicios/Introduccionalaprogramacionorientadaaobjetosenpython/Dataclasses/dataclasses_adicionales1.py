""" Definir una dataclass simple

Crea una dataclass llamada Libro que tenga los siguientes atributos: titulo, autor, y anio_publicacion. Luego, crea una instancia de esta clase y muestra los valores de los atributos.
"""

from dataclasses import dataclass

@dataclass
class Libro:
    titulo: str
    autor: str
    anio_publicacion: int

libro = Libro("Cien años de soledad", "Gabriel García Márquez", 1967)
print(f"Título: {libro.titulo}")
print(f"Autor: {libro.autor}")
print(f"Año de publicación: {libro.anio_publicacion}")