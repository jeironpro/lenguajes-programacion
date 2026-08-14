'''
Escribir una función que calcule el total de una factura tras aplicarle el ITBIS. La función debe recibir la cantidad sin ITBIS y el porcentaje de ITBIS a aplicar, y devolver el total de la factura. Si se invoca la función sin pasarle el porcentaje de ITBIS, deberá aplicar un 18%.
'''

def facturar(cantidad, itbis):
    return ((cantidad / 100) * itbis) + cantidad

cantidad = int(input("Ingrese la cantidad a pagar: "))
itbis = input("Ingrese el itbis a pagar: ")

if not itbis:
    itbis = 18

print(facturar(cantidad, int(itbis)))