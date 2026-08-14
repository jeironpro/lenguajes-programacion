""" Uso de len() con un objeto (__len__)

Crea una clase Libro con los atributos titulo y num_paginas.

· Implementa el método __len__ para que la función len() aplicada a un objeto de tipo Libro devuelva el número de páginas.
"""

class Libro:
    def __init__(self, titulo, num_paginas):
        self.titulo = titulo
        self.num_paginas = num_paginas

    def __len__(self):
        return self.num_paginas
    
    def __str__(self):
        return f"Libro: '{self.titulo}' ({self.num_paginas} páginas)"
    
libro = Libro("El principito", 96)

print(len(libro))

print(libro)