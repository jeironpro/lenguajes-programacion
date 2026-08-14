# Escribir un programa que pregunte al usuario su edad y el año actual, y luego muestre por pantalla todos los años que ha cumplido, desde el primero hasta el año actual.

edad = int(input("Escriba su edad: "))
anio_actual = int(input("Escriba el año actual: "))
anio_actual_tmp = anio_actual 
anio_actual = anio_actual - edad

for i in range(0, edad):
    if i == 0:
        print(f"Has nacido en el {anio_actual}")
    else:
        anio_actual += 1
        print(f"En el {anio_actual} tenias {i}")

        if anio_actual == anio_actual_tmp-1:
            print(f"En el año actual {anio_actual_tmp} tienes o tendrás {i+1}")