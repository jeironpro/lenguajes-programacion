""" Animal con múltiples métodos abstractos

· Crea una clase abstracta llamada Animal que tenga dos métodos abstractos: hacer_sonido() y alimentarse().
    
· Crea dos clases hijas, Perro y Gato, que implementen ambos métodos (hacer_sonido() y alimentarse()) con un comportamiento específico para cada uno.
    
· Haz que las clases hijas impriman qué sonido hace el animal y qué come.
"""

from abc import ABC, abstractmethod

class Animal(ABC):
    @abstractmethod
    def hacer_sonido(self):
        pass

    @abstractmethod
    def alimentarse(self):
        pass

class Gato(Animal):
    def hacer_sonido(self):
        return "¡Miau!"
    
    def alimentarse(self):
        return "Purina"
    
class Perro(Animal):
    def hacer_sonido(self):
        return "¡Guau!"
    
    def alimentarse(self):
        return "Croquetas"
    
gato = Gato()
perro = Perro()

print(f"Mia dice {gato.hacer_sonido()}")
print(f"Mia come {gato.alimentarse()}")

print(f"Coral dice {perro.hacer_sonido()}")
print(f"Coral come {perro.alimentarse()}")