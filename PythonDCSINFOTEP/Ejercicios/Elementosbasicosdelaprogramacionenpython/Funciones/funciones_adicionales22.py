# Usa filter() para obtener todas las palabras que tengan más de 4 letras de una lista de cadenas.

lista_palabras = []

palabras = input("Ingrese una lista de palabras separadas por coma: ")

for i in palabras.split(","):
    lista_palabras.append(i)

def cadena_mayor_a_4(palabra):
    if len(palabra) > 4:
        return palabra
    
resultado = filter(cadena_mayor_a_4, lista_palabras)
print(f"La(s) palabra(s) de la lista con más de 4 letras son: {list(resultado)}")