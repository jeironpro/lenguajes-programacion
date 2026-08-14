# Filtra una lista de cadenas y devuelve solo aquellas que comiencen con la letra "A".

lista_palabras = []

palabras = input("Ingrese una lista de palabras separadas por coma: ")

for i in palabras.split(","):
    lista_palabras.append(i)

comienza_por_a = filter(lambda c: c[0].lower() == 'a', lista_palabras)

print(f"Las palabras de la lista que comienzan por 'a' son: {list(comienza_por_a)}")