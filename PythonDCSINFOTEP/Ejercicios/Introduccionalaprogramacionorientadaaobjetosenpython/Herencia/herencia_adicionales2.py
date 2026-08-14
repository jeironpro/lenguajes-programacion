""" Herencia con métodos adicionales

· Crea una clase base Empleado con los siguientes atributos:
    · nombre
    · edad
    · salario
· Crea un método detalles() que imprima el nombre, edad y salario.
    
· Crea dos clases hijas: Gerente y Tecnico. La clase Gerente debe tener un atributo adicional equipo (el equipo que dirige), mientras que Tecnico debe tener un atributo adicional especialidad (especialidad del técnico).

· Ambos deben sobrescribir el método detalles() para incluir la información extra correspondiente.
"""

class Empleado:
    def __init__(self, nombre, edad, salario):
        self.nombre = nombre
        self.edad = edad
        self.salario = salario

    def detalles(self):
        return f"EL empleado {self.nombre} tiene {self.edad} años de edad y cobra un salario de {self.salario}."

class Gerente(Empleado):
    def __init__(self, nombre, edad, salario, equipo):
        super().__init__(nombre, edad, salario)
        self.equipo = equipo

    def detalles(self):
        return f"{super().detalles()} Dirige el equipo {self.equipo}"

class Tecnico(Empleado):
    def __init__(self, nombre, edad, salario, especialidad):
        super().__init__(nombre, edad, salario)
        self.especialidad = especialidad
    
    def detalles(self):
        return f"{super().detalles()} Su especialidad es {self.especialidad}"
    
gerente = Gerente("Jeiron", 23, 50000, "Programadores")
tecnico = Tecnico("Junior", 21, 30000, "Programador")

print(gerente.detalles())
print(tecnico.detalles())