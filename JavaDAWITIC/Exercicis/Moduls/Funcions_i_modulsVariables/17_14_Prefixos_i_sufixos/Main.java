/* Enunciat

Implementarem ara una nova versió per les utilitats de String: startsWith i endsWith.

Les versions a implementar tindran dues modalitats per permetre indicar si ha de ser estricte o no en el sentit de l'exercici anterior.

Les signatures a implementar són:

// retorna cert quan text comença amb prefix, considerant si ha de ser o no estricte
public static boolean esPrefix(String text, String prefix, boolean estricte)
// equival a esPrefix(text, prefix, true)
public static boolean esPrefix(String text, String prefix)

// retorna cert quan text finalitza amb sufix, considerant si ha de ser o no estricte
public static boolean esSufix(String text, String sufix, boolean estricte)
// equival a esSufix(text, sufix, true)
public static boolean esSufix(String text, String sufix)

Pots provar el seu funcionament amb el següent codi d'exemple:

 // Aquest programa comprova el funcionament de les funció UtilSTring.esPrefix() i esSufix()

 public class Main {

     public static void main(String[] args) {

         System.out.println("Text principal?");

         String principal = Entrada.readLine();

         System.out.println("Subtext?");

         String subtext = Entrada.readLine();

         System.out.println("Estricte?");

         boolean estricte = UtilitatsConfirmacio.respostaABoolean(Entrada.readLine());

         System.out.printf("esPrefix(\"%s\", \"%s\") -> %b%n",

                           principal, subtext, estricte,

                           UtilString.esPrefix(principal, subtext, estricte));

         System.out.printf("esSufix(\"%s\", \"%s\") -> %b%n",

                           principal, subtext, estricte,

                           UtilString.esSufix(principal, subtext, estricte));

     }

 }

Unes simulacions d'execució de Main:

Text principal?
Skibiditoiletskibidiskibidi
Subtext?
skïbidi
Estricte?
No
esPrefix("Skibiditoiletskibidiskibidi", "skïbidi", false) -> true
esSufix("Skibiditoiletskibidiskibidi", "skïbidi", false) -> true

Text principal?
Skibiditoiletskibidiskibidi
Subtext?
skibidi
Estricte?
Sí
esPrefix("Skibiditoiletskibidiskibidi", "skibidi", true) -> false
esSufix("Skibiditoiletskibidiskibidi", "skibidi", true) -> true

Text principal?
Skibiditoiletskibidiskibidi
Subtext?

Estricte?
No
esPrefix("Skibiditoiletskibidiskibidi", "", false) -> true
esSufix("Skibiditoiletskibidiskibidi", "", false) -> true

Text principal?

Subtext?
skibidi
Estricte?
No
esPrefix("", "skibidi", false) -> false
esSufix("", "skibidi", false) -> false

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
        
        System.out.printf("esPrefix(\"%s\", \"%s\", %b) -> %b%n",
                principal, subtext, estricte,
                UtilString.esPrefix(principal, subtext, estricte));
        
        System.out.printf("esSufix(\"%s\", \"%s\", %b) -> %b%n",
                principal, subtext, estricte,
                UtilString.esSufix(principal, subtext, estricte));
    }
}