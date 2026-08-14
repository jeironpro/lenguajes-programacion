/* Enunciat

Els Strings de Java en la versió que fem servir en aquest curs, no ofereixen la utilitat count() que en altres llenguatges permet saber quants cops apareix un substring en un string.

Em decidit que això no pot ser, així que farem nosaltres una implementació d'aquesta funció.

La versió que implementarem tindrà dues modalitats que permetran decidir si cal realitzar comparacions estrictes o no en el sentit de l'exercici anterior.

Les signatures a implementar són:

// retorna el nombre d'aparicions del subtext dins del text, considerant si
// ha de ser o no estricte
public static int quants(String text, String subtext, boolean estricte)
// equival a quants(text, subtext, true)
public static int quants(String text, String subtext)

Pots provar el seu funcionament amb el següent codi d'exemple:

 // Aquest programa comprova el funcionament de la funció UtilSTring.quants()

 public class Main {

     public static void main(String[] args) {

         System.out.println("Text principal?");

         String principal = Entrada.readLine();

         System.out.println("Subtext?");

         String subtext = Entrada.readLine();

         System.out.println("Estricte?");

         boolean estricte = UtilitatsConfirmacio.respostaABoolean(Entrada.readLine());

         System.out.printf("quants(\"%s\", \"%s\") -> %b%n",

                           principal, subtext, estricte,

                           UtilString.quants(principal, subtext, estricte));

     }

 }

Unes simulacions d'execució de Main:

Text principal?
Skibiditoiletskibidiskibidi
Subtext?
SKIBÍDI
Estricte?
No
quants("Skibiditoiletskibidiskibidi", "SKIBÍDI", false) -> 3

Text principal?
Skibiditoiletskibidiskibidi
Subtext?
skibidi
Estricte?
sí
quants("Skibiditoiletskibidiskibidi", "skibidi", true) -> 2

Text principal?
Skibídïtoiletskibidískibidi
Subtext?
bïdí
Estricte?
no
quants("Skibídïtoiletskibidískibidi", "bïdí", false) -> 3

Nota: Fixa't en les dièresis i accents.

Text principal?
Skibiditoiletskibidiskibidi
Subtext?

Estricte?
No
quants("Skibiditoiletskibidiskibidi", "", false) -> 0

Text principal?

Subtext?
toilet
Estricte?
No
quants("", "toilet", false) -> 0

Per simplicitat, si la subcadena és buida, retornarà 0 en comptes d'infinit. Confio en que apreciaràs aquesta simplificació ;)

Resol aquest exercici només fent servir mòduls pròpis teus i les funcions bàsiques String.charAt() i String.length().
*/

public class Main {
    public static void main(String[] args) {
        System.out.println("Text principal?");
        String principal = Entrada.readLine();
        
        System.out.println("Subtext?");
        String subtext = Entrada.readLine();
        
        System.out.println("Estricte?");
        boolean estricte = UtilitatsConfirmacio.respostaABoolean(Entrada.readLine());
        
        System.out.printf("quants(\"%s\", \"%s\", %b) -> %d%n",
                principal, subtext, estricte,
                UtilString.quants(principal, subtext, estricte));
    }
}