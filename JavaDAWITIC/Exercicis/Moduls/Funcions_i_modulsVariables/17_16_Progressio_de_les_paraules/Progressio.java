/* Enunciat

T'has fixat que les lletres d'algunes paraules estan ordenades de manera creixent segons l'alfabet?

Per exemple, la paraula "amor" comença per 'a', que és anterior a 'm', que a la seva vegada és anterior a 'o', i que també és anterior a 'r'.

Anomenarem creixents a les paraules que presenten aquesta característica.

A partir d'ara, representarem la relació entre les lletres d'una paraula així: 'a' < 'm' < 'o' < 'r'.

Hi ha d'altres paraules que estan ordenades a l'inrevés. Per exemple, la paraula "roma" tindria 'r' > 'o' > 'm' > 'a'. Anomenarem aquestes paraules decreixents.

Encara més, algunes paraules comencen creixents però tot d'una comencen a decrèixer. Per exemple "ameba" comença a crèixer ('a' < 'm') i després decreix amb ('m' > 'e' > 'b' > 'a'). Direm a aquestes paraules creixidecris.

Evidentment, si tenim de creixidecris, també podem pensar en decricreixis. És a dir, paraules que comencen decreixent i tot d'una deixen de decrèixer per acabar creixent. Per exemple, "sonar", comença fent 's' > 'o' > 'n' > 'a' per després crèixer amb 'a' < 'r'.

Quan una paraula no pertany a cap d'aquestes quatre categories, l'anomenarem normaleta.

Fixa't que paraules com "Rússia" serien classificades com a normaletes si fem servir una definició tan estricta. Podem relaxar les definicions anteriors, amb els següents conceptes:

    Podem ignorar majúscules i minúscules.

    Podem considerar només les lletres de l'alfabet català.

    Podem considerar que les vocals amb accents són iguals que la seva corresponent sense accent. Per exemple, 'à' correspondria a 'a'. També, la 'ç' la podríem considerar igual a 'c'.

    Finalment, podríem acceptar que les lletres estiguessin relacionades amb la següent de manera no estricta.

Amb tota aquesta relaxació, "Rússia" seria creixidecri ja que comenca creixent 'R' <= 'ú' i després decreix 'ú' >= 's' >= 's' >= 'i' >= 'a'.

Per poder decidir, peró, la categoria correcta d'una paraula acceptant aquesta relaxació, caldrà que tinguem present que calen com a mínim tres lletres que marquin la progressió. Per exemple, "abb" no permetria saber si estem davant d'una creixent o una creixidecri, mentre que "aba" i "abc" sí.
Què haig de fer?

Desenvolupa el programa Progressio que implementa el patró "lloro" amb finalització de cadena buida. Per cada paraula entrada, indicarà de quin tipus és: creixent, decreixent, creixidecri, decricreixi o normaleta.

En cas que rebi més d'una paraula, el lloro dividirà l'entrada en paraules, tot considerant que les paraules estan separades per espais o tabuladors. Per exemple, per "hola i adèu" es dividiria a priori en tres paraules: "hola", "i" i "adèu".

A l'hora de considerar la categoria d'una paraula, el programa:

    No farà distinció entre majúscules i minúscules.

    En cas d'espais o tabuladors de més, el programa els ignorarà.

    Requerirà que la paraula tingui un mínim de tres lletres de l'alfabet català.

    Només considerarà els caràcters de cada paraula que corresponguin a lletres de l'alfabet català. Per exemple, de l'entrada "1A2ç3ß4ñ!e", el programa classificaria "Açe".

    No farà distinció de les lletres especials catalanes de les corresponents sense "adornaments". Per exemple, considerarà iguals "Adéu" i "adeu". Per simplicitat, s'ignorarà l'el·la geminada i "el·la" serà considerada equivalent a "ella".

Una simulació d'execució.

 Introduïu text. Enter per finalitzar.
 Pera
 "Pera" és normaleta
 Poma
 "Poma" és decreixent
 Pera i poma
 "Pera" és normaleta
 "poma" és decreixent
 i o a!
 Cap paraula vàlida
     Un amor romà
 "amor" és creixent
 "romà" és decreixent
 Matrícula:    4321BCD!
 "Matrícula:" és normaleta
 "4321BCD!" és creixent

 Adéu

Nota: Fixa't que quan una entrada no inclou cap paraula que compleixi els criteris per a ser classificada, el programa ha de retornar "Cap paraula válida".

Progressio farà servir els següents mòduls de la biblioteca UtilString que també hauràs de codificar:

    boolean esCreixent(String text): retorna cert quan el text rebut és creixent esticte. Per exemple:

        jshell> esCreixent("adeu");

1 ==> true

jshell> esCreixent("adéu");    // atenció a l'accent

2 ==> true

jshell> esCreixent("adEu");    // atenció a la majúscula

3 ==> true

jshell> esCreixent(" adeu");   // atenció a l'espai inicial

4 ==> true

jshell> esCreixent("adeu ");   // atenció a l'espai final

5 ==> true

jshell> esCreixent("ad eu");   // atenció a l'espai del mig

6 ==> true

jshell> esCreixent("ab");      // atenció a la longitud

8 ==> false

jshell> esCreixent("a1234Bc"); // atenció als dígits

        9 ==> true

    boolean esDecreixent(String text): retorna cert quan el text és decreixent estricta.

    boolean esCreixiDecri(String test): retorna cert quan el text és decricreixi estricta.

    boolean esDecriCreixi(String test): retorna cert quan el text és creixidecri estricta.

Els mòduls anteriors disposaran d'una versió que permetrà indicar si la seqüència ha de ser o no estricta. Per exemple, la paraula "ella" de manera estricta seria normaleta ja que la primera 'l' no és major ni menor a la segona. En canvi, de manera no estricta seria creixidecri. 'e' <= 'l' <= 'l' i 'l' <= 'l' >= 'a'.

Aquí les signatures:

    boolean esCreixent(String text, boolean estricta): considera la seqüència estricta segons el valor del paràmetre estricta.

    boolean esDecreixent(String text, boolean estricta)

    boolean esCreixiDecri(String test, boolean estricta)

    boolean esDecriCreixi(String test, boolean estricta)

Per passar totes les proves, a més a més, caldrà que evitis utilitzar els mòduls que ofereix String, a banda de length() i charAt(). Per descomptat, pots reprogramar els mòduls de String que et calguin; assegura't però que els noms no coincideixen amb els originals de String, ja que el prgtest no és prou hàbil encara per distingir-los.
*/

public class Progressio {
    public static void main(String[] args) {
        System.out.println("Introduïu text. Enter per finalitzar.");

        while (true) {
            String text = Entrada.readLine();

            if (text.isBlank()) { break; }

            text = UtilString.espaiLletraFinal(text);

            String paraula = "";
            boolean paraulaValida = false;

            for (int i = 0; i < text.length(); i++) {
                char c = text.charAt(i);

                if (!Character.isWhitespace(c)) {
                    paraula += c;
                } else {
                    paraulaValida = validaParaula(paraula);
                    if (paraulaValida) {
                        System.out.println(classificaParaula(paraula));
                    }
                    paraula = "";
                }
            }
            if (!paraulaValida) {
                System.out.println("Cap paraula vàlida");
            }
        }
        System.out.println("Adéu");
    }

    public static boolean validaParaula(String paraula) {
        return UtilString.filtraAlfabetCatala(UtilString.filtraVocalsCatala(paraula)).length() >= 3;
    }

    public static String classificaParaula(String paraula) {
        if (UtilString.esCreixent(paraula)) {
            return "\"" + paraula + "\"" + " és creixent";
        } else if (UtilString.esDecreixent(paraula)) {
            return "\"" + paraula + "\"" + " és decreixent";
        } else if (UtilString.esCreixiDecri(paraula)) {
            return "\"" + paraula + "\"" + " és creixidecri";
        } else if (UtilString.esDecriCreixi(paraula)) {
            return "\"" + paraula + "\"" + " és decricreixi";
        } else {
            return "\"" + paraula + "\"" + " és normaleta";
        }
    }
}