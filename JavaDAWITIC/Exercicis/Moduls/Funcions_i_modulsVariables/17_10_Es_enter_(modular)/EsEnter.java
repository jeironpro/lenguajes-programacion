/* Enunciat

Recuperem l'exercici que mostrava si una cadena contenia o no un valor enter i fem-ne la versió modular.

El programa EsEnter farà pràcticament el mateix que la versió original, amb les següents diferències:

    La comprovació de si una cadena correspon o no a un enter, la realitzarà una funció anomenada esEnter(), que rebrà el text corresponent i retornarà un booleà amb el resultat.

    esEnter() estarà definida dins de UtilString.java i serà una funció pura.

    El programa EsEnter indicarà que són enters vàlids aquelles cadenes que la funció esEnter() indiqui que ho són, i també, altres cadenes que esEnter() hagués considerat com a vàlides si ignorés espais en blanc a inici i final de la cadena.

Considera les següents crides a esEnter():

>>> esEnter("123")
true
>>> esEnter("+123")
true
>>> esEnter("-123")
true
>>> esEnter("  123")    // atenció als espais en blanc
false

Considera també el següent exemple d'execució del programa EsEnter:

 Introdueix texts (enter sol per finalitzar)
 123
 És enter
 +123
 És enter
 -123
 És enter
     123
 És enter
 undostres
 No és enter

 Adéu

Pista: Fixa't que EsEnter fa alguna cosa per a aconseguir que la cadena "    123" correspongui a un enter malgrat la funció esEnter(" 123") retorna fals. En aquesta ocasió, pots fer servir utilitats de String per a aconseguir aquest efecte.
*/

public class EsEnter {
    public static void main(String[] args) {
        System.out.println("Introdueix texts (enter sol per finalitzar)");

        while (true) {
            String text = Entrada.readLine();

            if (text.isBlank()) break;

            if (UtilString.esEnter(text)) {
                System.out.println("És enter");
            } else {
                System.out.println("No és enter");
            }
        }
        System.out.println("Adéu");
    }
}