""" Consumir la API de JSONPlaceholder

JSONPlaceholder es una API falsa para hacer pruebas. Usa su endpoint /posts para obtener los primeros 5 posts de los usuarios.

Pasos:
    1. Realiza una solicitud GET al endpoint https://jsonplaceholder.typicode.com/posts.

    2. Muestra los primeros 5 posts (puedes mostrar el título y el cuerpo del post).
"""

import requests

def obtener_posts():
    url = 'https://jsonplaceholder.typicode.com/posts'

    response = requests.get(url)

    if response.status_code == 200:
        posts = response.json()

        for i in range(5):
            post = posts[i]
            print(f"Post {i+1}:")
            print(f"Título: {post['title']}")
            print(f"Cuerpo: {post['body']}\n")
    else:
        print("Error al obtener los posts.")

obtener_posts()