""" Acceso a elementos (__getitem__ y __setitem__)

Crea una clase Estanteria que almacene una lista de libros.

· Implementa el método __getitem__ para acceder a un libro en una posición específica.

· Implementa el método __setitem__ para reemplazar un libro en una posición específica.
"""

class Estanteria:
    def __init__(self):
        self.libros = []

    def agregar_libro(self, libro):
        self.libros.append(libro)

    def __getitem__(self, indice):
        return self.libros[indice]

    def __setitem__(self, indice, nuevo_libro):
        self.libros[indice] = nuevo_libro

    def __str__(self):
        return f"Estantería: {', '.join(self.libros)}"
    
estanteria = Estanteria()


estanteria.agregar_libro("El principito")
estanteria.agregar_libro("1984")
estanteria.agregar_libro("Cien años de soledad")

print(estanteria[1])

estanteria[1] = "Rebelión en la granja"
print(estanteria[1])

print(estanteria)