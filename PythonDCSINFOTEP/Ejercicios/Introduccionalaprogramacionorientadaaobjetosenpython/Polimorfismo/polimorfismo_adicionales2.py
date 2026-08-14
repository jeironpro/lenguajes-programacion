""" Polimorfismo con vehículos

· Crea una clase base llamada Vehiculo con el método mover(), que imprime "El vehículo se mueve".
    
· Crea dos clases hijas: Coche y Bicicleta. La clase Coche debe sobrescribir el método mover() para imprimir "El coche avanza", mientras que la clase Bicicleta debe imprimir "La bicicleta pedalea".

· Crea una función iniciar_viaje() que reciba un objeto Vehiculo y llame al método mover(), demostrando el polimorfismo.
"""

class Vehiculo:
    def mover(self):
        return "El vehículo se mueve"
    
class Coche(Vehiculo):
    def mover(self):
        return "El coche avanza"

class Bicicleta(Vehiculo):
    def mover(self):
        return "La bicicleta pedalea"
    
def iniciar_viaje(vehiculo):
    print(vehiculo.mover())

coche = Coche()
bicicleta = Bicicleta()

iniciar_viaje(coche)
iniciar_viaje(bicicleta)