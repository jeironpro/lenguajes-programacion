""" Herencia Múltiple con super()

Crea tres clases:

    · Animal: tiene un método comer que imprime "Comiendo".
    
    · Mamifero: tiene un método mamar que imprime "Mamando".
    
    · Perro: hereda de Animal y Mamifero, y redefine el método comer para imprimir "El perro está comiendo". Usa super() para llamar al método comer de la clase base.

Objetivo: Cuando crees un objeto de la clase Perro, el método comer debe ejecutar el comportamiento de la clase base y luego mostrar el comportamiento adicional.
"""

class Animal:
    def comer(self):
        print("Comiendo")
    
class Mamifero:
    def mamar(self):
        print("Mamando")
    
class Perro(Animal, Mamifero):
    def comer(self):
        super().comer()
        print("El perro está comiendo")

coral = Perro()

coral.comer()