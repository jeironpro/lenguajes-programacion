'''
Crea un diccionario llamado persona que contenga las claves nombre, edad y ciudad. Solicita al usuario que ingrese valores para cada clave e imprime el diccionario resultante.
'''

persona = {
    "nombre": "",
    "edad": "",
    "ciudad": ""
}

persona["nombre"] = input("Ingrese su nombre: ")
persona["edad"] = int(input("Ingrese su edad: "))
persona["ciudad"] = input("Ingrese su ciudad: ")
print(persona)
