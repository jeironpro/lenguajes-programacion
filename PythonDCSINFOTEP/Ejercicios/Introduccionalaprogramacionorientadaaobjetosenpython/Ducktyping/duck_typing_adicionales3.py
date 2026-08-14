""" Reproducción de sonido

Crea una función llamada reproducir_sonido que reciba un objeto y lo haga "sonar". Si el objeto tiene el método hacer_sonido(), la función debe llamarlo. Crea dos clases: Guitarra (con el método hacer_sonido) y Tambor (con el método hacer_sonido), y prueba la función con ambas. También prueba con una clase Silla que no tenga el método hacer_sonido.
"""

def reproducir_sonido(objeto):
    if hasattr(objeto, 'hacer_sonido'):
        objeto.hacer_sonido()
    else:
        print("Error: El objeto no tiene el método hacer_sonido.")

class Guitarra:
    def hacer_sonido(self):
        print("La guitarra está sonando: ¡Strum strum!")

class Tambor:
    def hacer_sonido(self):
        print("El tambor está sonando: ¡Boom boom!")

class Silla:
    def __init__(self):
        print("Soy una silla, no hago sonido.")

guitarra = Guitarra()
tambor = Tambor()
silla = Silla()

reproducir_sonido(guitarra)
reproducir_sonido(tambor)
reproducir_sonido(silla) 