# Usa un diccionario para contar cuántas veces aparece cada palabra en la frase: "El sol brilla pero el sol se oculta también".

frase = "El sol brilla pero el sol se oculta también"
palabras = frase.lower().split()

contador_palabras = {}

for palabra in palabras:
    if palabra in contador_palabras:
        contador_palabras[palabra] += 1
    else:
        contador_palabras[palabra] = 1

print("Contador de palabras:")
for palabra, cantidad in contador_palabras.items():
    print(f"{palabra}: {cantidad}")