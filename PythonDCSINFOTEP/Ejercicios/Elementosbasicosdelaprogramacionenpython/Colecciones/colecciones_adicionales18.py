# Escribe un programa que compare dos conjuntos de palabras ingresadas por el usuario y determine si tienen elementos en común o no.

conjunto1 = input("Ingresa el primer conjunto de palabras, separado por espacios: ").split()

conjunto2 = input("Ingresa el segundo conjunto de palabras, separado por espacios: ").split()

conjunto1 = set(conjunto1)
conjunto2 = set(conjunto2)

if conjunto1 & conjunto2:
    print("Los conjuntos tienen elementos en común:", conjunto1 & conjunto2)
else:
    print("Los conjuntos no tienen elementos en común.")