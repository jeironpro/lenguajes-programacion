'''
Escribir un programa que almacene la cadena de caracteres "contraseña" en una variable, pregunte al usuario por la contraseña hasta que introduzca la contraseña correcta.
'''

contrasena = "contraseña"
contrasena_usuario = input("Introduzca la contraseña correcta: ")

while contrasena != contrasena_usuario:
    if contrasena != contrasena_usuario:
        print("Contraseña incorrecta.")
        contrasena_usuario = input("Introduzca nuevamente la contraseña: ")

print("La contraseña introducida es correcta.")