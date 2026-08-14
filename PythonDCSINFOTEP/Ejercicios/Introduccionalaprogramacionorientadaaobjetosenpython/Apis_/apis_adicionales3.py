""" Consultar información de un usuario

Usa la API de GitHub para obtener información de un usuario. Realiza una solicitud GET al endpoint de GitHub para obtener los detalles de un usuario por su nombre de usuario.

Pasos:
    1. Pide al usuario ingresar un nombre de usuario de GitHub.

    2. Realiza una solicitud GET al endpoint https://api.github.com/users/{username}.

    3. Muestra el nombre completo y la cantidad de repositorios del usuario.
"""

import requests

def obtener_usuario_github():
    usuario = input("Ingresa el nombre de usuario de GitHub: ")
    url = f'https://api.github.com/users/{usuario}'

    response = requests.get(url)

    if response.status_code == 200:
        data = response.json()

        nombre_completo = data.get('name', 'No disponible')
        cantidad_repos = data.get('public_repos', 0)

        print(f"Nombre completo: {nombre_completo}")
        print(f"Cantidad de repositorios públicos: {cantidad_repos}")
    else:
        print("Usuario no encontrado o error en la solicitud.")

obtener_usuario_github()