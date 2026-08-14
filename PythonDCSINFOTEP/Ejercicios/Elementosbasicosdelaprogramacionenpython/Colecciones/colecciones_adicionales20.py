'''
Usa dos conjuntos para guardar las letras de dos palabras ingresadas por el usuario. Imprime si las palabras son un anagrama o no (es decir, si contienen las mismas letras, sin importar el orden).
'''

palabra1 = input("Ingresa la primera palabra: ").lower()
palabra2 = input("Ingresa la segunda palabra: ").lower()

conjunto1 = set(palabra1)
conjunto2 = set(palabra2)

if conjunto1 == conjunto2:
    print("Las palabras son anagramas.")
else:
    print("Las palabras no son anagramas.")