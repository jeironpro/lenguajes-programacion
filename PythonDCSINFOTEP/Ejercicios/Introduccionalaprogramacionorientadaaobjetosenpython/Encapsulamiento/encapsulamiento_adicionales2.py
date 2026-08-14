""" Control de acceso a edad

· Crea una clase Empleado con los siguientes atributos privados:
    · nombre
    · edad
    · salario

· Implementa los métodos getter y setter para cada atributo.

· En el setter de edad, asegúrate de que no se pueda establecer un valor menor que 18.

· En el setter de salario, asegúrate de que el salario no sea negativo.
"""

class Empleado:
    def __init__(self, nombre, edad, salario):
        self.__nombre = nombre
        self.__edad = edad
        self.__salario = salario

    def get_nombre(self):
        return self.__nombre
    
    def set_nombre(self, nombre):
        self.__nombre = nombre

    def get_edad(self):
        return self.__edad
    
    def set_edad(self, edad):
        if edad >= 18:
            self.__edad = edad
        else:
            print("Debe ser mayor de edad.")

    def get_salario(self):
        return self.__salario
    
    def set_salario(self, salario):
        self.__salario = salario

empleado = Empleado("Jeiron", 21, 50000)

print(f"Nombre: {empleado.get_nombre()}")
print(f"Edad: {empleado.get_edad()}")
print(f"Salario: {empleado.get_salario()}")

empleado.set_edad(17)

print(f"Edad después del intento de cambio: {empleado.get_edad()}")