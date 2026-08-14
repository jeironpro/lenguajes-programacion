""" Calculadora de operaciones básicas

Crea una clase Calculadora con un método operar que pueda realizar las siguientes operaciones según la cantidad de argumentos:

    · Con 2 argumentos: suma.
    · Con 3 argumentos: producto.
    · Con más de 3 argumentos: suma de todos los valores.
"""

class Calculadora:
    def operar(self, *args):
        if len(args) == 2:
            return f"La suma de los dos argunentos: {args[0] + args[1]}"
        elif len(args) == 3:
            return f"El producto de los tres argumentos: {args[0] * args[1] * args[2]}"
        elif len(args) > 3:
            return f"La suma de todos los argumentos: {sum(args)}"
        else:
            return "Error: Debe introducir al menos dos argumentos para operar." 

calculadora = Calculadora()

print(calculadora.operar(5, 3))
print(calculadora.operar(2, 3, 4))
print(calculadora.operar(1, 2, 3, 4, 5))
print(calculadora.operar(10)) 