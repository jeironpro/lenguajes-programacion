""" Vehículos Terrestres y Acuáticos

Crea tres clases:

    · Vehiculo: con un método moverse que imprime "El vehículo se está moviendo".
    
    · Terrestre: con un método usar_ruedas que imprime "Usando ruedas".
    Anfibio: hereda de ambas y puede moverse y usar ruedas.
"""

class Vehiculo:
    def moverse(self):
        print("El vehículo se está moviendo")

class Terrestre:
    def usar_ruedas(self):
        print("Usando ruedas")

class Anfibio(Vehiculo, Terrestre):
    pass

coche = Anfibio()

coche.moverse()

coche.usar_ruedas()