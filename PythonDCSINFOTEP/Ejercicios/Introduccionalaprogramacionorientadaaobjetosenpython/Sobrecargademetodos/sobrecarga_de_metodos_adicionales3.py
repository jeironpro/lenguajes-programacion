""" Cálculo de áreas

Crea una clase Figura con un método area.

· Si se proporciona un argumento, calcula el área de un cuadrado (lado * lado).

· Si se proporcionan dos argumentos, calcula el área de un rectángulo (base * altura).

· Si se proporcionan tres argumentos, calcula el área de un prisma rectangular (base * altura * profundidad).
"""

class Figura:
    def area(self, *args):
        if len(args) == 1:
            return args[0] ** 2
        elif len(args) == 2:
            return args[0] * args[1]
        elif len(args) == 3:
            return args[0] * args[1] * args[2]
        else:
            return "Error: Número incorrecto de argumentos."
        
figura = Figura()

print(f"Área de un cuadrado (lado 4): {figura.area(4)}")

print(f"Área de un rectángulo (base 5, altura 3): {figura.area(5, 3)}")

print(f"Área de un prisma rectangular (base 4, altura 3, profundidad 2): {figura.area(4, 3, 2)}")

print(figura.area(1, 2, 3, 4))