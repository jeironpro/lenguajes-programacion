""" API de la NASA (Imagen del Día)

Usa la API de la NASA para obtener la imagen del día. La API proporciona imágenes del espacio junto con su descripción.

Pasos:
    1. Realiza una solicitud GET a https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY.

    2. Muestra el título y la URL de la imagen del día.
"""

import requests

def obtener_info_imagen_del_dia():
    url = 'https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY'

    response = requests.get(url)

    if response.status_code == 200:
        data = response.json()

        titulo_imagen = data.get('title', 'No disponible')
        url_imagen = data.get('url', 'No disponible')

        print(f"Título de la imagen del día: {titulo_imagen}")
        print(f"URL de la imagen: {url_imagen}")
    else:
        print("Error al obtener la imagen del día.")

obtener_info_imagen_del_dia()