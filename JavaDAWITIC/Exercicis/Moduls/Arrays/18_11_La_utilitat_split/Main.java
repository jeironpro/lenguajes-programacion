/* Enunciat

Implementa una versió simplificada de la utilitat String.split()

La versió que implementarem considerarà com a separador els caracters en blanc (Character.isWhitespace()) El resultat serà sempre un array de String i disposarà de dues modalitats que permetran decidir què fer amb els espais en blanc, si incloure'ls o no en el resultat.

Les signatures a implementar són:

// retorna la seqüència de subcadenes de text separades entre caràcters en
// blanc, incloent els caracters en blanc quan inclouBlancs és cert
public static String[] separa(String text, boolean inclouBlancs)
// equival a separa(text, false)
public static String[] separa(String text)

Pots provar el seu funcionament amb el següent codi d'exemple:

 // Aquest programa comprova el funcionament de la funció UtilSTring.separa()

 public class Main {

     public static void main(String[] args) {

         System.out.println("Text principal?");

         String principal = Entrada.readLine();

         System.out.println("Inclou espais?");

         boolean inclouBlancs = UtilitatsConfirmacio.respostaABoolean(Entrada.readLine());

         String[] paraules = UtilString.separa(principal, estricte);

         System.out.printf("separa(\"%s\", %b) ->%n", principal, estricte);

         if (paraules.length > 0) {

             for (int i=0; i < paraules.length; i++) {

                 System.out.printf("- \"%s\"\n", paraules[i]);

             }

         } else {

             System.out.println("Cap resultat");

         }

     }

 }

Unes simulacions d'execució:

Text principal?
Heute ist ein guter Tag um glücklich zu sein
Inclou espais?
No
separa("Heute ist ein guter Tag um glücklich zu sein", false) ->
- "Heute"
- "ist"
- "ein"
- "guter"
- "Tag"
- "um"
- "glücklich"
- "zu"
- "sein"

Text principal?
 Heute ist ein guter Tag um glücklich zu sein
Inclou espais?
Sí
separa("  Heute ist   ein guter Tag um glücklich zu sein", true) ->
- "  "
- "Heute"
- " "
- "ist"
- "   "
- "ein"
- " "
- "guter"
- " "
- "Tag"
- " "
- "um"
- " "
- "glücklich"
- " "
- "zu"
- " "
- "sein"

Fixa't que inclou tots els espais que troba.

Text principal?

Inclou espais?
No
separa("", false) ->
Cap resultat

Per descomptat, no facis servir String.split()! 
*/

public class Main {
    public static void main(String[] args) {
        System.out.println("Text principal?");
        String principal = Entrada.readLine();

        System.out.println("Inclou espais?");
        boolean inclouBlancs = UtilitatsConfirmacio.respostaABoolean(Entrada.readLine());
        
        String[] paraules = UtilString.separa(principal, inclouBlancs);
        System.out.printf("separa(\"%s\", %b) ->%n", principal, inclouBlancs);
        
        if (paraules.length > 0) {
            for (int i=0; i < paraules.length; i++) {
                System.out.printf("- \"%s\"\n", paraules[i]);
            }
        } else {
            System.out.println("Cap resultat");
        }
    }
}