""" super() en Herencia Múltiple con Métodos

Crea tres clases:

    · Persona: tiene un método saludar que imprime "Hola, soy una persona".
    
    · Estudiante: tiene un método estudiar que imprime "Estoy estudiando".
    
    · EstudianteDeIngenieria: hereda de Persona y Estudiante, y redefine el método saludar para imprimir "Hola, soy un estudiante de ingeniería". Usa super() para llamar al método saludar de la clase base.

Objetivo: Cuando crees un objeto de la clase EstudianteDeIngenieria, el método saludar debe mostrar el saludo adecuado, llamando a las clases base.
"""

class Persona:
    def saludar(self):
        print("Hola, soy una persona")

class Estudiante:
    def estudiar(self):
        print("Estoy estudiando")

class EstudianteDeIngenieria(Persona, Estudiante):
    def saludar(self):
        super().saludar()
        print("Hola, soy un estudiante de ingeniería")

estudiante = EstudianteDeIngenieria()

estudiante.saludar()