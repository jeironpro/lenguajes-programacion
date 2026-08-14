'''
La pizzería Bella Napoli ofrece pizzas vegetarianas y no vegetarianas a sus clientes. Los ingredientes para cada tipo de pizza aparecen a continuación.

Ingredientes vegetarianos: pimiento y tofu.
Ingredientes no vegetarianos: peperoni, jamón y salmón.

Escribir un programa que pregunte al usuario si quiere una pizza vegetariana o no, y en función de su respuesta le muestre un menú con los ingredientes disponibles para que elija. Solo se puede elegir un ingrediente, además de la mozzarella y el tomate, que están en todas las pizzas. Al final, se debe mostrar por pantalla si la pizza elegida es vegetariana o no, y todos los ingredientes que lleva.
'''

print("Pizzería Bella Napoli")
pizza_vegetariana = input("¿Quieres una pizza vegetariana? (sí o no): ")

if pizza_vegetariana == "si":
    ingrediente = int(input("Elija el ingrediente que desea agregar:\n1-Pimiento\n2-Tofu\n:"))
    if ingrediente == 1:
        print("Tu pizza es vegetariana y sus ingredientes son Mozzarella + Tomate + Pimiento")
    elif ingrediente == 2:
        print("Tu pizza es vegetariana y sus ingredientes son Mozzarella + Tomate + Tofu")
    else:
        print("¡ERROR! El número introducido no se encuentra en el menú")
elif pizza_vegetariana == "no":
    ingrediente = int(input("Elija el ingrediente que desea agregar:\n1-Pepperoni\n2-Jamón\n3-Salmón\n:"))
    if ingrediente == 1:
        print("Tu pizza no es vegetariana y sus ingredientes son Mozzarella + Tomate + Pepperoni")
    elif ingrediente == 2:
        print("Tu pizza no es vegetariana y sus ingredientes son Mozzarella + Tomate + Jamón")
    elif ingrediente == 3:
        print("Tu pizza no es vegetariana y sus ingredientes son Mozzarella + Tomate + Salmón")
    else:
        print("¡ERROR! El número introducido no se encuentra en el menú")

