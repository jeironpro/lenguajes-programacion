""" Operación aritmética

Crea una función llamada realizar_operacion que reciba dos objetos y realice la operación + entre ellos. Para ello, ambos objetos deben tener el método sumar(). Si uno de los objetos no tiene este método, debe imprimir un mensaje de error. Crea dos clases: Numero (con el método sumar) y Texto (sin el método sumar) para probar el código.
"""

def realizar_operacion(objeto1, objeto2):
    if hasattr(objeto1, 'sumar') and hasattr(objeto2, 'sumar'):
        resultado = objeto1.sumar(objeto2)
        print(f"El resultado de la operación es: {resultado}")
    else:
        print("Error: Uno o ambos objetos no tienen el método sumar.")

class Numero:
    def __init__(self, valor):
        self.valor = valor

    def sumar(self, otro_objeto):
        return self.valor + otro_objeto.valor
    
class Texto:
    def __init__(self, contenido):
        self.contenido = contenido

numero1 = Numero(5)
numero2 = Numero(10)
texto = Texto("Hola")

realizar_operacion(numero1, numero2)
realizar_operacion(numero1, texto)