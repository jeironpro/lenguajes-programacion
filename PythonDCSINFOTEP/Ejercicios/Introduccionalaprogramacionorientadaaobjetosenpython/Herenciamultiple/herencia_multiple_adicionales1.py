""" Dispositivos Electrónicos

Crea tres clases:

    · Dispositivo: tiene un método encender que imprime "Dispositivo encendido".
    
    · Portátil: tiene un método transportar que imprime "Portátil transportado".
    
    · Smartphone: hereda de ambas clases y agrega un método usar_red que imprime "Usando red móvil".
"""

class Dispositivo:
    def encender(self):
        print("Dispositivo encendido")

class Portatil:
    def transportar(self):
        print("Portátil transportado")

class Smartphone(Dispositivo, Portatil):
    def usar_red(self):
        print("Usando red móvil")

smartphone = Smartphone()

smartphone.encender()

smartphone.transportar()

smartphone.usar_red()