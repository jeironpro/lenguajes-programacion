/* Enunciat

Una nova versió del programa enters entre comes

En aquesta ocasió, el programa tindrà les següents modificacions:

    El programa permetrà decidir quin és el caràcter de separació a mostrar entre els valors.

    Per fer-ho, demanarà aquest caràcter i agafarà el primer caràcter que li introdueixin ignorant la resta. En cas que la cadena introduïda sigui buida, considerarà la coma.

    La separació dels valors numèrics, la realitzarà un mòdul amb la següent signatura:

    public static String entreComes(int[], char)

    El primer paràmetre correspon amb l'array d'enters mentre que el segon indica el caràcter de separació entre un valor i el següent.

    Malgrat el nostre programa no ho necessita, entreComes() serà capaç de funcionar correctament quan l'array estigui buit (és a dir, tingui longitud 0)

    Com aquest mòdul pot ser útil en futures ocasions i retorna un String, de moment el posarem a UtilString

    Ja no podem considerar que els valors que ens introdueixin els usuaris seran sempre adequats. Sort que tenim UtilString.esEnter() oi?

Podem seguir considerant que els valors d'entrada seran enters.

Considera les següents simulacions:

Quants?
cinc
Per favor, un valor enter
5
Separador?
; i la resta la pots ignorar
Valor 1?
1
Valor 2?
dos
Per favor, un valor enter
he dit 2
Per favor, un valor enter
2
Valor 3?
3
Valor 4?
4
Valor 5?
5
1; 2; 3; 4; 5

Recomanacions: T'has plantejat com seria d'útil disposar d'un mòdul que se n'encarregués de demanar per un enter fins que introdueixin un? També pot deixar molt net el teu codi si disposes d'un mòdul que se n'encarregui d'obtenir el caràcter de separació.
*/

public class EntersEntreComes {
    public static void main(String[] args) {
        System.out.println("Quants?");
        int valors = nomesEnter(Entrada.readLine());

        System.out.println("Separador?");
        String separador = obtenirSeparador(Entrada.readLine());

        if (valors > 0) {
            int[] numeros = new int[valors];
        
            int numValor = 0;

            while (numValor < valors) { 
                System.out.printf("Valor %d?%n", numValor+1);
                numeros[numValor] = nomesEnter(Entrada.readLine());
                numValor++;
            }
            System.out.println(entreComes(numeros, separador.charAt(0)));
        } else {
            System.out.println("Res a fer");
        }
    }

    public static int nomesEnter(String entrada) {
        if (entrada.isEmpty()) { return 0; }

        while(!UtilString.esEnter(entrada)) {
            System.out.println("Per favor, un valor enter");
            entrada = Entrada.readLine();
        }
        return Integer.parseInt(entrada);
    }

    public static String obtenirSeparador(String entrada) {
        if (entrada.isEmpty()) { return ","; }
        
        String separador = "" + entrada.charAt(0);
        return separador;
    }

    public static String entreComes(int[] numeros, char separador) {
        String numerosSeparat = "";

        numerosSeparat += numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            numerosSeparat += separador + " " + numeros[i];
        }
        return numerosSeparat;
    }
}