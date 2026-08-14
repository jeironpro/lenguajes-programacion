""" Herencia en vehículos

· Crea una clase base llamada Vehículo con los atributos:
    · marca
    · modelo
    · año

· Crea un método llamado descripcion() que imprima una descripción del vehículo (marca, modelo y año).

· Crea dos clases hijas: Coche y Moto. Ambas deben heredar de Vehículo y agregar un atributo adicional:
    · Coche: puertas (número de puertas)
    · Moto: cilindrada (cilindrada del motor)

· Modifica el método descripcion() en las clases hijas para incluir la información específica de cada vehículo (puertas para el coche, cilindrada para la moto).
"""

class Vehiculo:
    def __init__(self, marca, modelo, anio):
        self.marca = marca
        self.modelo = modelo
        self.anio = anio

    def descripcion(self):
        return f"La marca del vehículo es {self.marca}, el modelo es {self.modelo} y el año {self.anio}"

class Coche(Vehiculo):
    def __init__(self, marca, modelo, anio, puertas):
        super().__init__(marca, modelo, anio)
        self.puertas = puertas

    def descripcion(self):
        return f"{super().descripcion()}, tiene {self.puertas} puertas"

class Moto(Vehiculo):
    def __init__(self, marca, modelo, anio, cilindrada):
        super().__init__(marca, modelo, anio)
        self.cilindrada = cilindrada

    def descripcion(self):
        return f"{super().descripcion()}, tiene una cilindrada de {self.cilindrada}"
        
coche = Coche("Toyota", "Corolla", 2020, 4)
moto = Moto("Yamaha", "R1", 2022, 1000)

print(coche.descripcion())
print(moto.descripcion())