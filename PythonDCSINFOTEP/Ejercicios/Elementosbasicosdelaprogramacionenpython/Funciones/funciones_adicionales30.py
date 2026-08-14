# Usa lambda para crear una función que calcule la longitud de una cadena.

cadena = input("Ingrese una palabra: ")

longitud_cadena = lambda c : len(c)

print(f"La longitud de la palabra es: {longitud_cadena(cadena)}")