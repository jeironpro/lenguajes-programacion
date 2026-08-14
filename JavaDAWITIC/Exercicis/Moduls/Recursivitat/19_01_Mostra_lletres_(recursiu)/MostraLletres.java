/* Enunciat

Desenvolupa un programa que demani un text i mostri només les lletres d'aquest.

Per fer aquest programa, completa la següent plantilla on no pots afegir cap iterador for/while

//

public class MostraLletres {

    public static void main(String[] args){

        System.out.println("Text?");

        String text = Entrada.readLine();

        mostraLletres(text);

        System.out.println();   // un salt de línia final

    }


    // mostra només les lletres de text

    public static void mostraLletres(String text) {

        if ( // ) {      // cas base

            // XXX

        }


        // hi ha al menys un caràcter. Comptem quantes lletres hi queden


        // considerem el primer caràcter

        char primer = text.charAt(0);

        if (Character.isLetter(primer)) {

            // XXX

        }


        // considerem les lletres que conté la resta del text

        String restaText = //;  // resta del text

        mostraLletres(restaText);      // crida recursiva

    }

}
*/

public class MostraLletres {
    public static void main(String[] args){
        System.out.println("Text?");
        String text = Entrada.readLine();

        mostraLletres(text);
        System.out.println();
    }

    public static void mostraLletres(String text) {
        if (text.isEmpty()) return;

        char primer = text.charAt(0);

        if (Character.isLetter(primer)) {
            System.out.print(primer);
        }

        String restaText = text.substring(1);
        mostraLletres(restaText);
    }
}