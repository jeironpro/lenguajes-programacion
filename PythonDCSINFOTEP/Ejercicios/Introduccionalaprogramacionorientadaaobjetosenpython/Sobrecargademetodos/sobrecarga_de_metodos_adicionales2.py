""" Mensajes personalizados

Crea una clase Saludo con un método saludar.

· Si se proporciona un argumento, muestra: "Hola, {nombre}".

· Si no se proporcionan argumentos, muestra: "Hola, mundo".

· Si se proporcionan dos argumentos, muestra: "Hola, {nombre} desde {lugar}".
"""

class Saludo:
    def saludar(self, *args):
        if len(args) == 1:
            return f"Hola, {args[0]}"
        elif len(args) == 0:
            return "Hola, mundo"
        elif len(args) == 2:
            return f"Hola, {args[0]} desde {args[1]}"
        else:
            return "Error: Número incorrecto de argumentos."

saludo = Saludo()

print(saludo.saludar("Jeiron"))
print(saludo.saludar("Jeiron", "Santiago"))
print(saludo.saludar())