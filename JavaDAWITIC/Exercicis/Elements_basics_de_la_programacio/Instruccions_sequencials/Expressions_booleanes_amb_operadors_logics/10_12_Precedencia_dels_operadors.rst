.. Enunciat

.. Posa parèntesis i calcula el resultat final de les següents expressions de manera que quedi explícitada la precedència del operadors.

.. Pots fer servir la jshell per comprovar els teus resultats.

..     5 + 4 * 3

..     -5 * 4 + -3

..     true && false || ! true

..     false && (10 > 3) || ! (4 > 5)

..     (false == (5 > 4)) && (false == ! true) || (false != true)

.. Afegeix al menys 2 (dos) noves expressions i els seus resultats, inventades per tu. Intenta que, com a mínim una d'elles contingui operadors lògics.o

.. Pista: La primera es podia resoldre, per exemple:

..     5 + 4 * 3 → 5 + (4 * 3) → 5 + 12 → 17

##########################################
Exercici 10_12. Precedència dels operadors
##########################################

Autoria:
========
Jeiron Junior Espinal Cruz

Introducció:
============
En aquest exercici vaig aprendre a utilitzar les precedències dels operadors.

1. 5 + 4 * 3

5 + 4 * 3 **->** 5 + (4 * 3) **->** 5 + 12 **->** 17

2. -5 * 4 + -3

-5 * 4 + -3 **->** (-5 * 4) + (-3) **->** -20 + -3 **->** -23

3. true && false || ! true

true && false || ! true **->** (true && false) || (! true) **->** false || false **->** false

4. false && (10 > 3) || ! (4 > 5)

false && (10 > 3) || ! (4 > 5) **->** (false && (10 > 3)) || (! (4 > 5)) **->** (false && true) || ! (false) **->** false || true **->** true

5. (false == (5 > 4)) && (false == ! true) || (false != true)

(false == (5 > 4)) && (false == ! true) || (false != true) **->** ((false == (5 > 4))) && ((false == ! true)) || (false != true) **->** (false == true) && (false == false) || false != true **->** false && true || true **->** false || true **->** true

6. true || (4 > 10) && (true == ! true) && (5 < 3)

true || (4 > 10) && (true == ! true) && (5 < 3) **->** true || ((4 > 10) && (true == ! true) && (5 < 3)) **->** true || (false && false && false) **->** true || false **->** true 

7. (42 > 30) || true && (true != false) || (30 > 42)

(42 > 30) || true && (true != false) || (30 > 42) **->** ((42 > 30) || (true && (true != false)) || (30 > 42)) **->** (true || true && true || false) **->** (true || true || false) **->** true || false **->** true

Aprenentatge:
=============
He après a agregar-li parèntesis a les operacions tenint en compte les precedències del operadors.
