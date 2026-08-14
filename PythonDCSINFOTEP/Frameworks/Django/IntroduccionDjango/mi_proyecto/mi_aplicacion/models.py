from django.db import models

# Crea tus modelos aqui.
class Usuario(models.Model):
        nombre = models.CharField(max_length=100) # Campo de texto con longitud máxima de 100
        email = models.EmailField(unique=True) # Campo correo electrónico único
        edad = models.IntegerField() # Campo para enteros

        def __str__(self):
            return self.nombre # Devuelve el nombre del usaurio al representarlo como texto