.. Enunciat

.. Recorda el codi del programa EndevinaNombre

..     /*

..      * Aquest programa mostra capacitats d'endevinació

..      *

..      * Per executar-ho, fes

..      * $ java EndevinaNombre 42

..      */


..     public class EndevinaNombre {


..         public static void main(String[] args) {


..             int numeroPensat;   // guardarà el número pensat

..             int numero;         // guardarà els càlculs intermitjos


..             // pensa un número

..             numeroPensat = Integer.parseInt(args[0]);

..             System.out.print("El número pensat és ");

..             System.out.println(numeroPensat);


..             // Multiplica'l per 3

..             numero = numeroPensat * 3;

..             System.out.print("Quan el multipliques per 3 obtens ");

..             System.out.println(numero);


..             // Suma-li 6

..             numero = numero + 6;

..             System.out.print("Quan li sumes 6 arriba a ");

..             System.out.println(numero);


..             // divideix-ho tot per 3

..             numero = numero / 3;

..             System.out.print("Un cop dividit per 3 queda ");

..             System.out.println(numero);


..             // resta-li el número pensat

..             numero = numero - numeroPensat;

..             System.out.print("Finalment, en restar-li el valor inicial, queda ");

..             System.out.println(numero);


..             // compara el resultat

..             System.out.println("A que el resultat és 2?");

..         }

..     }

.. Contesta a un document de text les següents preguntes el millor que puguis. Intenta no deixar-ne cap en blanc encara que no ho tinguis del tot clar.

..     A quina línia es declara la variable numero?

..     A quina línia s'inicialitza la variable numero?

..     Si el valor pensat és 10, amb quin valor s'inicialitza la variable numero?

..     La variable numero va canviant de valor durant el programa. Ets capaç d'indicar els diferents valors que va rebent dins del programa quan el numeroPensat és 10? Afegeix la línia en la que pren cada valor.

.. En acabar, no oblidis pujar els canvis a GitHub! Si has oblidat com fer-ho, torna a revisar la guia Com lliurar un exercici

############################################
 Exercici 10_01.Comprensió de EndevinaNombre
############################################

Autoria
=======
Jeiron Junior Espinal Cruz

Introduccio
===========
En aquest exercici vaig a comprendrer el codi, per identificar que es una variable, quan se declara, quan se inicialitza i quan canvia el seu valor.

Preguntes
=========
1.A quina línia es declara la variable numero?
linia 13

2.A quina línia s'inicialitza la variable numero?
linia 21

3.Si el valor pensat és 10, amb quin valor s'inicialitza la variable numero?
30

4.La variable numero va canviant de valor durant el programa. Ets capaç d'indicar els diferents valors que va rebent dins del programa quan el numeroPensat és 10? Afegeix la línia en la que pren cada valor.
linia 21 = 30
linia 26 = 36
linia 31 = 12
linia 38 = 2 mostra el result.

Aprenentatge
============
he après a identificar una variable, quan inicialitza i quan canvia de valor.