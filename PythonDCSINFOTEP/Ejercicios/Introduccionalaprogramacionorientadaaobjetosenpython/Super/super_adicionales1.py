""" Herencia con super()

Crea dos clases:

    · Vehiculo: tiene un método informacion que imprime "Este es un vehículo".
    
    · Coche: hereda de Vehiculo y redefine el método informacion para imprimir "Este es un coche". Utiliza super() para llamar al método informacion de la clase base.

Objetivo: Cuando crees un objeto de la clase Coche, el método informacion debe llamar a la clase base y luego imprimir información adicional de la clase derivada.
"""

class Vehiculo:
    def informacion(self):
        print("Este es un vehículo")
    
class Coche(Vehiculo):
    def informacion(self):
        super().informacion()
        print("Este es un coche")

coche = Coche()

coche.informacion()