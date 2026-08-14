/* Enunciat

Recuperem l'exercici que mostrava una cadena continua i programem la versió modular

El programa CadenaContinua farà el pràcticament el mateix que la versió original però els càlculs els realitzarà una funció anomenada cadenaContinua()

La nova versió, però, serà capaç de controlar el cas en que no introdueixin un número enter per la longitud de la cadena resultant.

Text?
kuruma
Nombre?
vuit
error

Per fer aquesta comprovació, ens vindrà molt bé la utilitat UtilString.esEnter() que hem fet a un exercici anterior. Considera què passava quan ens introduïen un valor que no corresponia a un enter:

jshell> Integer.parseInt("vuit")
|  Exception java.lang.NumberFormatException: For input string: "vuit"
|        at NumberFormatException.forInputString (NumberFormatException.java:65)
|        at Integer.parseInt (Integer.java:652)
|        at Integer.parseInt (Integer.java:770)
|        at (#1:1)

Amb UtilString.esEnter() dient-nos que un valor de text és realment un enter, ja podem fer la conversió amb tranquil·litat.

cadenaContinua() serà una funció pura que requerirà els paràmetres: la cadena de text corresponent i la longitud del text resultant, i estarà definida dins de UtilString.java.
*/

public class CadenaContinua {
    public static void main(String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();
        
        if (!text.isBlank()) {
            System.out.println("Nombre?");
            String nombre = Entrada.readLine();

            if (!UtilString.esEnter(nombre)) {
                System.out.println("error");
                return;
            }
            int nombreEnter = UtilString.aEnter(nombre);
            System.out.println(UtilString.cadenaContinua(text, nombreEnter));
        } else {
            System.out.println("Text buit");
        }
    }
}