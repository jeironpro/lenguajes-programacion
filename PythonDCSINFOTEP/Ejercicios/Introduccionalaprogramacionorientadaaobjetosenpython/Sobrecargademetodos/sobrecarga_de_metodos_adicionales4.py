""" Concatenación flexible

Crea una clase Concatenador con un método concatenar.

· Si se proporciona un argumento, retorna el mismo texto.

· Si se proporcionan dos argumentos, retorna la concatenación de ambos con un espacio en medio.

· Si se proporcionan más de dos argumentos, retorna la concatenación de todos separados por comas.
"""

class Concatenador:
    def concatenar(self, *args):
        if len(args) == 1:
            return args[0]
        elif len(args) == 2:
            return f"{args[0]} {args[1]}"
        elif len(args) > 2:
            return ", ".join(args)
        else:
            return "Error: No se proporcionaron argumentos."
        
concatenador = Concatenador()

print(concatenador.concatenar("Hola"))

print(concatenador.concatenar("Hola", "mundo"))

print(concatenador.concatenar("Este", "es", "un", "ejemplo"))

print(concatenador.concatenar())