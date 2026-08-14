""" Empleado con un aumento de salario

· Crea una clase Empleado con los siguientes atributos privados:
    · nombre
    · salario

· Implementa los métodos getter y setter para estos atributos.

· Crea un método aumentar_salario() que aumente el salario en un porcentaje específico, pero asegúrate de que el salario no sea inferior a un valor mínimo (por ejemplo, 1000).
"""

class Empleado:
    def __init__(self, nombre, salario):
        self.__nombre = nombre
        self.__salario = salario

    def get_nombre(self):
        return self.__nombre
    
    def set_nombre(self, nombre):
        self.__nombre = nombre

    def get_salario(self):
        return self.__salario

    def set_salario(self, salario):
        if salario >= 1000:
            self.__salario = salario
        else:
            print("Error: El salario no puede ser inferior a 1000.")

    def aumentar_salario(self, porcentaje):
        aumento = self.__salario * (porcentaje / 100)
        nuevo_salario = self.__salario + aumento

        if nuevo_salario < 1000:
            self.__salario = 1000
        else:
            self.__salario = nuevo_salario

empleado = Empleado("Jeiron", 50000)

print(f"Salario de {empleado.get_nombre()}: {empleado.get_salario()}")

empleado.aumentar_salario(15)

print(f"Salaraio después del aumento: {empleado.get_salario()}")

empleado.set_salario(800)