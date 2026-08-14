'''
Escribir un programa que pida al usuario su edad y lo clasifique en uno de los siguientes grupos:

- Menor de 18: "Niño"
- 18 a 35: "Joven"
- 36 a 60: "Adulto"
- Mayor de 60: "Adulto mayor"
'''

edad = int(input("¿Cuál es tu edad? "))
grupo = ""

if edad < 18:
    grupo = "niño"
elif edad >= 18 and edad <= 35:
    grupo = "joven"
elif edad >= 36 and edad <= 60:
    grupo = "adulto"
else:
    grupo = "adulto mayor"

print("Eres un", grupo)