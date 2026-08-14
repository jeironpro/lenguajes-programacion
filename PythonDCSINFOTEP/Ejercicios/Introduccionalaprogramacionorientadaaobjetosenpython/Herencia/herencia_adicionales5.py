""" Clase abstracta y herencia

· Crea una clase abstracta InstrumentoMusical con el método abstracto tocar().

· Crea dos clases hijas: Piano y Guitarra, ambas deben implementar el método tocar().
    
· La clase Piano debe imprimir "Tocando el piano", y la clase Guitarra debe imprimir "Tocando la guitarra".
    
· Crea una función interpretar_musica() que reciba una lista de objetos InstrumentoMusical y llame al método tocar() de cada instrumento.
"""

from abc import ABC, abstractmethod

class InstrumentoMusical(ABC):
    @abstractmethod
    def tocar(self):
        pass

class Piano(InstrumentoMusical):
    def tocar(self):
        print("Tocando el piano")

class Guitarra(InstrumentoMusical):
    def tocar(self):
        print("Tocando la guitarra")

def interpretar_musica(instrumentos):
    for instrumento in instrumentos:
        instrumento.tocar()

piano = Piano()
guitarra = Guitarra()

instrumentos = [piano, guitarra]

interpretar_musica(instrumentos)