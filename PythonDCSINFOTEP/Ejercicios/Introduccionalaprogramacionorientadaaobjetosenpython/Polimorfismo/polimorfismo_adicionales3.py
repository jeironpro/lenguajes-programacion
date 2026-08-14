""" Polimorfismo con animales

· Crea una clase base llamada Animal con el método hacer_sonido(), que será sobrescrito por las clases hijas.
    
· Crea tres clases hijas: Perro, Gato, y Vaca. Cada una debe sobrescribir el método hacer_sonido():
    · Perro: "¡Guau!"
    · Gato: "¡Miau!"
    · Vaca: "¡Muu!"

· Crea una función imprimir_sonido() que reciba un objeto Animal y llame al método hacer_sonido(), demostrando el polimorfismo en acción.
"""

class Animal:
    def hacer_sonido(self):
        pass

class Perro(Animal):
    def hacer_sonido(self):
        return "¡Guau!"
    
class Gato(Animal):
    def hacer_sonido(self):
        return "¡Miau!"

class Vaca(Animal):
    def hacer_sonido(self):
        return "¡Muu!"
    
def imprimir_sonido(animal):
    print(animal.hacer_sonido())

perro = Perro()
gato = Gato()
vaca = Vaca()

imprimir_sonido(perro)
imprimir_sonido(gato)
imprimir_sonido(vaca)