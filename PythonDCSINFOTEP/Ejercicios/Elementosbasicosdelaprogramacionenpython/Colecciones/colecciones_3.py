'''
Escribir un programa que almacene las asignaturas de un curso (por ejemplo: Matemáticas, Física, Química, Historia y Lengua) en una lista, pregunte al usuario la nota que ha sacado en cada asignatura, y después las muestre por pantalla con el mensaje "En <asignatura> has sacado <nota>", donde <asignatura> es cada una de las asignaturas de la lista y <nota> cada una de las correspondientes notas introducidas por el usuario.
'''

asignaturas = ["Matematicas", "Fisica", "Quimica", "Historia", "lengua"]
notas = []

for asignatura in asignaturas:
    nota = float(input(f"Introduce la nota que has sacado en {asignatura}: "))
    notas.append(nota)

for asignatura in range(len(asignaturas)):
    print(f"En {asignaturas[asignatura]} has sacado {notas[asignatura]}")