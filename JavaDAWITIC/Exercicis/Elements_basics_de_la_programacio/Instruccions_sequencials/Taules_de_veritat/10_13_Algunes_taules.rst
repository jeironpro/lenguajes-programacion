.. Enunciat

.. Composa una taula de veritat per cadascuna de les següents afirmacions:

..     la Clara és major d'edat o bé la Clara és més jove que el Marc

..     Al menys un de vosaltres, la Clara, el Marc o tu, és major d'edat

..     la Clara és major d'edat, i tu ets major que el Marc però no major que la Clara

..     Atenció a la coma! Fa de parèntesis per separar la primera subexpressió de la resta!

.. Pots realitzar-les en qualsevol format, fins i tot amb paper i bolígraf, i després lliures una foto.

##############################
Exercici 10_13. Algunes taules
##############################

Autoria:
========
Jeiron Junior Espinal Cruz

Introducció:
============
En aquest exercici vaig aprendre a composar taules de veritat segons el concepte.

**la Clara és major d'edat o bé la Clara és més jove que el Marc**

===== ===== ======
A     B     A || B
===== ===== ======
true  true  true
true  false true 
false true  true
false false false
===== ===== ======

**Al menys un de vosaltres, la Clara, el Marc o tu, és major d'edat**

===== ===== ===== ========== ======
A     B     C     A || B (D) D || c
===== ===== ===== ========== ======
true  true  true  true       true                  
true  true  false true       true
true  false true  true       true
true  false false true       true
false true  true  true       true
false true  false true       true
false false true  false      true
false false false false      false
===== ===== ===== ========== ======

**la Clara és major d'edat, i tu ets major que el Marc però no major que la Clara**

===== ===== ===== ========== =====
A     B     C     B && C (D) A ^ D
===== ===== ===== ========== =====
true  true  true  true       false
true  true  false false      true
true  false true  false      true
true  false false false      true
false true  true  true       true
false true  false false      false
false false true  false      false
false false false false      false
===== ===== ===== ========== =====

Aprenentatge:
=============
He après a composar taules de veritat segons el concepte. (una mica difícil).