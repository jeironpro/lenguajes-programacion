'''
Los alumnos de un curso se han dividido en dos grupos, A y B, de acuerdo con el sexo y el nombre. El grupo A está formado por las mujeres con un nombre anterior a la M y los hombres con un nombre posterior a la N, y el grupo B por el resto. Escribir un programa que pregunte al usuario su nombre y sexo, y muestre por pantalla el grupo correspondiente.
'''

nombre = input("Introduce tu nombre: ")
sexo = input("Introduce tu sexo (M para masculino, F para femenino): ").upper()

primera_letra = nombre[0].upper()

if primera_letra < "M" and sexo == "F":
    print("Tú eres del grupo A")
elif primera_letra > "N" and sexo == "M":
    print("Tú eres del grupo A")
else:
    print("Tú eres del grupo B")