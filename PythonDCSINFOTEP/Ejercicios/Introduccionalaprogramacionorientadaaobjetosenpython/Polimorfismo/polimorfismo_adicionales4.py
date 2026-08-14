""" Polimorfismo con empleados

· Crea una clase base llamada Empleado con el método trabajar(), que imprime "El empleado está trabajando".

· Crea dos clases hijas: Gerente y Programador. La clase Gerente debe sobrescribir el método trabajar() para imprimir "El gerente está supervisando", mientras que la clase Programador debe imprimir "El programador está desarrollando código".

· Crea una función mostrar_trabajo() que reciba un objeto Empleado y llame al método trabajar(), demostrando el polimorfismo.
"""

class Empleado:
    def trabajar(self):
        return "El empleado está trabajando"
    
class Gerente(Empleado):
    def trabajar(self):
        return "El gerente está supervisando"
    
class Programador(Empleado):
    def trabajar(self):
        return "El programador está desarrollando código"
    
def mostrar_trabajo(empleado):
    print(empleado.trabajar())

gerente = Gerente()
programador = Programador()

mostrar_trabajo(gerente)
mostrar_trabajo(programador)