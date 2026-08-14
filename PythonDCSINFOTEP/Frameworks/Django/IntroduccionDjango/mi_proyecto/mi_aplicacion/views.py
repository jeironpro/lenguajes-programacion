from django.http import HttpResponse

# Crea tus vistas aqui
def hola_mundo(request):
    return HttpResponse("¡Hola, mundo desde mi primera aplicación Django!")