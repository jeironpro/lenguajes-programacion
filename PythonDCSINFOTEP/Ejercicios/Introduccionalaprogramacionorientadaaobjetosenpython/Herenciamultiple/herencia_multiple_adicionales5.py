""" Electrodomésticos

Crea tres clases:

    · Electrodomestico: tiene un método usar que imprime "Usando electrodoméstico".
    
    · Refrigerador: tiene un método enfriar que imprime "Enfriando alimentos".
    
    · Lavadora: tiene un método lavar que imprime "Lavando ropa".

· Crea una clase Combi que herede de Refrigerador y Lavadora.
"""

class Electrodomestico:
    def usar(self):
        print("Usando electrodoméstico")

class Refrigerador(Electrodomestico):
    def enfriar(self):
        print("Enfriando alimentos")

class Lavadora(Electrodomestico):
    def lavar(self):
        print("Lavando ropa")

class Combi(Refrigerador, Lavadora):
    pass

combi = Combi()

combi.usar()

combi.enfriar()

combi.lavar()