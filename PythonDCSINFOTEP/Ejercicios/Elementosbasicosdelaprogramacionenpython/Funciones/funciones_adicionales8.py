# Modifica una variable global desde dentro de una función utilizando la palabra clave global.

nombre = "Jeiron"

def modificar_variable_global():
    global nombre
    nombre = nombre.upper()

    return nombre

print(modificar_variable_global())