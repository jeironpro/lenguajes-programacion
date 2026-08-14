/* Enunciat

Recuperem novament l'exercici que mostrava la secció d'un String i fem-ne la versió modular

El programa MostraInterval farà pràcticament el mateix que la versió original. Considera els canvis a partir d'aquesta nova interacció:

Text?
Java rocks
inici?
5
final?
7
roc

Text?
Java rocks
inici?
7
final?
5
cor

Text?
Java rocks
inici?
5
final?
1000
rocks

És a dir, ara els caràcters resultants apareixen a la mateixa línia.

L'operació de trobar els caràcters dins l'interval la realitzarà una funció anomenada intervalString() amb els paràmetres: la cadena de text corresponent, el valor inicial i el valor final. La funció retornarà la secció corresponent del text.

intervalString() estarà definida dins de UtilString.java i serà una funció pura.
*/

public class MostraInterval {
    public static void main(String[] args) {
        System.out.println("text?");
        String text = Entrada.readLine();

        System.out.println("inici?");
        int inici = Integer.parseInt(Entrada.readLine());

        System.out.println("final?");
        int fi = Integer.parseInt(Entrada.readLine());
        
        System.out.println(UtilString.intervalString(text, inici, fi));
    }
}