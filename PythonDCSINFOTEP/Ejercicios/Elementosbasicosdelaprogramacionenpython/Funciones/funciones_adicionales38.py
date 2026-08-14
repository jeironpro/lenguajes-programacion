# Usa zip() para combinar dos listas, luego desempaqueta el resultado en dos variables y muestra los elementos.

estudiantes = ["Jeiron", "Junior"]
notas = [90, 100]

combinacion = zip(estudiantes, notas)

for estudiante, nota in combinacion:
    print(f"El estudiante {estudiante} tiene una nota de {nota}.")