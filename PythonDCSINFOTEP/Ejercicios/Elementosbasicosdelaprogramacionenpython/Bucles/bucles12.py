'''
Escribir un programa en el que se le pregunte al usuario por una frase y una letra, y muestre por pantalla el número de veces que aparece la letra en la frase.
'''

frase = input("Escriba una frase: ")
letra = input("Escriba una letra: ")
contador = 0

for i in range(len(frase)):
    if frase[i] == letra:
        contador += 1
print(f"La {letra} aparece {contador} en la frase.")