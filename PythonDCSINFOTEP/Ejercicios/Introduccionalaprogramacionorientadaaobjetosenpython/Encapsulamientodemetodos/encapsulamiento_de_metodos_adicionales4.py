""" Herencia y encapsulamiento

Crea una clase base Empleado con el atributo privado __nombre y un método público mostrar_nombre() que devuelva el nombre del empleado. Luego, crea una clase derivada Gerente que herede de Empleado y tenga el atributo privado __departamento. Implementa un método público mostrar_departamento() que devuelva el departamento del gerente. Asegúrate de que el atributo __nombre siga siendo privado en la clase base y no pueda ser modificado directamente desde la clase derivada.
"""

class Empleado:
    def __init__(self, nombre):
        self.__nombre = nombre
    
    def mostrar_nombre(self):
        return self.__nombre
    
class Gerente(Empleado):
    def __init__(self, nombre, departamento):
        super().__init__(nombre)
        self.__departamento = departamento

    def mostrar_departamento(self):
        return self.__departamento

gerente = Gerente("Jeiron", "Recursos Humanos")

print(f"Nombre del gerente: {gerente.mostrar_nombre()}")

print(f"Departamento del gerente: {gerente.mostrar_departamento()}")