""" Función de saludo

Crea una función llamada saludar que reciba un objeto y llame a un método saludar() del objeto. Si el objeto tiene un método saludar, la función debe imprimir "Hola, [nombre]!". Si no tiene el método, debe imprimir un mensaje de error. Crea dos clases: Persona (con el método saludar) y ObjetoGenérico (sin el método saludar), y prueba la función con ambas.
"""

def saludar(objeto):
    if hasattr(objeto, 'saludar'):
        print(f"Hola, {objeto.saludar()}")
    else:
        print("Error: El objeto no tiene el método saludar.")

class Persona:
    def __init__(self, nombre):
        self.nombre = nombre

    def saludar(self):
        return self.nombre
    
class ObjetoGenérico:
    def __init__(self, descripcion):
        self.descripcion = descripcion

persona = Persona("Jeiron")
objeto_generico = ObjetoGenérico("Objeto sin saludo")

saludar(persona)
saludar(objeto_generico) 