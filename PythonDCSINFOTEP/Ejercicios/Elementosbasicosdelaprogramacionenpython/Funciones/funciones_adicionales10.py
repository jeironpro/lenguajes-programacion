# Define una variable dentro de una función y otra fuera de la función. Llama a la función y muestra el valor de ambas variables.


def variables():
    nombre = "Jeiron"
    return nombre

edad = 21
print(f"Hola {variables()}, tienes {edad} años de edad.")