'''
Escribir un programa para una empresa que tiene salas de juegos para todas las edades y quiere calcular de forma automática el precio que debe cobrar a sus clientes por entrar. El programa debe preguntar al usuario la edad del cliente y mostrar el precio de la entrada. Si el cliente es menor de 4 años, puede entrar gratis; si tiene entre 4 y 18 años, debe pagar 5 dólares; y si es mayor de 18, debe pagar 10 dólares.
'''

edad = int(input("¿Cuál es la edad del cliente? "))

if edad < 4:
    print("El cliente entra gratis")
elif edad >= 4 and edad <= 18:
    print("El cliente debe pagar 5$")
else:
    print("El cliente debe pagar 10$")
