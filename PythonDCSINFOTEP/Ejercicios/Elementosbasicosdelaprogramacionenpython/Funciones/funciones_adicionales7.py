# Define una variable dentro de una función y muestra su valor fuera de la función. ¿Qué ocurre?

def variable_local():
    nombre = "Jeiron"
    print(f"La variable dentro de la función -> {nombre}")

variable_local()
# print(f"La variable fuera de función -> {nombre}") # Obtiene el error -> NameError: name 'nombre' is not defined, porque la variable está en el ámbito local de la función y no se puede acceder a ella fuera de la función.