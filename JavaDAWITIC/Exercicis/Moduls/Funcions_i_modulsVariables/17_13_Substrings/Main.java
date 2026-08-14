/* Enunciat

La funció String.contains() permet saber si un text està inclòs dins d'un altre. És una funció molt còmoda però té algunes limitacions que intentarem resoldre en aquest exercici.

Les limitacions que adreçarem aquí són:

    La nostra versió haurà de ser capaç d'indicar que un text està dins d'un altre (és substring) independentment de majúscules i minúscules.

    Encara més, la versió que implementarem serà capaç d'acceptar substrings encara que els caràcters no siguin exactament iguals, tot ignorant les variants del català. En concret, les vocals accentuades i la lletra ç. Si vols, pots afegir l'ela geminada (l·l), per afegir-li més dificultat.

Implementarem dues modalitats de la mateixa funció, una d'estricta i una altra de laxa. La primera es comportarà com la funció copiada, mentre que la segona ignorarà majúscules/minúscules i les variants catalanes dels caràcters. Ho faran, seguint les següents signatures:

// retorna cert quan subtext està inclòs extrictament dins de text
public static boolean esSubstring(String text, String subtext, boolean estricte)
// equival a esSubstring(text, subtext, true)
public static boolean esSubstring(String text, String subtext)

El prgtest les provarà amb el següent codi d'exemple:

 // Aquest programa comprova el funcionament de la funció UtilSTring.esSubstring()

 public class Main {

     public static void main(String[] args) {

         System.out.println("Text principal?");

         String principal = Entrada.readLine();

         System.out.println("Subtext?");

         String subtext = Entrada.readLine();

         System.out.println("Estricte?");

         boolean estricte = UtilitatsConfirmacio.respostaABoolean(Entrada.readLine());

         System.out.printf("esSubstring(\"%s\", \"%s\", %b) -> %b%n",

                           principal, subtext, estricte,

                           UtilString.esSubstring(principal, subtext, estricte));

     }

 }

Unes simulacions d'execució de Main:

Text principal?
Skibiditoiletskibidiskibidi
Subtext?
toilet
Estricte?
No
esSubstring("Skibiditoiletskibidiskibidi", "toilet", false) -> true

Text principal?
Skibiditoiletskibidiskibidi
Subtext?
TOILET
Estricte?
No
esSubstring("Skibiditoiletskibidiskibidi", "TOILET", false) -> true

Text principal?
Skibiditoiletskibidiskibidi
Subtext?
toïlet
Estricte?
No
esSubstring("Skibiditoiletskibidiskibidi", "toïlet", false) -> true

Nota: Fixa't en la ï de

Text principal?
Skibiditoiletskibidiskibidi
Subtext?
TOILET
Estricte?
sí
esSubstring("Skibiditoiletskibidiskibidi", "TOILET", true) -> false

Text principal?
Skibiditoiletskibidiskibidi
Subtext?

Estricte?
No
esSubstring("Skibiditoiletskibidiskibidi", "", false) -> true

Text principal?

Subtext?
toilet
Estricte?
No
esSubstring("", "toilet", false) -> false

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
        
        System.out.printf("esSubstring(\"%s\", \"%s\", %b) -> %b%n",
                          principal, subtext, estricte,
                          UtilString.esSubstring(principal, subtext, estricte));
    }
}