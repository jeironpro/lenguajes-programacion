""" Enviar datos a una API

Usa la API de JSONPlaceholder para crear un nuevo post. Utiliza el método POST para enviar datos como el título y el cuerpo del post.

Pasos:
    1. Pide al usuario que ingrese un título y un cuerpo para un post.
    
    2. Realiza una solicitud POST a https://jsonplaceholder.typicode.com/posts con los datos del post.
    
    3. Muestra la respuesta de la API, que debería contener el ID del nuevo post creado.
"""

import requests

def crear_post():
    titulo = input("Ingrese el título del post: ")
    cuerpo = input("Ingrese el cuerpo del post: ")

    datos = {
        "title": titulo,
        "cuerpo": cuerpo,
        "userId": 1
    }

    url = 'https://jsonplaceholder.typicode.com/posts'
    response = requests.post(url, json=datos)

    if response.status_code == 201:
        post_creado = response.json()
        print(f"Nuevo posrt creado con ID: {post_creado['id']}")
    else:
        print("Error al crear el post.")

crear_post()