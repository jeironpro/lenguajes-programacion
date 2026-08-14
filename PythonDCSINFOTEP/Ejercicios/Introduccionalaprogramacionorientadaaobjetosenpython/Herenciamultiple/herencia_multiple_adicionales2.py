""" Animales con habilidades

Crea tres clases:

    · Animal: tiene un método comer que imprime "Este animal está comiendo".
    
    · Volador: tiene un método volar que imprime "Este animal puede volar".
    
    · PezVolador: hereda de ambas y puede comer y volar.
"""

class Animal:
    def comer(self):
        print("Este animal está comiendo")

class Volador:
    def volar(self):
        print("Este animal puede volar")

class PezVolador(Animal, Volador):
    pass

pez_volador = PezVolador()

pez_volador.comer()

pez_volador.volar()