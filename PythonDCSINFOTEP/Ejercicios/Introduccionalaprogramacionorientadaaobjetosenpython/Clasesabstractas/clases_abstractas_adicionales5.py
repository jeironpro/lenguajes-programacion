""" Clase Abstracta y Polimorfismo

· Define una clase abstracta InstrumentoMusical con el método abstracto tocar().

· Crea dos clases hijas, Guitarra y Piano, que implementen el método tocar().

· Crea una función llamada interpretar() que reciba una lista de objetos de tipo InstrumentoMusical y los haga "sonar", es decir, llame al método tocar() de cada instrumento.
"""

from abc import ABC, abstractmethod

class InstrumentoMusical(ABC):
    @abstractmethod
    def tocar(self):
        pass

class Guitarra(InstrumentoMusical):
    def tocar(self):
        return "Sonido de guitarra"

class Piano(InstrumentoMusical):
    def tocar(self):
        return "Sonido de piano"

def interpretar(instrumentos):
    for instrumento in instrumentos:
        print(instrumento.tocar())

guitarra = Guitarra()
piano = Piano()

instrumentos = [guitarra, piano]

interpretar(instrumentos)