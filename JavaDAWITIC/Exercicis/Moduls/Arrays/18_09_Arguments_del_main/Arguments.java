/* Enunciat

T'has plantejat mai de quin tipus és el paràmetre del procediment main() que contenen tants programes que has fet en Java?

public static void main(String[] args)

Sí, és un paràmetre de tipus array de String!

En aquest exercici consisteix en fer un programa que analitzi els arguments que es passen per la línia de comandes i distingeixi si són o no enters.

Considera les següents simulacions;

java Arguments
Cap argument

java Arguments 1
[0] "1": és enter

java Arguments un 2 tres 4
[0] "un": no és enter
[1] "2": és enter
[2] "tres": no és enter
[3] "4": és enter

Aprofita les utilitats que ja has desenvolupat a UtilString.
*/

public class Arguments {
    public static void main(String[] args) {
        if (args.length > 0) {
            for (int i = 0; i < args.length; i++) {
                if (UtilString.esEnter(args[i])) {
                    System.out.println("[" + i + "] " + "\"" + args[i] + "\"" + ": és enter");
                } else {
                    System.out.println("[" + i + "] " + "\"" + args[i] + "\"" + ": no és enter");
                }
            }
        } else {
            System.out.print("Cap argument");
        }
    }
}