# Define una función que reciba argumentos posicionales y de palabra clave, y los devuelva como una lista y un diccionario, respectivamente.

def separar_argumentos(*args, **kwargs):
    lista_args = list(args)
    
    diccionario_kwargs = kwargs
    
    return lista_args, diccionario_kwargs

lista, diccionario = separar_argumentos(1, 2, 3, nombre="Juan", edad=30)

print("Lista de argumentos posicionales:", lista)
print("Diccionario de argumentos con nombre:", diccionario)