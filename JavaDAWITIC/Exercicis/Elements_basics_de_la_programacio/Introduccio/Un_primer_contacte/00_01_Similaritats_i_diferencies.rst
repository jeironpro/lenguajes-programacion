.. Enunciat

.. Acabem de veure un mateix programa escrit amb diferents llenguatges de programació.

.. Si bé és possible que encara no sàpigues ben bé què és un programa ni què són els llenguatges de programació, potser sí seràs capaç d'extreure'n unes primeres conclusions d'aquests codis.

.. Obre un document de text, sigui un LibreOffice Doc, un pdf, o un fitxer de text pla (ex. .txt).

.. Al document inclou les següents seccions:

..     Títol: el nom de l'exercici

..     Autoria: el teu nom complet i la data en que realitzes l'exercici

..     Introducció: una secció en que descriguis el context i contingut del document. Per exemple, hi podries indicar que es tracta d'un exercici en que compares la realització d'un mateix programa escrit en diferents llenguatges de programació, i quin és l'objectiu general que creus que persegueix l'exercici.

..     Una secció per cada pregunta. Et proposo que copiïs l'enunciat i després hi contestis, de manera que puguis llegir la pregunta i tot seguit la resposta. Potser podràs distingir d'alguna manera què és la pregunta i què la resposta (ex. posant l'enunciat en cursiva)

..     Opcionalment (però molt recomanable) una secció de conclusions on descriguis què has aprés en completar l'exercici, quines idees t'ha inspirat, quines qüestions t'ha suscitat…

.. Aquesta estructura de document la podràs fer servir per la resta d'exercicis que requereixin un document de text.

.. Nota: si et veus amb temps, et proposo que intentis escriure-ho fent servir la notació de reStructurreStructuredText.
.. Preguntes

.. Intenta contestar les següents preguntes el millor que et sigui possible.
.. Pregunta 1. Què fa el programa?

.. Quin és el problema que pretén resoldre el programa, independentment de amb quin llenguatge estigui escrit?
.. Pregunta 2. Elements comuns

.. Fixa't que els diferents llenguatges tenen maneres diferents d'expressar les passes a realitzar per portar a terme la resolució del problema.

.. Amb tot, si mirem amb atenció, trobem que hi ha elements que es repeteixen a totes (o quasi totes) les versions.

.. Identifica'ls i descriu-los.
.. Pregunta 3. Entrada/sortida

.. El programa, en les seves diferents versions, ha de demanar un valor als seus usuaris i escriure un resultat.

.. Indica, per cada llenguatge, de quina manera obté la dada i de quina manera mostra el resultat

.. Per exemple:

.. En pseudocodi, l'entrada l'obté amb llegeix radi i el resultat el mostra amb escriu "L'àrea és ", àrea"
.. Pregunta 4. Variables

.. Hi ha un tipus d'element que apareix a totes les versions, que es coneix com a variable. Les variables serveixen als programes per poder referir-se als diferents valors que han de manegar. Un exemple d'aquestes variables és area.

.. Hi trobes més exemples? Quins?
.. Pregunta 5. Preferència

.. Potser és molt d'hora, però, així a primera vista, quin dels llenguatges que et presento, veus més interessant? Perquè?
.. Realització i lliurament

.. Per realitzar l'exercici, primer avisa a prgtesrt que l'inicies:

.. cd ~/introprg

.. prgtest init 00_01

.. Ara segueix les passes que t'indica per crear i canviar a la carpeta de l'exercici.

.. Un cop allà, col·loca-hi el fitxer amb la teva resposta.

.. Un cop finalitzat, registra els canvis al control de versions i puja'ls a GitHub:

.. git add --all

.. git commit -am "Completat l'exercici 00_01"

.. git push

.. Pots comprovar que tot està correcte, mirant directament a l'aplicació Web de GitHub.

.. Nota: En realitat no cal que facis un push per cada exercici que finalitzis. Ho pots fer només en finalitzar la teva sessió de treball. El que sí és molt recomanable és que facis el add i el commit per cada exercici, doncs et simplificarà molt trobar la solució en cas que tinguis problemes amb un lliurament.

Títol
=====
00_01.Similaritats_i_Diferencies

Autoria
=======
Jeiron Junior Espinal Cruz - 21/09/2024

Introducció 
===========
aquest exercici es tracta de verificar les similaritats i diferencies d'un programa escrit en diferents llenguatges de programació. A més ens permet poder detectar els diferents tipus de llenguatges de programació mitjançant l'estructura de cadascun d'ells.

Pregunta 1. Què fa el programa?
===============================
El programa calcula l'area d'un cercle, partint del radi introduït per l'usuari.

Pregunta 2. Elements comuns
===========================
-Los missatges que es mostren per pantalla estan dins de cometes dobles.
-Gairebé tots tenen la paraula reservat float, menys la versió pseudocodi
-La declaració de area es la mateixa, l'únic que varia és la formula d'obtenir el resultat, encara que sigui el mateix. 

Pregunta 3. Entrada/sortida
===========================
-En la versió de pseudocodi l'entrada se obtiene amb la palabra llegeix i la sortida amb la palabra escriu.
-En la versió C l'entrada se obtiene amb scanf i la sortida amb printf.
-En la versió Python l'entrada se obtiene amb una variable y la paraula reservat input i la sortida amb print.
-En la versío Java l'entrada se obtiene amb un element de java anomenat BufferedReader que se li agrega a una variable, després altre element anomenat InputSreamReader i la sortida amb system.out.print i si vols un salt de linia utilitza system.out.println. 

Pregunta 4. Variables
=====================
-En el pseudocodi estan declarat les variables radi i àrea.
-En C les variables estan declarat amb el tipus de dada.
-En Python les variables poden convertir el tipus de dada a dins del mateix valor.
-En Java a diferència de C les variables es declaren amb el tipus de dada, el nom i el valor.

Pregunta 5. Preferència
=======================
La meva preferencia personal es Python, perquè es un lleguatge que estat aprenent i la seva estructura i sintaxi em semblen més fàcil d'aprendre. però em sembla que Java serà un desafiament per la seva estructura.

Aprenentatge: 
=============
En aquest exercici he aprés a difenciar els llenguatges de programació que he vist, ja que tots tenen una estructura diferent. m'ha sorgit la pregunta que tan dificil és convertir un programa d'un llenguatge a un altre.