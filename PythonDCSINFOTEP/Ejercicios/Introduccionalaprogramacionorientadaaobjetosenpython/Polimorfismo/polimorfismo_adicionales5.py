""" Polimorfismo en dispositivos electrónicos

· Crea una clase base llamada Dispositivo con el método encender(), que imprime "El dispositivo se enciende".
    
· Crea dos clases hijas: Telefono y Computadora. La clase Telefono debe sobrescribir el método encender() para imprimir "El teléfono se enciende", mientras que la clase Computadora debe imprimir "La computadora se enciende".

· Crea una función activar_dispositivo() que reciba un objeto Dispositivo y llame al método encender(), demostrando el polimorfismo.
"""

class Dispositivo:
    def encender(self):
        return "El dispositivo se enciende"
    
class Telefono(Dispositivo):
    def encender(self):
        return "El teléfono se enciende"

class Computadora(Dispositivo):
    def encender(self):
        return "La computadora se enciende"

def activar_dispositivo(dispositivo):
    print(dispositivo.encender())

telefono = Telefono()
computadora = Computadora()

activar_dispositivo(telefono)
activar_dispositivo(computadora)