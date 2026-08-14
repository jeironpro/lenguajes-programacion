/* Enunciat

En aquest exercici farem la versió flexible de l'exercici anterior, tal i com la vam programar a l'exercici aquest exercici.

Haurem d'ampliar UtilString perquè, a banda de esEnter(String) ofereixi els següents nous mòduls:

public static boolean esEnter(String text, boolean estricte)

public static int aEnter(String text)

public static int aEnter(String text, boolean estricte)

El booleà estricte permetrà parametritzar el comportament d'aquestes dues funcions:

    si estricte és cert

        esEnter(String, boolean) es comporta com esEnter(String)

        aEnter(String, boolean) es comporta igual que Integer.parseInt() de manera que si el text no es pot convertir a enter, simplement petarà el programa com ho faria Integer.parseInt()

        Així, quan se li demani convertir un text que no sigui convertible a enter, aEnter() donarà un error similar a Integer.parseInt(). No pateixis, el prgtest t'indicarà si no ho has fet bé.

    si estricte és fals:

        esEnter(String, boolean) acceptarà com a enters les cadenes acceptades com a enters flexibles.

        aEnter(String, boolean) permetrà convertir a enter, sense donar error, els texts que la nova versió de esEnter() dóna per vàlid.

Nota

Et sorprèn que puguis tenir a l'hora esEnter(String) i esEnter(String, boolean) amb el mateix nom? És una particularitat interessant de llenguatges com Java, anomenada sobrecàrrega o overloading, que veurem amb més detall en el futur.
Què es demana?

Afegeix les dues noves funcions a UtilString.java de manera que prgtest pugui avaluar-les.

El lliurament inclourà la mateixa versió de EsEnter.java que tenia l'exercici anterior.

Finalment, desenvolupa una nova versió del programa EsEnter que es comporti similar a l'exercici anterior. Aquest cop, però, esperarà per línia de comandes (args[0]) la modalitat (els valors "estricte" o "flexible") i actuarà en conseqüència. En cas que la modalitat no sigui un d'aquests valors, finalitzarà l'execució amb un error. Ah! Si no et passen cap modalitat, el teu programa pot donar l'error habitual.

Notes:

    EsEnter no prova aEnter(). Si et cal fer-ho, crea't un altre programa que ho faci.

    esEnter() encara acceptarà com a enters vàlids cadenes que no es poden emmagatzemar en un int. De fet, ni tant sols en un long. Se t'acut alguna manera de fer que quan esEnter() retorni true realment tinguis la confiança de que Integer.parseInt() funcionarà? Si se t'acut, la pots implementar amb tranquil·litat, ja les proves no miren aquesta casuística. Això sí, si ho fas, indica-ho amb un comentari al teu codi i presumeix amb el teu docent ;)
*/

public class EsEnter {
    public static void main(String[] args) {
        if (args.length == 0) { 
            System.out.println("No s'ha especificat cap modalitat");
            return; 
        }
        boolean modalitat = false;

        if (!args[0].equals("estricte") && !args[0].equals("flexible")) {
            System.out.println("Modalidat no reconeguda");
            return;
        }

        if (args[0].equals("estricte")) {
            modalitat = true;
        }

        if (args[0].equals("flexible")) {
            modalitat = false;
        }

        System.out.println("Introdueix texts (enter sol per finalitzar)");

        while (true) {
            String text = Entrada.readLine();

            if (text.isBlank()) break;

            if (UtilString.esEnter(text, modalitat)) {
                System.out.println("És enter");
            } else {
                System.out.println("No és enter");
            }
        }
        System.out.println("Adéu");
    }
}