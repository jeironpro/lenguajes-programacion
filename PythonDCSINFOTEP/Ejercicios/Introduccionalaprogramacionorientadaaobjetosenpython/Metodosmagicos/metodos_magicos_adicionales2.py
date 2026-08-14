""" Operador de suma (__add__)

Crea una clase Vector que tenga dos atributos: x y y.

· Implementa el método __add__ para permitir la suma de dos objetos de tipo Vector.

· La suma de dos vectores debe dar como resultado un nuevo vector con la suma de sus coordenadas.
"""

class Vector:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def __add__(self, otro_vector):
        if not isinstance(otro_vector, Vector):
            raise TypeError("El operando debe ser una instancia de la clase Vector.")
        return Vector(self.x + otro_vector.x, self.y + otro_vector.y)
    
    def __str__(self):
        return f"Vector({self.x}, {self.y})"
    
vector1 = Vector(3, 4)
vector2 = Vector(1, 2)

sumar_vectores = vector1 + vector2

print(f"Primer vector: {vector1}")
print(f"Segundo vector: {vector2}")
print(f"Suma de los vectores: {sumar_vectores}")