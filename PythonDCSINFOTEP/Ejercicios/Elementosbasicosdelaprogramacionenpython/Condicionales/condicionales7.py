'''
Los tramos impositivos para la declaración de la renta en un determinado país son los siguientes:
- Menos de 10 000:         5%
- Entre 10 000 y 20 000:   15%
- Entre 20 000 y 35 000:   20%
- Entre 35 000 y 60 000:   30%
- Más de 60 000:           45%

Escribir un programa que pregunte al usuario su renta anual y muestre por pantalla el tipo impositivo que le corresponde.
'''

renta = int(input("De cuanto es su renta anual: RD$"))
impositivo = 0;

if renta < 10000:
    impositivo = 5
elif renta >= 10000 and renta < 20000:
    impositivo = 15
elif renta >= 20000 and renta < 35000:
    impositivo = 20
elif renta >= 35000 and renta <= 60000:
    impositivo = 30
else:
    impositivo = 45

print(f"Tu impositivo es de {impositivo}%")