# Dada la tupla tupla = (3, 7, 2, 5, 8, 7, 3, 5, 7), encuentra cuántas veces aparece el número 7.

tupla = (3, 7, 2, 5, 8, 7, 3, 5, 7)

contador = 0
for i in tupla:
    if i == 7:
        contador+=1
print(contador)