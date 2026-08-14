# Crea una tupla con los nombres de los meses del año. Solicita al usuario un número (1-12) e imprime el mes correspondiente.

meses = ("enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre")

numero_mes = int(input("Escriba el numero del mes: "))
print(meses[numero_mes-1])