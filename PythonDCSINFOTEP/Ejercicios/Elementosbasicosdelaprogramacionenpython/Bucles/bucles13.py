# Escribir un programa que muestre el eco de todo lo que el usuario introduzca hasta que el usuario escriba "salir", lo que terminará el programa. 

palabra = input("El eco espera palabra (o escribe 'salir' para terminar): ")

while palabra != "salir":
    print("El eco repite palabra", palabra)
    palabra = input("El eco espera palabra (o escribe 'salir' para terminar): ")
print("Ádios")