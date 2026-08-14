.. Enunciat

.. En aquest exercici construiràs expressions de les següents afirmacions.

.. Pots fer servir tots els operadors aritmètics, relacionals i els lògics &&, || i !.

.. En alguns casos, podràs simplificar les expressions fent servir operadors relacionals diferents. Et proposo que incloguis les dues (o més opcions) de manera que practiquis els operadors lògics. Per la mateixa raó, intenta evitar necessitar crear variables temporals.

..     la Clara és més jove que tu

..     la Clara i el Marc són més joves que tu

..     la Clara és més jove que tu i tu ets més jove que el Marc

..     la Clara no és més jove que el Marc

..     no és cert que el Marc sigui més jove que la Clara

..     Ni el Marc és més jove que la Clara ni tu ets més jove que el Marc

..     Tu ets més gran que la Clara i el Marc junts o bé la Clara i el Marc tenen la mateixa edat

.. Afegeix al menys 2 (dos) noves afirmacions de la teva collita i les expressions corresponents. Si ja n'has tingut prou d'edats, pots fer servir altres conceptes com ara la temperatura, el pes…

################################################
Exercici 10_11. Expressions amb operadors lògics
################################################

Autoria:
========
Jeiron Junior Espinal Cruz

Introducció:
============
En aquest exercici vaig aprendre a construir i simplificar expressions amb operadors relacionals i lògics.

1. la Clara és més jove que tu.

edatClara < edatMeva

2. la Clara i el Marc són més joves que tu.

edatClara < edatMeva && edatMarc < edatMeva

3. la Clara és més jove que tu i tu ets més jove que el Marc.

edatClara < edatMeva && edatMeva < edatMarc

4. la Clara no és més jove que el Marc.

edatClara < edatMarc

5. no és cert que el Marc sigui més jove que la Clara.

!(edatMarc < edatClara)

6. Ni el Marc és més jove que la Clara ni tu ets més jove que el Marc.

!(edatMarc < edatClara) && !(edatMeva < edatMarc)

7. Tu ets més gran que la Clara i el Marc junts o bé la Clara i el Marc tenen la mateixa edat.

edatMeva > edatClara && edatMeva > edatMarc || edatClara == edatMarc

8. el meu germà té més pes que jo i el meu germà té menys pes que la meva germana.

pesGerma > pesMeu && pesGerma < pesGermana

9. la temparatura és major a 30 graus o la temperatura és menor a 32 graus

temperatura > 30 || temperatura < 32

Aprenentatge:
=============
He après a construir i simplificar expressions utilitzant els operadors relacionals i lògics.