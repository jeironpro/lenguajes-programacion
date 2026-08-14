# Crea dos funciones: una que use una variable local y otra que use una global. Imprime el valor de ambas.

variable_global = "Jeiron"

def es_global():
    global variable_global

    print(f"La variable global contiene: {variable_global}")

def es_local():
    variable_local = 21

    print(f"La variable local contiene: {variable_local}")

es_global()
es_local()