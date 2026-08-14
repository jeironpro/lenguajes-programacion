.. Enunciat

.. Fent servir taules de veritat, comprova que les següents expressions són equivalents:

..     true && A, A

..     A && A, A

..     A || false, A

..     A || A, A

..     A && false, false

..     A || true, true

..     ! (A && B), !A || !B

..     ! (A || B), !A && !B

.. Per exemple, les primeres expressions es podrien representar en una taula de veritat de la següent manera:

.. true (1)
	
.. A (2)
	
.. true && A (3)

.. cert(1.1)
.. cert (1.2)
	
.. cert (2.1)
.. fals (2.2)

.. cert (3.1)
.. fals (3.2)

.. Així, si ens fixem, la columna A i la columna true && A contenen sempre els mateixos valors. Per tant, són equivalents.

.. Atenció: si se t'ha passat pel cap que true pugui tenir un valor diferent a cert, torna a pensar.

###########################################
Exercici 10_14. Simplificació d'expressions
###########################################

Autoria:
========
Jeiron Junior Espinal Cruz

Introducció:
============
En aquest exercici vaig aprendre a utilitzar les taules de veritat i simplificar les expressions. 

**true && A, A**

==== ===== =========
true A     true && A
==== ===== =========
true true  true
true false false
==== ===== =========

**A && A, A**

===== ===== ======
A     A     A && A
===== ===== ======
true  true  true
true  false false
false true  false
false false false
===== ===== ======

**A || false, A**

===== ===== ==========
A     false A || false
===== ===== ==========
true  false true
false false false
===== ===== ==========

**A || A, A**

===== ===== ======
A     A     A || A
===== ===== ======
true  true  true  
true  false true  
false true  true  
false false false 
===== ===== ======

**A && false, false**

===== ===== ==========
A     false A && false
===== ===== ==========
true  false false
false false false
===== ===== ==========

**A || true, true**

===== ==== =========
A     true A || true
===== ==== =========
true  true true
false true true
===== ==== =========

**! (A && B), !A || !B**

===== ===== ========= ===== ===== ========
A     B     !(A && B) !A    !B    !A || !B
===== ===== ========= ===== ===== ========
true  true  false     false false false 
true  false true      false true  true
false true  true      true  false true
false false true      true  true  true
===== ===== ========= ===== ===== ========

**! (A || B), !A && !B**

===== ===== ========= ===== ===== ========
A     B     !(A || B) !A    !B    !A && !B
===== ===== ========= ===== ===== ========
true  true  false     false false false 
true  false false     false true  false
false true  false     true  false false
false false true      true  true  true
===== ===== ========= ===== ===== ========