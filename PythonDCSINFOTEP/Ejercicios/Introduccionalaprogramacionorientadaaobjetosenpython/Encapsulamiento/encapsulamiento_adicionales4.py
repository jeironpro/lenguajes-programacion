""" Clase de estudiante con validación de notas

· Crea una clase Estudiante con los siguientes atributos privados:
    · nombre
    · nota

· Implementa métodos getter y setter.

· En el setter de nota, asegúrate de que la nota esté entre 0 y 100. Si la nota está fuera de este rango, muestra un mensaje de error.
"""

class Estudiante:
    def __init__(self, nombre, nota=0):
        self.__nombre = nombre
        self.__nota = nota

    def get_nombre(self):
        return self.__nombre
    
    def set_nombre(self, nombre):
        self.__nombre = nombre
    
    def get_nota(self):
        return self.__nota
    
    def set_nota(self, nota):
        if nota >= 0 and nota <= 100:
            self.__nota = nota
        else:
            print("Error: La nota está fuera de rango.")
    
estudiante = Estudiante("Jeiron", 90)

print(f"El estudiante {estudiante.get_nombre()} obtuvo la nota de {estudiante.get_nota()}.")

estudiante.set_nota(101)

print(F"La nota después del intento de cambio: {estudiante.get_nota()}")