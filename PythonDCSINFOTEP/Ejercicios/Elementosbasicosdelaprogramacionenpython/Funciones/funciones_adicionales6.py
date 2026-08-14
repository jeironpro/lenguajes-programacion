# Crea una variable global y una variable local dentro de una función. Imprime ambas desde la función.

nombre = "Jeiron"

def variable_global_local():
    edad = 21
    global nombre

    return f"Hola {nombre}, tienes {edad} años de edad."

print(variable_global_local())