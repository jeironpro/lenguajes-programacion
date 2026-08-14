""" Conversión de temperaturas

Crea una clase Temperatura con un método convertir.

· Si se proporcionan 2 argumentos: convierte de una unidad a otra (por ejemplo, Celsius a Fahrenheit).

· Si se proporciona 1 argumento: considera que la conversión es de Celsius a Kelvin.

Fórmulas:
    · De Celsius a Fahrenheit: (°C * 9/5) + 32.
    · De Celsius a Kelvin: °C + 273.15.
"""

class Temperatura:
    def convertir(self, *args):
        if len(args) == 2:
            celsius = args[0]
            if args[1].lower() == "fahrenheit":
                return (celsius * 9 / 5) + 32
            else:
                return "Unidad no reconocida para la conversión a Fahrenheit."
        elif len(args) == 1:
            celsius = args[0]
            return celsius + 273.15
        else:
            return "Error: Debe proporcionar al menos un argumento para la conversión."

temperatura = Temperatura()

print(f"25°C a Kelvin: {temperatura.convertir(25)} K")

print(f"25°C a Fahrenheit: {temperatura.convertir(25, 'fahrenheit')} °F")

print(f"100°C a Kelvin: {temperatura.convertir(100)} K")

print(f"0°C a Fahrenheit: {temperatura.convertir(0, 'fahrenheit')} °F")
