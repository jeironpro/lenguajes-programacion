/* Enunciat

Implementa una versió simplificada de la utilitat String.join()

La versió que implementarem oferirà dues versions que permetran indicar o no el darrer separador.

Les signatures a implementar són:

// retorna un String format per les cadenes de text separades pel separador amb darrer separador
public static String junta(String[] cadenes, String separador, String darrerSeparador)
// equivalent a junta(cadenes, separador, separador)
public static String junta(String[] cadenes, String separador)

Pots provar el seu funcionament amb el següent codi d'exemple:

 // Aquest programa comprova el funcionament de la funció UtilSTring.junta()

 public class Main {

     public static void main(String[] args) {

         System.out.println("Separador?");

         String separador = Entrada.readLine();

         System.out.println("Darrer separador?");

         String darrerSeparador = Entrada.readLine();

         System.out.println("Valors:");

         if (args.length > 0) {

             for (int i=0; i < args.length; i++) {

                 System.out.printf("- \"%s\"%n", args[i]);

             }

         } else {

             System.out.println("Cap valor");

         }

         System.out.printf("junta(valors, \"%s\", \"%s\") -> \"%s\"%n",

                             separador, darrerSeparador,

                             UtilString.junta(args, separador, darrerSeparador));

     }

 }

Per exemple:

java Main llet sal mantega
Separador?
,
Darrer separador?
 i
Valors:
- "llet"
- "sal"
- "mantega"
junta(valors, ", ", " i ") -> "llet, sal i mantega"

Per descomptat, no facis servir String.join()!
*/

public class Main {
    public static void main(String[] args) {
     System.out.println("Separador?");
     String separador = Entrada.readLine();
    
     System.out.println("Darrer separador?");
     String darrerSeparador = Entrada.readLine();
    
     System.out.println("Valors:");
     if (args.length > 0) {
         for (int i=0; i < args.length; i++) {
             System.out.printf("- \"%s\"%n", args[i]);
         }
     } else {
         System.out.println("Cap valor");
     }
     System.out.printf("junta(valors, \"%s\", \"%s\") -> \"%s\"%n",
                         separador, darrerSeparador,
                         UtilString.junta(args, separador, darrerSeparador));
    }
}