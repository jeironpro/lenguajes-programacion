'''
Una juguetería tiene éxito en dos de sus productos: payasos y muñecas. Suele hacer ventas por correo y la empresa de logística les cobra por el peso de cada paquete, así que deben calcular el peso de los payasos y muñecas que saldrán en cada paquete a demanda. Cada payaso pesa 112g y cada muñeca 75g. Escribir un programa que lea el número de payasos y muñecas vendidos en el último pedido y calcule el peso total del paquete que será enviado.
'''

payasos = int(input("Número de payasos en el pedido: "))
muñecas = int(input("Número de muñecas en el pedido: "))

peso_payasos = payasos * 112
peso_muñecas = muñecas * 75

peso_total = peso_payasos + peso_muñecas
peso_paquete = peso_total / 1000

print(f"El peso total del paquete es {peso_paquete}kg")